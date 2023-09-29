package br.com.senacrh.senacrh;

public final class Presidente extends Funcionario {

    private double valorCotaAcoes;

    public Presidente(String nome, int codigo) {
        super(nome, codigo);
    }

    public double getValorCotaAcoes() {
        return valorCotaAcoes;
    }

    public void setValorCotaAcoes(double valorCotaAcoes) {
        this.valorCotaAcoes = valorCotaAcoes;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + valorCotaAcoes;
    }

}
