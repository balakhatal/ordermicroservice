package com.bal.ordermicroservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="ecommerce")
public class OrderController {
	
	@RequestMapping(value="/order/getmessage",method = RequestMethod.GET)
	public String getMessage()
	{
		return "order is logged";
	}

}
