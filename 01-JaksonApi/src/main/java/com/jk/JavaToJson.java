package com.jk;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * This class used for converting java object to json
 * This mapper (or, data binder, or codec) provides functionality for
 * converting between Java objects and matching JSON constructs.
 * 
 * @author Prameshwar  @ 21-feb-2019
 * 
 */

public class JavaToJson {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEmpId(101);
		e.setEmpNmae("param jadhav");
		e.setEmpSal(5.0);
		e.setPwd("Param@123");
		
		//printing Employee object 
		System.out.println(e);
		
		// creating object mapper for for converting java to json
		try{
			ObjectMapper om = new ObjectMapper();
			
			//converting Employee java object to json format
			String jsonObj = om.writeValueAsString(e);
			
			//printing Employee json object 
			System.out.println(jsonObj);
			
			//json to java Employee Object
			Employee e1=new Employee();
			e1=om.readValue(jsonObj,Employee.class);
			//printing Employee e1 object 
			System.out.println(e1);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
 
}
