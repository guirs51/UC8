/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhandocominterface;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Violao implements EstrumentoMusical{

    private String marca = "Tagima";
    
    @Override
    public void toca() {
        System.out.println("o violão da marca " + this.marca + " esta fazendo bleoiandoand");
    }

    @Override
    public void afinar() {
           System.out.println("o violão da marca " + this.marca + " esta afinando");
    }
    
}
