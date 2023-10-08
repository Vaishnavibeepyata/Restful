package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloWorldController {
	
	private MessageSource messagesource;
	public HelloWorldController ( MessageSource messagesource) {
		this.messagesource=messagesource;
	}
	
@GetMapping(path="/hello-world")
public String helloWorld() {
	return "Hello world";
}

@GetMapping(path="/hello-world-bean")
public HelloWorldBean helloWorldBean() {
	return new HelloWorldBean("helloworld");
}

@GetMapping(path="/hello-world/path-variable/{name}")
public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
	return new HelloWorldBean(String.format("Hello world , %s", name));
}
@GetMapping(path="/hello-world-internationalized")
public String helloWorldInternationalized() {
	Locale locale= LocaleContextHolder.getLocale();
	return messagesource.getMessage("good.morning.message", null, "Default Message", locale);

}
}
