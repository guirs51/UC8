/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.naruto;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Konoha {

    public static void main(String[] args) {
        Cla uchiha = new ClaUchiha("sasuke Uchia");
        uchiha.HabilidadeEspecial();
        uchiha.HabilidadeEspecial();
        
        Cla hyuuga = new ClaHyuuga("Hiashi");
        hyuuga.exibirDetalhes();
        hyuuga.HabilidadeEspecial();
        
        Cla nara = new ClaNara(" Shikamaru");
        nara.exibirDetalhes();
        nara.HabilidadeEspecial();
        
        Cla akimichi = new ClaAkimichi("Chouza");
        akimichi.exibirDetalhes();
        akimichi.HabilidadeEspecial();

    }
}
