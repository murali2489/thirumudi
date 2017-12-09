package com.cxf.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebService;
 
@WebService(endpointInterface="com.cxf.helloworld.HelloWorldInterface",serviceName="bookShelfService")
public class HelloWorld implements HelloWorldInterface {

	@WebMethod
	public String SayHello() {
		
		return null;
	}

}
