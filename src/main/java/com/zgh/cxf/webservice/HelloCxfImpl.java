package com.zgh.cxf.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.zgh.cxf.webservice.IHelloCxf", serviceName = "HelloCxf")
public class HelloCxfImpl implements IHelloCxf {
	public String getMessage(String msg) {
		return "Server - " + msg;
	}
}
