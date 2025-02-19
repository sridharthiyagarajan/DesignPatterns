package com.learn.it.designpatterns.behavioural.mediator;

public class MediatorMain {

	public static void main(String[] args) {

		ChatMediator chatMediator = new ChatRoom();

		ChatUser dhileepChatUser = new ChatUser("Dhileep", chatMediator);
		ChatUser sakthiChatUser = new ChatUser("Sakthi", chatMediator);
		ChatUser arulChatUser = new ChatUser("Arul", chatMediator);

		chatMediator.addUser(arulChatUser);
		chatMediator.addUser(sakthiChatUser);
		chatMediator.addUser(dhileepChatUser);

		dhileepChatUser.sendMessage("Hello All!");
	}

}
