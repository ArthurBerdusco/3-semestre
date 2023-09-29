package br.com.senacrh.senacrh;

public abstract class FuncionarioAuntenticavel extends Funcionario{

    public FuncionarioAuntenticavel(String nome, int codigo) {
        super(nome, codigo);
    }

    @Override
    public abstract double calcularSalario();
    
}
