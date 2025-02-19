package com.learn.it.designpatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {

	private List<ChatUser> chatUsers;

	public ChatRoom() {
		this.chatUsers = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, ChatUser senderChatUser) {

		if (!this.chatUsers.isEmpty()) {
			for (ChatUser chatUser : this.chatUsers) {
				if (senderChatUser != chatUser) {
					chatUser.receiveMessage(message, senderChatUser);
				}
			}
		}
	}

	@Override
	public void addUser(ChatUser chatUser) {
		this.chatUsers.add(chatUser);
	}

}
