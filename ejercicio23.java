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
public class ejercicio23 {
    
    public static void main(String[]args){
        ejercicio23();
    }
    
    public static void ejercicio23(){
        System.out.println("***Los números primos del 1 al 100 son***");
        int num = 1;
        while (num <= 100){
            boolean primo = true;
            for (int i=2; i<num; i++){
               if (num % i == 0){
                   primo = false;
               }
            }        
            if (primo == true){
                System.out.println("        "+num);
            }            
            num++;                         
        }       
    }
}

