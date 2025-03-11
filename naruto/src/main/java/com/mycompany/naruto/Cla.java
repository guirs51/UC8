/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.naruto;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public abstract class Cla {

    protected String nomeCla;
    protected String lider;

      public Cla(String nomeCla, String lider) {
        this.nomeCla = nomeCla;
        this.lider = lider;
    }
    
    public abstract void HabilidadeEspecial();

    public void exibirDetalhes(){
        System.out.println("Clã: " + nomeCla);
        System.out.println("Líder: " + lider);
    }

}
