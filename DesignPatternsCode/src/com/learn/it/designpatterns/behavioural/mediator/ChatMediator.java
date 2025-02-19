package com.learn.it.designpatterns.behavioural.mediator;

public interface ChatMediator {

	void sendMessage(String message, ChatUser senderChatUser);

	void addUser(ChatUser chatUser);
}
