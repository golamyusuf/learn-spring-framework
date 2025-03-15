package com.in28minutes.learn_spring_framework.game;

public class PacMan implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Going Up PacMan");
    }

    @Override
    public void down() {
        System.out.println("Going down PacMan");
    }

    @Override
    public void left() {
        System.out.println("Going LEFT PacMan");
    }

    @Override
    public void right() {
        System.out.println("Going Right PacMan");
    }
}
