package com.bot.challenge;

import java.io.IOException;

import argo.saj.InvalidSyntaxException;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

public class Challenge {

	User player1;
	User player2;
	JDA bot;
	MessageChannel channel;
	
	public Challenge(User p1, User p2, MessageChannel ch, JDA self, int cat) throws IOException, InvalidSyntaxException {
		player1 = p1;
		player2 = p2;
		channel = ch;
		bot = self;
		bot.addEventListener(new ChalListener(player1, player2, channel, bot, cat));
	}
}
