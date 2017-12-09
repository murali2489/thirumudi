package com.cxf.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorldInterface {

	@WebMethod 
	public String SayHello();
	
}
