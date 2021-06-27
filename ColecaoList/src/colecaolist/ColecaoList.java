/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class ColecaoList {
    static List<String> nomes = new ArrayList<>();
    public static void main(String[] args) {
        boolean continuar = true;
        do{
            preencherLista();
            System.out.println("Deseja continuar [s/n]");
            String opcao = new Scanner(System.in).next();
            continuar = opcao.equalsIgnoreCase("s");
        }while(continuar);
        
        listar();
        
        substituir();
        
        
    }
    
    public static void preencherLista(){
        System.out.println("Informe nome");
        nomes.add(new Scanner(System.in).nextLine());        
    }
    
    public static void listar(){
       for(String nome : nomes) {
           System.out.println(nome);
       }
        System.out.println("");
    }
    
    public static void substituir(){
        System.out.println("Informe nome que deseja substituir");
        int posicao = nomes.indexOf(new Scanner(System.in).nextLine());
        
        if(posicao > -1){
            System.out.println("Informe novo nome");
            nomes.set(posicao, new Scanner(System.in).nextLine());
            listar();
        }
        else
        {
            System.out.println("Nome não existe");
            substituir();
        }
    }
    
}
