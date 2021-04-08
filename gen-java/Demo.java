import UserService.*;
import User.*;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
 
//import com.intyt.thrift.client.User;
//import com.intyt.thrift.client.UserService;
 
public class Demo {
	
	public void start(){
		try {
			
			 String ip = "10.128.0.12"; //server ip
			 int port = 9090; // port
			
			TTransport socket = new TSocket(ip,port);
			TProtocol protocol = new TCompactProtocol(socket);
	        UserService.Client client = new UserService.Client(protocol);
	        socket.open();
	        
            User u = new User();  
            u.uid="003";  
            u.uname="dengqs_test";  
            u.usex=true;  
            u.uage=3;
            client.add(u);
            
            System.out.println(client.get(u.uid));  
            socket.close(); 
		}catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {  
            e.printStackTrace();  
        }
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.start();
	}
 
}
