package br.com.senacrh.senacrh;

public class SenacRH {

    public static void main(String[] args) {
        var engenheiro = new Engenheiro("Joao", 11);
        engenheiro.setSalario(6000);

        var gerente = new Gerente("Jorge", 12);
        gerente.setSalario(8000);

        var presidente = new Presidente("Maria", 13);
        presidente.setSalario(25000);

        var folhaPagamento = new FolhaPagamento();
        folhaPagamento.registrar(engenheiro);
        folhaPagamento.registrar(gerente);
        folhaPagamento.registrar(presidente);
        
    }
}
