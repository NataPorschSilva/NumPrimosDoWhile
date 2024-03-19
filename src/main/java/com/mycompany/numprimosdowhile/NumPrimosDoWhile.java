
package com.mycompany.numprimosdowhile;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class NumPrimosDoWhile {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int limite = teclado.nextInt();
        int numero = 2;
        boolean primo;
        
    do {
        primo = true;
        for(int i = 2; i <= numero / 2; i++){
        if(numero % i == 0){
        primo = false;
        break;
            }
        } 
        if (primo){
            System.out.println(numero);
        }
         numero++;
    }while( numero <= limite);

    }
}