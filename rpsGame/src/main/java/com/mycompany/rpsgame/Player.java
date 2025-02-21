/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
import java.util.Scanner;

public class Player {

    private String name;
    private int vitoria;
    private int derrotas;
    private int empates;

    public Player() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        this.name = sc.nextLine();

        this.vitoria = 0;
        this.derrotas = 0;
        this.empates = 0;

    }

    public String getName() {
        return name;
    }

    public void getHistorico() {
        System.out.println("vitorias: " + this.vitoria + "," + "Derrotas: " + this.derrotas + "," + "empates: " + this.empates + ".");
    }

    public int getVitoria() {
        return vitoria;
    }

    public int getDerrota() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setVitoria(int vit) {
        vitoria += vit;
    }

    public void setDerrota(int loser) {
        derrotas += loser;
    }

    public void setEmpates(int emp) {
        empates += emp;
    }

}
