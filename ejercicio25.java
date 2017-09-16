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
public class ejercicio25 {
    public static void main(String[]args){
        ejercicio25();
    }
    public static void ejercicio25(){
        System.out.println(" **La lluvia en Corrientes fue una pesadilla durante"
                + " los meses de abril y mayo :( ");
        String frase = "La lluvia en Corrientes fue una pesadilla durante  los meses de abril y mayo :(";
        frase = frase.replace('a', 'e');
        
        System.out.println("** Frase reemplazada **");
        System.out.println(frase);
    }
}
