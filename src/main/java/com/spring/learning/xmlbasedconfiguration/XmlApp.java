package com.spring.learning.xmlbasedconfiguration;

import org.springframework.context.support.GenericXmlApplicationContext;


public class XmlApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("application-context/xml-application-context.xml");
		context.refresh();

		// retrieve bean from spring container
		StandardOutMessageRenderer messageRenderer = context.getBean("renderer",StandardOutMessageRenderer.class);

		// call methods on the bean
//		messageRenderer.render();
		
		System.out.println(messageRenderer.getMessage());

		// close the context
		context.close();

	}
}
