/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pagamento;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class SistemaDePagamento {

    public static void main(String[] args) {
        CartaoCredito meuCartao = new CartaoCredito();
        Paypal meuPaypal = new Paypal();
        
        meuCartao.processarPagamento(30);
        meuCartao.obterDetalhes();  
        
      meuPaypal.processarPagamento(30);
      meuPaypal.obterDetalhes();
                
    }
}
