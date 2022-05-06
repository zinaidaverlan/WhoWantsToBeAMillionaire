package main;

import java.util.Scanner;

public class GameDevelopment {


    public static void main(String[] args) {

        System.out.println("====Who want to be a millionaire?===");

        GameProcess gameProcess = new GameProcess();
        gameProcess.startGame();

        System.out.println("====Help====");
        System.out.println("F -> 50/50 |  P -> Call a friend   |   A - > The audience asks");


    }


}
