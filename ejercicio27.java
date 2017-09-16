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
public class ejercicio27 {
    private static Scanner teclado;
    
    public static void main(String[]args){
        teclado = new Scanner(System.in);
        ejercicio27();
    }
    public static void ejercicio27(){
        System.out.println("¿Desea realizar una operación?: S/N");
        String rpta = teclado.next();
        while("S".equals(rpta)){
             System.out.println("  Ingrese el primer número: ");
             int num1 = teclado.nextInt();
             System.out.println("  Ingrese el segundo número: ");
             int num2 = teclado.nextInt();
             System.out.println("  Ingrese el operando que desea: + , - , * , / ");
             String operando = teclado.next();
                        
            switch(operando){
                 case "+": System.out.println(" El resultado es: "+(num1 + num2));
                 break;
                 case "-": System.out.println(" El resultado es: "+(num1 - num2));
                 break;
                 case "*": System.out.println(" El resultado es: "+(num1 * num2));
                 break;
                 case "/": System.out.println(" El resultado es: "+(num1 / num2));
                 break;
                 default: System.out.println("***ERROR***");
            }
            System.out.println("Desea realizar otra operación: S/N");
            rpta = teclado.next();
        }
    }
}
