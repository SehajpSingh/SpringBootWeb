package com.in28minutes.springboot.myfirstwebapp.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//not adding this @Controller will throw error
//@Controller means this is web page
@Controller
public class SayHelloController {
	
	//@ResponsBody will send the string as it is to the browser
	//otherwise will throw the error 
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! what are you doing?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	/*
    say Hello.jsp will be used 
	spring.mvc.view.prefix=/WEB-INF/jsp/
	spring.mvc.view.suffix=.jsp
	these two files prefix and suffix will be used
	from application folder
	it will take sayHello from this return statement
	and then add prefix, suffix to it
	
	no use of @ResponseBody because we are rendering "sayHello" 
	on the screen, this annotation is used to print as it is 
	 */
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
