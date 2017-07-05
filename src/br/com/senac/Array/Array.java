package br.com.senac.Array;

/**
 *Estudo de array --- Exemplo 1 --- Array simples
 * @author victor constantino
 */
public class Array {
    public static void main(String[] args) {
        //sem Array
        System.out.println("Array simples");
        System.out.println("1. sem array");
        String time1 = "Palmeiras";
        String time2 = "Corinthians";
        String time3 = "Sao Paulo";
        String time4 = "Santos";
        System.out.println("Time: " + time2);
        System.out.println("2. com array");
        //a linha abaixo cria um array simples de tamanho 4
        String[] times = {"Palmeiras", "Corinthians", "Sao Paulo", "Santos"};
        //a linha abaixo exibe o conteúdo da array na posiçao [1]
        // [0][1][2][3]
        System.out.println("Time: " + times[1]);
        //a linha abaixo exibe o tamanho da array 
        System.out.println("Tamanho do array: " + times.length);
        //a linha abaixo altera o conteúdo de um array
        times[1] = "Flamengo";
        System.out.println("Times: " + times[1]);
    }
    
}
