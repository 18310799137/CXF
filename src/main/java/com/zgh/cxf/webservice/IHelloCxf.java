package com.zgh.cxf.webservice;

import javax.jws.WebService;  

@WebService
public interface IHelloCxf {
	
	public String getMessage(String msg);
	
}
