package com.microcare.nasscom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Component
public class RegisterInterceptorExample extends WebMvcConfigurerAdapter  {
	@Autowired
	APIInterceptor apiInterceptor;
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(apiInterceptor);
	} 
}
