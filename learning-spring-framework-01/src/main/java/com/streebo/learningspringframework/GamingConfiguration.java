package com.streebo.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.streebo.learningspringframework.game.GameRunner;
import com.streebo.learningspringframework.game.GamingConsole;
import com.streebo.learningspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();	// 1. Object Creation
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
//	var game = new MarioGame();
//	var game = new SuperContraGame();
	
//	var gameRunner = new GameRunner(game);
//		// 2. Object Creation + Wiring Dependencies
//		// Game is Dependency of GameRunner
//	gameRunner.run();
}
