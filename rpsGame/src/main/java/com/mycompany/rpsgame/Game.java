/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

import java.util.Scanner;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Game {

    private int rps;
    private Player jogador;
    private Player computador;
    private rpsValidator validator;
    private Scanner sc;

    public Game() {
        validator = new rpsValidator();
        this.jogador = new Player();
        this.sc = new Scanner(System.in);

    }

    public void start() {
        System.out.println("bem-vindo(a) ao pedra, papel e tesoura " + jogador.getName() + "!");

        int jogo = 0;
        int resultado;
        
        while (this.jogador.getVitoria() > 2 || this.jogador.getDerrota() > 2) {

            //jogo++;
            System.out.println("digite 1 para pedra, 2 para papel ou 3 para tesoura");
            int user = sc.nextInt();
            rps = (int) (Math.random() * 3) + 1;

            resultado = validator.validatorRps(user, rps);

            if (resultado == 1) {
                this.jogador.setDerrota(1);
            } else if (resultado == 2) {
                this.jogador.setVitoria(1);
            } else {
                this.jogador.setEmpates(1);
            }

            this.jogador.getHistorico();

            //if (jogo == 2 && this.jogador.getEmpates() == 2) {
        }

    }
}
