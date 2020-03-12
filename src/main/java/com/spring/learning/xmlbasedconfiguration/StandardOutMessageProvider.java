package com.spring.learning.xmlbasedconfiguration;

public class StandardOutMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World!";
	}

}
