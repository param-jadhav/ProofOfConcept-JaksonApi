package com.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class AppTest {

	public static void main(String[] args) {
		String URL="http://localhost:8089/ProviderApplication/rest/Message";
		
		// 1.create an empty Client object 
		Client c = Client.create();
		
		// 2.add URL to Client, get WebResource 
		WebResource wr = c.resource(URL);
		
		// 3. make request call, get Client response
		ClientResponse cr = wr.get(ClientResponse.class);
		
		// 4. read entity from cr object
		String str = cr.getEntity(String.class);
		
		// 5.print entity
		System.out.println(str);
		
		// 6.print extra details 
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		
	}
}
