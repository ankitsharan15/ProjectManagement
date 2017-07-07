package com.projectmanagement.CodeNinja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/bugsmanagement")
public class CodeNinjaController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index(){
    	return "index.html";
    }
	
}
