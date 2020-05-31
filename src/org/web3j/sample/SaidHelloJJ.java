package org.web3j.sample;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.16.
 */
@SuppressWarnings("rawtypes")
public class SaidHelloJJ extends Contract {
    public static final String BINARY = "0x608060405234801561001057600080fd5b506040518060400160405280600c81526020017f48656c6c6f20576f726c642100000000000000000000000000000000000000008152506000908051906020019061005c929190610062565b50610107565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100a357805160ff19168380011785556100d1565b828001600101855582156100d1579182015b828111156100d05782518255916020019190600101906100b5565b5b5090506100de91906100e2565b5090565b61010491905b808211156101005760008160009055506001016100e8565b5090565b90565b61032f806101166000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806350d853151461003b578063b07d7e39146100be575b600080fd5b610043610191565b6040518080602001828103825283818151815260200191508051906020019080838360005b83811015610083578082015181840152602081019050610068565b50505050905090810190601f1680156100b05780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b610177600480360360208110156100d457600080fd5b81019080803590602001906401000000008111156100f157600080fd5b82018360208201111561010357600080fd5b8035906020019184600183028401116401000000008311171561012557600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610233565b604051808215151515815260200191505060405180910390f35b606060008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156102295780601f106101fe57610100808354040283529160200191610229565b820191906000526020600020905b81548152906001019060200180831161020c57829003601f168201915b5050505050905090565b6000816000908051906020019061024b929190610255565b5060019050919050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061029657805160ff19168380011785556102c4565b828001600101855582156102c4579182015b828111156102c35782518255916020019190600101906102a8565b5b5090506102d191906102d5565b5090565b6102f791905b808211156102f35760008160009055506001016102db565b5090565b9056fea265627a7a7231582012cc065e58e59badf07a0c866123db16a4007fe7b81e4304db41a226452f247b64736f6c63430005100032";

    public static final String FUNC_SPEAK = "speak";

    public static final String FUNC_SAYSOMETHINGELSE = "saySomethingElse";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
        _addresses.put("3", "0xf8A9c12e6D2e86170C29A6A228fc48731b7180Ff");
    }

    @Deprecated
    protected SaidHelloJJ(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected SaidHelloJJ(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected SaidHelloJJ(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected SaidHelloJJ(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> speak() {
        final Function function = new Function(FUNC_SPEAK, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> saySomethingElse(String newSaying) {
        final Function function = new Function(
                FUNC_SAYSOMETHINGELSE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(newSaying)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static SaidHelloJJ load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SaidHelloJJ(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static SaidHelloJJ load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SaidHelloJJ(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static SaidHelloJJ load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new SaidHelloJJ(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SaidHelloJJ load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new SaidHelloJJ(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<SaidHelloJJ> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(SaidHelloJJ.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<SaidHelloJJ> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(SaidHelloJJ.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<SaidHelloJJ> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(SaidHelloJJ.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<SaidHelloJJ> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(SaidHelloJJ.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
