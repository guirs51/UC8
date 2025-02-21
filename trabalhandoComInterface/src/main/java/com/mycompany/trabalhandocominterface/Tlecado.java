/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhandocominterface;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Tlecado implements EstrumentoMusical {

    private String marca = "lenovo";
    
    @Override
    public void toca() {
        System.out.println("O tlecado da marca " + this.marca + "esta fazendo saons=afsafssdfnsd");
    }

    @Override
    public void afinar() {
        
    }
    
}
