package com.mycompany.projeto1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double temperatura[] = new double[7];
        
        for(int i = 0; i< temperatura.length; i++){
            System.out.println("Digite a temperatura do " + (i+1) + "º dia: ");
            temperatura[i] = new Scanner(System.in).nextDouble();
        }
        
        double media = 0;
        
        for(int i = 0; i < temperatura.length; i++){
            media += temperatura[i];
            if(i == temperatura.length - 1){
                media = media / temperatura.length;
            }
        }

        System.out.println("Media: " + media);
        
        for(int i = 0; i < temperatura.length; i++){
            if(temperatura[i] > media){
                System.out.println("Dia " + (i+1) + " = MAIOR QUE A MÉDIA");
            }
            if(temperatura[i] < media){
                System.out.println("Dia " + (i+1) + " = MENOR QUE A MÉDIA");
            }
        }
    }
}
