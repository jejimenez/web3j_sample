package com;

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
public class HelloWorldJJ extends Contract {
    public static final String BINARY = "0x608060405234801561001057600080fd5b506040518060400160405280600581526020017f576f726c640000000000000000000000000000000000000000000000000000008152506000908051906020019061005c929190610062565b50610107565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100a357805160ff19168380011785556100d1565b828001600101855582156100d1579182015b828111156100d05782518255916020019190600101906100b5565b5b5090506100de91906100e2565b5090565b61010491905b808211156101005760008160009055506001016100e8565b5090565b90565b610718806101166000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80635e5c06e214610046578063c47f002714610103578063ce6d41de146101d6575b600080fd5b6100886004803603602081101561005c57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610259565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156100c85780820151818401526020810190506100ad565b50505050905090810190601f1680156100f55780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6101bc6004803603602081101561011957600080fd5b810190808035906020019064010000000081111561013657600080fd5b82018360208201111561014857600080fd5b8035906020019184600183028401116401000000008311171561016a57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610309565b604051808215151515815260200191505060405180910390f35b6101de610375565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561021e578082015181840152602081019050610203565b50505050905090810190601f16801561024b5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b60016020528060005260406000206000915090508054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103015780601f106102d657610100808354040283529160200191610301565b820191906000526020600020905b8154815290600101906020018083116102e457829003601f168201915b505050505081565b60008082511161031857600080fd5b81600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020908051906020019061036b92919061063e565b5060019050919050565b6060806000600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020805460018160011615610100020316600290049050116103da57600061041a565b600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205b8054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156104ae5780601f10610483576101008083540402835291602001916104ae565b820191906000526020600020905b81548152906001019060200180831161049157829003601f168201915b505050505090506104f46040518060400160405280600681526020017f48656c6c6f200000000000000000000000000000000000000000000000000000815250826104fa565b91505090565b6060808390506060839050606081518351016040519080825280601f01601f19166020018201604052801561053e5781602001600182028038833980820191505090505b5090506060819050600080600091505b85518210156105bc5785828151811061056357fe5b602001015160f81c60f81b83828060010193508151811061058057fe5b60200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a905350818060010192505061054e565b600091505b845182101561062f578482815181106105d657fe5b602001015160f81c60f81b8382806001019350815181106105f357fe5b60200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a90535081806001019250506105c1565b82965050505050505092915050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061067f57805160ff19168380011785556106ad565b828001600101855582156106ad579182015b828111156106ac578251825591602001919060010190610691565b5b5090506106ba91906106be565b5090565b6106e091905b808211156106dc5760008160009055506001016106c4565b5090565b9056fea265627a7a723158209d27e2cd37faa4e0e798e5ce1da9c42e67d3984d17b4a1ab08f496346d75638564736f6c63430005100032";

    public static final String FUNC_ACCOUNTS = "accounts";

    public static final String FUNC_GETMESSAGE = "getMessage";

    public static final String FUNC_SETNAME = "setName";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
        _addresses.put("3", "0x51bD05DE4A6428c7E2A6eF251844C8e8075e8AFf");
    }

    @Deprecated
    protected HelloWorldJJ(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected HelloWorldJJ(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected HelloWorldJJ(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected HelloWorldJJ(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> accounts(String param0) {
        final Function function = new Function(FUNC_ACCOUNTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> getMessage() {
        final Function function = new Function(FUNC_GETMESSAGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setName(String name) {
        final Function function = new Function(
                FUNC_SETNAME, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static HelloWorldJJ load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new HelloWorldJJ(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static HelloWorldJJ load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new HelloWorldJJ(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static HelloWorldJJ load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new HelloWorldJJ(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static HelloWorldJJ load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new HelloWorldJJ(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<HelloWorldJJ> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(HelloWorldJJ.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<HelloWorldJJ> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(HelloWorldJJ.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<HelloWorldJJ> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(HelloWorldJJ.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<HelloWorldJJ> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(HelloWorldJJ.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
