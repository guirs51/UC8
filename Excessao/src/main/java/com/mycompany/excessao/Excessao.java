/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.excessao;

import java.io.FileReader;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Excessao {

    public static void verificarIdade(int idade) {
        if (idade < 18) {
            /* Aqui eu criei uma excessão que é lançada,  quando a idade e menor que 18 */
            throw new IllegalArgumentException(" Q idade deve ser maior ou igual a 18");
        }
    }

    public static void main(String[] args) {

        /*
        //Aqui eu tratei esta eXcessão para não travar meu programa
        try{
            verificarIdade(16); // Vai lancar uma Excessão
        }catch (Exception error) {
            System.out.println("DEu Ruim :(" + error.getMessage());
        }
        
        System.out.println("Como eu tratei a excessão, meu programa continua rodando");
         */
        
        /*
        try {
            // O codigo abaixa pode lancar uma IOExeception, então...
            FileReader arquivo = new FileReader("arquivo.txt"); // Excessão Verificada
        } catch (Exception e) {
            System.out.println("Erro ao tentar abrir o arquivo " + e.getMessage());
        }

        System.out.println("Parem de encher meu saco");
        */
        
    }
}
