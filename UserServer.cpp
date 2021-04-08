// This autogenerated skeleton file illustrates how to build a server.
// You should copy it to another filename to avoid overwriting it.

#include <string>
#include <iostream> 
#include "UserService.h" 
#include <config.h>   
#include <protocol/TCompactProtocol.h>  
#include <server/TSimpleServer.h>  
#include <transport/TServerSocket.h>  
#include <transport/TBufferTransports.h>  
#include <concurrency/ThreadManager.h>  
#include <concurrency/PosixThreadFactory.h>  
#include <server/TThreadPoolServer.h>  
#include <server/TThreadedServer.h>  

using namespace ::apache::thrift;
using namespace ::apache::thrift::protocol;
using namespace ::apache::thrift::transport;
using namespace ::apache::thrift::server;
using namespace ::apache::thrift::concurrency;  

using boost::shared_ptr;
using namespace std; 

class UserServiceHandler : virtual public UserServiceIf {
 public:
  UserServiceHandler() {
    // Your initialization goes here
  }

  void add(const User& u) {
    // Your implementation goes here
    printf("add\n");
  }

  void get(User& _return, const std::string& uid) {
    // Your implementation goes here
    _return.uid = "001";
    _return.uname = "dengqs";
    _return.usex = 1;
    _return.uage = 3;
    cout << "uid = " << _return.uid << endl;
    cout << "call get method" << endl;
  }

};

int main(int argc, char **argv) {
  int port = 9090;
  shared_ptr<UserServiceHandler> handler(new UserServiceHandler());
  shared_ptr<TProcessor> processor(new UserServiceProcessor(handler));
  shared_ptr<TServerTransport> serverTransport(new TServerSocket(port));
  shared_ptr<TTransportFactory> transportFactory(new TBufferedTransportFactory());
  shared_ptr<TProtocolFactory> protocolFactory(new TBinaryProtocolFactory());
  
  shared_ptr<ThreadManager> threadManager = ThreadManager::newSimpleThreadManager(10);
  shared_ptr<PosixThreadFactory> threadFactory = shared_ptr<PosixThreadFactory>(new PosixThreadFactory());
  threadManager->threadFactory(threadFactory);
  threadManager->start();
  threadManager->start();  

  TSimpleServer server(processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
  return 0;
}
