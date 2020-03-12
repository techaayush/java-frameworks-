package com.spring.learning.xmlbasedconfiguration;

public interface MessageRenderer {
	void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
