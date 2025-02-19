package com.learn.it.designpatterns.behavioural.mediator;

public class ChatUser {

	private String name;

	private ChatMediator chatMediator;

	public ChatUser(String name, ChatMediator chatMediator) {
		this.name = name;
		this.chatMediator = chatMediator;
	}

	public String getName() {
		return name;
	}

	public ChatMediator getChatMediator() {
		return chatMediator;
	}

	public void receiveMessage(String message, ChatUser sender) {
		System.out.println(String.format("%s have received the message %s from the sender %s.", this.getName(), message,
				sender.getName()));
	}

	public void sendMessage(String message) {
		getChatMediator().sendMessage(message, this);
	}

	@Override
	public String toString() {
		return "ChatUser [name=" + name + "]";
	}

}
