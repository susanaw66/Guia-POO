/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiabasica;
import java.util.*;
 /*
 * @author trabajo
 */
public class ejercicio21 {
    private static Scanner teclado;

    public static void main(String[]args){
    teclado = new Scanner(System.in);
    ejercicio21();
    }

    public static void ejercicio21(){
    System.out.println(" Ingrese un número: ");
    int numero = teclado.nextInt();
    
    if(numero>0){
       System.out.println(" El número: "+numero +" tiene "+
               Integer.toString(numero).length()+ " cifras");
    }
    }
}