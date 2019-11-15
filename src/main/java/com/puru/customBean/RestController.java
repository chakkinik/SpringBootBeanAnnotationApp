package com.puru.customBean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	
	//@RequestMapping( value= "/sayHello", method=RequestMethod.GET,  headers = "Accept=application/json")

	@GetMapping("/hello")
	@ResponseBody
	public String getMeHello() {
		return "hello world";
	}

}
