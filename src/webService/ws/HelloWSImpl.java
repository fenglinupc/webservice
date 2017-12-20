package webService.ws;

import javax.jws.WebService;

@WebService
public class HelloWSImpl implements HelloWS {

    public String sayHello(String name) {
	// TODO Auto-generated method stub
	System.out.println("server sayHello()"+name);
	return "Hello"+name;
    }

}
