
package com.mycompany.pagamento;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class CartaoCredito implements Pagamento {

    private String numeroCartao = "80809022";
    private int codigoSeguranca = 8090;

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento De R$" + valor + " Processado via Cartão de Crétido");
    }

    @Override
    public String obterDetalhes() {
        return  this.numeroCartao.substring(numeroCartao.length() - 4);
    }
}
