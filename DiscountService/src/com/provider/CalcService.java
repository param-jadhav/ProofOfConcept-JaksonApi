package com.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/CalcService")
public class CalcService {
	private static final String YOUR_DISCOUNT_IS = "Your Discount is : ";
	private static final String YOUR_FINAL_COST_IS="your final cost is : ";

	@GET
	public String dicountOnMrp(@QueryParam("mrp") double amt) // less 100 , >=1000 <=5000 ->10% || amt > 5000 <=15000
																// ->20%
	// amt>15000 ->25
	{
		double finalCost=0.0;
		double discount=0.0;
		String msg = null;
		if (amt >=1000 && amt <=5000) {
			discount = amt / 10;
			finalCost = amt - discount;
			msg = YOUR_DISCOUNT_IS + String.valueOf(discount)+": " + YOUR_FINAL_COST_IS + String.valueOf(finalCost);
		} else if (amt > 5000 && amt < 15000) {
			discount = amt / 20;
			finalCost = amt - discount;
			msg = YOUR_DISCOUNT_IS + String.valueOf(discount)+": " + YOUR_FINAL_COST_IS + String.valueOf(finalCost);
		} else if (amt >=15000) {
			discount = amt / 25;
			finalCost = amt - discount;
			msg = YOUR_DISCOUNT_IS + String.valueOf(discount)+": "+ YOUR_FINAL_COST_IS + String.valueOf(finalCost);
		}
		else {
			finalCost = amt - discount;
			msg="Sorry Discount is not applied: " + String.valueOf(discount)+": "+ YOUR_FINAL_COST_IS+ String.valueOf(finalCost);
		}
		return msg;
	}
}
