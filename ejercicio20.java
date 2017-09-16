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
public class ejercicio20 {
    private static Scanner teclado;
    

    public static void main(String[]args){
    teclado = new Scanner(System.in);
    ejercicio20();
    }

    public static void ejercicio20(){
        System.out.println(" Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        
        System.out.println(" Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        
        System.out.println(" Los 10 números aleatorios son: ");
        Random rnd = new Random();
        
        for (int i=0; i<=9; i++){
            System.out.println("           "+rnd.nextInt(num2-num1+1));
        }
        
    }
}