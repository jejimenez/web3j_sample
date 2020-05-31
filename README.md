# web3j_sample




Commands to install tools, create truffle project and deploy contract

curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.35.3/install.sh | bash

nvm

nvm install v12.16.3

nvm use v12.16.3

nvm list

nvm alias default v12.16.3 

nvm list

nvm alias node v12.16.3 

nvm alias stable v12.16.3 

nvm list

node --version

truffle compile

npm install -g truffle

npm install --save @truffle/hdwallet-provider

npm fund

curl -L https://get.web3j.io | sh


truffle init

***** Copy and paste the contracts/.sol contract file


truffle compile

truffle migrate -f 2 --network rinkeby

truffle migrate -f 2 --network ropsten

history

source ~/.bash_profile

sudo web3j truffle generate  ./build/contracts/SaidHelloJJ.json -o ./javacontract -p com

truffle console

HelloWorldJJ.deployed().then(function(cinstance){cinstance.saySomethingElse("okkkkkk").then(function(v){console.log(v)})})

SaidHelloJJ.deployed().then(function(cinstance){cinstance.speak().then(function(v){console.log(v)})})

export PRIV_KEY_CONTRACT=<PRIVATE_KEY_OF_ACCOUNT_USED_TO_CREATE_THE_CONTRACT>

export ETHEREUM_NODE=<ETHEREUM NODE ADDRESS>