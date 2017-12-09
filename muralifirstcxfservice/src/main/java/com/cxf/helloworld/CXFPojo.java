package com.cxf.helloworld;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SayHitotheworld")
public class CXFPojo {
	
	private String Message;

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public CXFPojo(String message) {
		super();
		Message = message;
	}

	public CXFPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
