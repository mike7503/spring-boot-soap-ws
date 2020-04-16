package com.sis.spring.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.sis.spring.soap.api.service.ReceiveExternalPositionsService;
import com.sis.spring.soap.receiveexternalpositions.ReceiveExternalPositionsRequest;
import com.sis.spring.soap.receiveexternalpositions.ReceiveExternalPositionsResponse;

@Endpoint
public class ReceiveExternalPositionsServiceEndPoint {
	
	private static final String NAMESPACE= "http://www.example.org/receiveExternalPositions";
	@Autowired
	private  ReceiveExternalPositionsService service;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "receiveExternalPositionsResponse")
	@ResponsePayload
	public ReceiveExternalPositionsResponse getResponse (@RequestPayload ReceiveExternalPositionsRequest request) {
		return service.response(request);
		
	}
	
	

}
