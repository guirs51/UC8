/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class rpsValidator {
    //"digite 1 para pedra, 2 para papel ou 3 para tesoura"

    public int validatorRps(int user, int rps) {
        if (user == 1 && rps == 2) {
            System.out.println("Voce Perdeu a rodada.");
            return 1;
        } else if (user == 1 && rps == 3) {
            System.out.println("Voce ganhou a rodada.");
            return 2;
        } else if (user == 2 && rps == 1) {
            System.out.println("Voce ganhou a rodada.");
            return 2;
        } else if (user == 2 && rps == 3) {
            System.out.println("voce perdeu a rodada.");
            return 1;
        } else if (user == 3 && rps == 1) {
            System.out.println("voce perdeu a rodada.");
            return 1;
        } else if (user == 3 && rps == 2) {
            System.out.println("voce ganhou a rodada.");
            return 2;
        } else {
            System.out.println("rodada empatada.");
            return 3;

        }

    }
}
