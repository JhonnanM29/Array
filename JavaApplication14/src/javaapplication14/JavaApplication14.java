
package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {

   
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        int numeros []; numeros = new int [5];
        //capturando array
        int index=0;
        for (int i = 0; i < numeros.length; i++){
        System.out.println(" digite numero ");
        numeros[index] = lectura.nextInt();
        index++;
        }
        System.out.println(" los numeros son ");
        for (int num :  numeros){
            System.out.println(num);
            
        }
        //escribir array numeros
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[1]);
        }
    }
    
}
