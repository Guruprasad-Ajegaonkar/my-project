package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContra;
import com.in28minutes.learn_spring_framework.game.PackmanGame;
public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var game=new MarioGame();
		var game=new PackmanGame();
		//SuperContra game=new SuperContra();
		var gameRunner=new GameRunner(game);
		gameRunner.run();
	}

}
