
package arraydinamico;

import java.util.Scanner;
public class ArrayDinamico {
 
    
    public static void main(String[] args) {
        String[] nomes = new String[1];
        boolean continuar = true;
        int i = 0;
        while (continuar) {
            System.out.println("Informe nome ");
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Deseja continuar? [s/n]");
            String opcao = new Scanner(System.in).nextLine();
            continuar = opcao.equalsIgnoreCase("s");
            if (continuar) {
                //add();
                String[] aux = new String[nomes.length];
                for (int x = 0; x < nomes.length; x++) {
                    aux[x] = nomes[x];
                }
                nomes = new String[aux.length + 1];
                for (int x = 0; x < aux.length; x++) {
                    nomes[x] = aux[x];
                }
                i++;
            }
        }
       // listar();
        System.out.println("===============================");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}
