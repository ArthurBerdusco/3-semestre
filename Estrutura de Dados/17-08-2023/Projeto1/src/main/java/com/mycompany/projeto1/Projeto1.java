package com.mycompany.projeto1;

public class Projeto1 {

    public static void main(String[] args) {
        double[] temperatura = new double[365];
        temperatura[0] = 25.7;
        temperatura[1] = 23.3;
        temperatura[2] = 24.1;
        temperatura[3] = 26.0;
        temperatura[4] = 22.8;
        temperatura[5] = 21.9;
        
        System.out.println("O valor da temperatura do 3º dia é: " + temperatura[2]);
        System.out.println("O tamanho do vetor: " + temperatura.length);
        
        for(int i = 0; i < temperatura.length; i++){
            System.out.println("O valor da temperatura no dia " + (i+1) + " é: " + temperatura[i]);
        }
        
        for(double temp: temperatura){
            System.out.println("Temperatura: " + temp);
        }
    }
}
