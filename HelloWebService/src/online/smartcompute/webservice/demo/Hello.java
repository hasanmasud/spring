package online.smartcompute.webservice.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "HelloService")
public class Hello {

	@WebMethod
	public String sayHello() {
		return "Hello World";
	}

}
