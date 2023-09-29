package br.com.senacrh.senacrh;

public class FolhaPagamento {

    private double total;

    public double calcularFolha() {
        return total;
    }

    public void registrar(Funcionario funcionario) {
        total += funcionario.calcularSalario();
    }

}
