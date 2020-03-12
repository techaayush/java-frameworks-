package com.spring.learning.xmlbasedconfiguration;

public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider;
	
	private String message;
	
	// constructor dependency injection
	
	//		public StandardOutMessageRenderer(MessageProvider provider) {
	//			this.messageProvider = provider;
	//		}
	
	// constructor literal injection
	
	public StandardOutMessageRenderer(String message) {
		System.out.println("called");
		this.message = message;
	}
	
	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
					"You must set the property messageProvider of class:" + StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}
	
	
	// setter injection
	
	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}
	
	public String getMessage() {
		return message;
	}

}
