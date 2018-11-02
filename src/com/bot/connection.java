package com.bot;

import javax.security.auth.login.LoginException;

import com.bot.api.getQ;
import com.bot.commands.CommandListener;

import argo.saj.InvalidSyntaxException;
import net.dv8tion.jda.core.entities.Game;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.hooks.InterfacedEventManager;

public class connection {
	
	final static Game game = Game.playing("Get Thinking! (Beta)");
	final static String token = "///";

    public static void main(String[] args) throws LoginException, IOException, InvalidSyntaxException {
        new JDABuilder(AccountType.BOT)
                .addEventListener(new CommandListener()) // Register the author-exclusive eval command
                .setGame(game)
                .setToken(token) // Set the Authentication Token
                .buildAsync(); // Finally establish a connection to Discord's servers!
    }
}