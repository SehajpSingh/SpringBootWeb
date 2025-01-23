package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * @Controller tells spring you need to manage this 
 */
@Controller
public class LoginController {
	
	@RequestMapping("login")
	public String gotoLoginPage() {
		return "login";
	}
}
