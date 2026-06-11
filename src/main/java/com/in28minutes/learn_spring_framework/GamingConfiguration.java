package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PackmanGame;
import com.in28minutes.learn_spring_framework.game.SuperContra;

@Configuration
public class GamingConfiguration {
	@Bean
	
	public GamingConsole game() {
		var game=new SuperContra();
		return game;
		}
	
	@Bean
	
	public GameRunner gameRunner() {
		var gameRunner=new GameRunner(game());
		return gameRunner;
		}
	
//@Bean
//	
//	public GamingConsole game1() {
//		var game=new MarioGame();
//		return game;
//		}
//
//@Bean
//
//public GamingConsole game2() {
//	var game=new PackmanGame();
//	return game;
//	}
	
	
	
}
