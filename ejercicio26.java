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
public class ejercicio26 {
    public static void main(String[]args){
        ejercicio26();
    }
    public static void ejercicio26(){
        System.out.println(" **La lluvia en Corrientes fue una pesadilla durante"
                + " los meses de abril y mayo :( ");
        String frase = "La lluvia en Corrientes fue una pesadilla durante  los meses de abril y mayo :(";
        
        System.out.println(" **** Código ASCII de cada caracter ****");
        for(int i=0; i<frase.length(); i++){
            System.out.print("   "+frase.charAt(i)+" = "+frase.codePointAt(i));
        }
    }
}
