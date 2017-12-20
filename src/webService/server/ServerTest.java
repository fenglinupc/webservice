package webService.server;

import javax.xml.ws.Endpoint;

import webService.ws.HelloWSImpl;


/*
 * 发布webService
 */

public class ServerTest {
    
    public static void main(String[] args){
	
	String address = "http://127.0.0.1/webservice/ws/hellows";
	Endpoint.publish(address, new HelloWSImpl());
	System.out.println("发布webSservice成功");
    } 
}
