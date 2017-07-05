package br.com.senac.Array;

/**Estudo do Array --- Exemplo 5 --- Percorrendo um array com o laço for e foreach 
 *
 * @author victor constantino
 */
public class Array5 {
    public static void main(String[] args) {
        //iniciando um array de tamanho variável
        int[] pares = {2,4,6,8};
        //a estrutura abaixo percorre o array 
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares["+ i + "] = " + pares[i]);
        }
        //usando uma estrutura simplificada do laço for(foreach) para percorrer o array
        System.out.println("uso do foreach:");
        for (int i : pares){
            System.out.println(i);
        }
    }
    
}
