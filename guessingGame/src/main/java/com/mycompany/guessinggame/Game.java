/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
import java.util.Scanner;
public class Game {
    private int numberToGuess; // Número aleatório
    private Player user;
    private GuessValidator guessValidator;
    private Scanner scanner;
    
    public Game() {   
        this.numberToGuess = (int) (Math.random() * 100) + 1;
        this.user = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        // Lógica do jogo será adicionada aqui
        System.out.println("bem-vindo(a) ao Guessing Game " + user.getName()+ "!");
        boolean hasWon = false; // essa variavel verefica se o jogador venceu, se sim ela para o loop
        
             while (!hasWon) {
            System.out.print("Digite seu palpite: ");
            int guess = scanner.nextInt();
            hasWon = guessValidator.validateGuess(guess, numberToGuess);
        }

        System.out.println("Parabéns, " + user.getName() + "! Você adivinhou o número.");
    }
}
