/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicoarray;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Contato {
    private String name;
    private String telephone;
    
    public Contato(String name, String telephone){
        this.name = name;
        this.telephone = telephone;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getTelephone(){
        return telephone; 
    }
    
    public void setTlephone(String telephone){
        this.telephone = telephone;
    }
    
    public String ToString(){
        return name + " - " + telephone;
    }
}
