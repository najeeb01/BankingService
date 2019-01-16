package com.Banking.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankServices")
public class myController {
    
	//Test Method
	@RequestMapping("/test")
    public String printMessage() {
         return "Test Method Working";
    }
}
