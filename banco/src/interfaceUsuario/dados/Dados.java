package interfaceUsuario.dados;

import conta.Conta;

public class Dados {
    private String tipoDaConta;
    private int rendaAtual;
    private boolean cartaoCredito;
    private boolean cartaoDebito;

    public boolean hasCartaoCredito() {
        return cartaoCredito;
    }
    public boolean hasCartaoDebit() {
        return cartaoCredito;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public int getRendaAtual() {
        return rendaAtual;
    }
}