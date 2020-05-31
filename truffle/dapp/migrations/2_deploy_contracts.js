
var HelloWorldJJ = artifacts.require("HelloWorldJJ");
var SaidHelloJJ = artifacts.require("SaidHelloJJ");
module.exports = function(deployer) {
  deployer.deploy(HelloWorldJJ);
  deployer.deploy(SaidHelloJJ);
};
