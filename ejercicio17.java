/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiabasica;
import java.util.*;
/**
 *
 * @author trabajo
 */
public class ejercicio17 {
    private static Scanner teclado;
    
    public static void main(String[] args) {
        teclado = new Scanner(System.in); 
        ejercicio17();
    }
    
    public static void ejercicio17(){
        double numero; 
        //double numero2;
        do{
           System.out.println(" Ingrese un número: ");
           numero = teclado.nextDouble();
           
           if(numero >= 0)
              System.out.println(" El número ingresado es: " +numero);
           
           else{
              System.out.println(" El número ingresado es menor que cero "+numero);
              System.out.println(" Ingrese nuevo número: ");
              numero = teclado.nextDouble();
           }
           
        }while(numero >= 0);
              
    }
}

