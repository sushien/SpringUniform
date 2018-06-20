package com.uniform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.uniform.model.*;

@Controller
@RequestMapping("/school/uniform_data")
public class JSONController {

	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody UniformData getShopInJSON(@PathVariable String name) {

		UniformData u = new UniformData();
		u.setStudent_Name(name);
		u.setSchool_Name("orchid");
		
		return u;

	}
	
}
