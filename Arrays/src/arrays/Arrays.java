/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      /* String[] cars = {"Fusca","Kombi","Brasilia","TL","variant"};
       System.out.println(cars[3]);
       cars[3] = "voyage";
       System.out.println(cars[3]);
       System.out.println(cars.length);
       */
       float[] notas = new float[4];
       int x = 0;
       while(x < notas.length){
           System.out.println("Informe a "+x+"ª nota [0-10]");
           float nota = new Scanner(System.in).nextFloat();
           if(nota >= 0 && nota <= 10){
               notas[x] = nota;
               x++;
           }
           else
               System.out.println("Nota inválida");
       }
       //faz calculo
       float soma = 0;
       for(int i = 0; i < notas.length; i++){
           soma += notas[i];
       }       
       float media = soma/notas.length;
       if(media<7){
           System.out.println("Aluno reprovado com média: " + media);
       }
       else{
           System.out.println("Aluno aprovado com média: " + media);
       }
       
    }
    
}
