package com.sis.spring.soap.api.service;

import org.springframework.stereotype.Service;

import com.sis.spring.soap.receiveexternalpositions.ReceiveExternalPositionsRequest;
import com.sis.spring.soap.receiveexternalpositions.ReceiveExternalPositionsResponse;

@Service
public class ReceiveExternalPositionsService {
	
	public ReceiveExternalPositionsResponse response (ReceiveExternalPositionsRequest request){
		ReceiveExternalPositionsResponse response = new ReceiveExternalPositionsResponse();
		String responseString  =  response.getMessage();
		
		
		//userName Validation
		if (request.getUserName() == null) {
			responseString = "Error, ingrese un usuario valido";						
		}else if (request.getUserName().equals("")) {
			responseString = "Error, ingrese un usuario valido";						
		}else if (request.getUserName().equals("?"))
			responseString = "Error, ingrese un usuario valido";	
		
		//key Validation
		if (request.getKey() == null) {
			responseString = "Error, ingrese un key valido";						
		}else if (request.getKey().equals("")) {
			responseString = "Error, ingrese un key valido";						
		}else if (request.getKey().equals("?"))
			responseString = "Error, ingrese un key valido";	
		
		//vehicleAlias Validation
		if (request.getVehicleAlias() == null) {
			responseString = "Error, ingrese un vehiculo valido";						
		}else if (request.getVehicleAlias().equals("")) {
			responseString = "Error, ingrese un vehiculo valido";						
		}else if (request.getVehicleAlias().equals("?"))
			responseString = "Error, ingrese un vehiculo valido";
		
		//vehicleId Validation
		if (request.getVehicleId() == null) {
			responseString = "Error, ingrese un vehiculo valido";						
		}else if (request.getVehicleId().equals("")) {
			responseString = "Error, ingrese un vehiculo valido";						
		}else if (request.getVehicleId().equals("?"))
			responseString = "Error, ingrese un vehiculo valido";	
		
		//event Validation
		if (request.getEvent() == null) {
			responseString = "Error, ingrese un evento valido";						
		}else if (request.getEvent().equals("")) {
			responseString = "Error, ingrese un evento valido";						
		}else if (request.getEvent().equals("?"))
			responseString = "Error, ingrese un evento valido";	
		
		return response;
	}

}
