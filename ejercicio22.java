/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiabasica;
import java.util.Scanner;

/**
 *
 * @author trabajo
 */
public class ejercicio22 {
    private static Scanner teclado;

    public static void main(String[]args){
    teclado = new Scanner(System.in);
    ejercicio22();
    }
    
    public static void ejercicio22(){
        System.out.println(" Ingrese un número: ");
        int numero = teclado.nextInt();
        
        boolean primo = true;
        for(int i=2; i<numero; i++){
            if(numero%i ==0)
               primo = false;
            }
            if(primo == true)
               System.out.println("*El número: "+numero+" es primo*");
            else
               System.out.println("*El número: "+numero+" No es primo*");
        }
        
}
