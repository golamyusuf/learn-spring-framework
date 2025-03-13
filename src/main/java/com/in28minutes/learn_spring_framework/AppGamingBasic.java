package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        //var marioGame = new MarioGame();
        var supercontraGame = new SuperContraGame();
        var gameRunner = new GameRunner(supercontraGame);
        gameRunner.run();
    }
}
