package br.com.senacrh.senacrh;

public class Engenheiro extends Funcionario {

    private int departamento;
    private String crea;

    public Engenheiro(String nome, int codigo) {
        super(nome, codigo);
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * 1.5;
    }

}
