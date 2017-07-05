package br.com.senac.Array;

/**
 *Estudo do Array --- Exemplo 6 --- Array Multidimensional 
 * @author victor constantino
 */
public class Array6 {
    public static void main(String[] args) {
        //a linha abaixo cria um array de duas dimensões 
        String[][] agenda = {{"Bill","1111-1111","bill@outlook.com"},{"Linus","2222-2222","linus@tux.com"},{"Steve","3333-3333","steve@icloud.com"}};
        //exemplo 1: recuperando o email do bill
        //System.out.println(agenda[0][2]);
        //excemplo 2:montanod a agenda de contatos 
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("_______________________");
            //o segundo laço dentro do primeiro laço, percorre as colunas, montando a agenda 
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.println(agenda[i][j]);
                
            }
            
        }
    }
    
}
