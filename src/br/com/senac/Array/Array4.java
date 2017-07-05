package br.com.senac.Array;

/**
 *Estudo do Array --- Exemplo 4 --- Preenchendo um array com o laço for 
 * @author victor constantino
 */
public class Array4 {
    public static void main(String[] args) {
        int[] idades = new int[10];
        //a estrutura abaixo cria as variáveis que irao preencher as 10 posiçoes("casinhas") do array 
        for (int i = 0; i < 10; i++) {
            idades[i] = i * 10;
            System.out.println("idades[" + i +"] = " + idades[i]);
            
        }
        
    }
    
}
