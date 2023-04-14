package com.streebo.learningspringframework;

import com.streebo.learningspringframework.game.GameRunner;
import com.streebo.learningspringframework.game.MarioGame;
import com.streebo.learningspringframework.game.PacmanGame;
import com.streebo.learningspringframework.game.SuperContraGame;

public class App01GaminBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();	// 1. Object Creation
		var gameRunner = new GameRunner(game);
			// 2. Object Creation + Wiring Dependencies
			// Game is Dependency of GameRunner
		gameRunner.run();
	}

}
