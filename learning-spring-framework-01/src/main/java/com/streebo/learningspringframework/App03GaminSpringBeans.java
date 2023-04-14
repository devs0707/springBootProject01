package com.streebo.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.streebo.learningspringframework.game.GameRunner;
import com.streebo.learningspringframework.game.GamingConsole;
import com.streebo.learningspringframework.game.MarioGame;
import com.streebo.learningspringframework.game.PacmanGame;
import com.streebo.learningspringframework.game.SuperContraGame;

public class App03GaminSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
