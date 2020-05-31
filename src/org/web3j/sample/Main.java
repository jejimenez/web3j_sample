package org.web3j.sample;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidParameterException;
import java.util.Scanner;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;

public class Main {

  public static void main(String[] args) {
	  
	// Read contract private key of adderss used to deploy the contract
	//String contractAddress = System.getenv("CONTRACT_ADDRESS");
	String pkContract = System.getenv("PRIV_KEY_CONTRACT");
	String ethNode = System.getenv("ETHEREUM_NODE");

	//if (contractAddress == null)
	//	throw new InvalidParameterException("The environment variable with private key CONTRACT_ADDRESS is not setted");
	if (pkContract == null)
		throw new InvalidParameterException("The environment variable with private key PRIV_KEY_CONTRACT is not setted");
	if (ethNode == null)
		throw new InvalidParameterException("The environment variable with private key ETHEREUM_NODE is not setted");

	// Connect to network node
	Web3j web3 = getWeb3j(ethNode);
	if (web3 == null)
    	throw new RuntimeException("Cannot stablish connection to Ethereum Node:.");
	
    try {
        String account = "0x22cc92A8050627418264C4679885c88C4601990E";

        EthGetBalance ethBal = web3.ethGetBalance(account, DefaultBlockParameterName.LATEST).send();
        BigInteger wei = ethBal.getBalance();
        System.out.println("Account Balance weis > "+wei);

        
        Credentials cred = Credentials.create(pkContract);
        
        DefaultGasProvider gp = new DefaultGasProvider() {
    	    @Override
    	    public BigInteger getGasPrice(String contractFunc) {
    	        switch (contractFunc) {
    	            case SaidHelloJJ.FUNC_SPEAK: return BigInteger.valueOf(22_000_000_000L);
    	            case SaidHelloJJ.FUNC_SAYSOMETHINGELSE: return BigInteger.valueOf(44_000_000_000L);
    	            default: throw new RuntimeException();
    	        }
    	    }

    	    @Override
    	    public BigInteger getGasLimit(String contractFunc) {
    	        switch (contractFunc) {
    	            case SaidHelloJJ.FUNC_SPEAK: return BigInteger.valueOf(4_300_000);
    	            case SaidHelloJJ.FUNC_SAYSOMETHINGELSE: return BigInteger.valueOf(5_300_000);
    	            default: throw new RuntimeException();
    	        }
    	    }
    	};
    	
    	String contractAddress = SaidHelloJJ._addresses.values().stream().findFirst().get();
    	
     	SaidHelloJJ registryContract = SaidHelloJJ.load(contractAddress,web3, cred, gp);
        
    	try {
    		
			String msg = registryContract.speak().send();
			System.out.println("El mensaje es:'"+msg+"'");

			System.out.println("Ingrese el nuevo valor para el mensaje en el contrato:");

			Scanner in = new Scanner(System.in);        
			String s = in.nextLine();
	        in.close();
			System.out.println("Enviando transaccion...");
			TransactionReceipt msg2 = registryContract.saySomethingElse(s).sendAsync().get();
			String txHash = msg2.getTransactionHash();
			System.out.println(txHash);
			
		} catch (Exception e) {
		      throw new RuntimeException("Error calling getMessage: ", e);
		}
    	
        
    } catch (IOException ex) {
        throw new RuntimeException("Error whilst sending json-rpc requests", ex);
      }
      
  }
  
	private static Web3j getWeb3j(String ethNode) {
		Web3j web3j;
		try {
			web3j = Web3j.build(new HttpService(ethNode));// Web3j web3 = Web3j.build(new HttpService("http://localhost:8545"));
			// this will cause the exception if web3j is not connected
			System.out.println("Connected To Eth Node >>"+web3j.web3ClientVersion().send().getWeb3ClientVersion());
		} catch (Exception e) {
			throw new RuntimeException("Error when trying to connect to Ethereum Node: ", e);
		}
		return web3j;
	}

}
