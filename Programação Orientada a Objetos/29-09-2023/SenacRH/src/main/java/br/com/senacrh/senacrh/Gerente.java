package br.com.senacrh.senacrh;

public class Gerente extends Funcionario {

    private String area;
    private double bonus;

    public Gerente(String nome, int codigo) {
        super(nome, codigo);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }

}
