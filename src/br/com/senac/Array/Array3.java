 
package br.com.senac.Array;

/**
 *Estudo do Array --- Exemplo 3 --- instanciando um array de tamanho fixo
 * @author victor constantino
 */
public class Array3 {
    public static void main(String[] args) {
        //iniciando um array com tamanho fixo de 5 variáveis 
        int[] impares = new int[5];
        impares[0] = 1;
         impares[1] = 3;
          impares[2] = 5;
           impares[3] = 7;
            impares[4] = 9;
            System.out.println("Tamanho do array: " + impares.length);
            System.out.println("Posiçao 1 do array: " + impares[1]);
            //a linha abaixo gera um erro, pois o tamanho do array é 5
            impares[5] = 11;
            System.out.println("");
                    
    }
    
}
