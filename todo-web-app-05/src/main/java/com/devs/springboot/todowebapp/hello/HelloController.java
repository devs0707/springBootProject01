package com.devs.springboot.todowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HelloController {

	@RequestMapping ("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping ("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("	<head> ");
		sb.append("		<title> My First HTML Page</title>");
		sb.append("	</head>");
		sb.append("	<body>");
		sb.append("		My First HTML Page with Body");
		sb.append("	</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	// /src/main/resources/static/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping ("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
