package com.example.tic_tac_toe;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class AIGame {
    public static void main(String[] args) {

        AIGrid adsTicTacToe = new AIGrid();

        String[] board = {"0","1","2","3","4","5","6","7","8"};

        State state = new State(0,board);

        Scanner scanner = new Scanner(System.in);

        while (!adsTicTacToe.isTerminal(state)){
            board[adsTicTacToe.minMaxDecision(state)] = "X";
            if (!adsTicTacToe.isTerminal(state)){
                drawBoard(state);
                System.out.print(": ");
                int userInput = Integer.parseInt(scanner.nextLine());
                state.changeState(userInput, "O");
            }
        }
        drawBoard(state);
        System.out.println("Game is over");
    }

    public static void drawBoard(State state){
        for (int i = 0; i < 7; i +=3) {
            System.out.println(state.getStateIndex(i) + " "
                    + state.getStateIndex(i + 1) + " " + state.getStateIndex(i + 2));
        }
    }

}

