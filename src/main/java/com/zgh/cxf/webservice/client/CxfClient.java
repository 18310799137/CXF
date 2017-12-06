package com.zgh.cxf.webservice.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.zgh.cxf.webservice.IHelloCxf;

public class CxfClient {

	public static void main(String[] args) throws Exception {

		// 调用WebService

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(IHelloCxf.class);

		factory.setAddress("http://localhost:8080/CXF/services/HelloCxfService?wsdl");

		IHelloCxf service = (IHelloCxf) factory.create();

		System.out.println("result:" + service.getMessage(" Hi !I'm client"));

	}

}
