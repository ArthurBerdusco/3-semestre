package br.com.senacrh.senacrh;

public abstract class Funcionario {
    
    private String nome;
    private int codigo;
    private double salario;

    public Funcionario(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
