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
public class ejercicio19 {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in); 
        ejercicio19();
    }

    public static void ejercicio19(){
        System.out.println(" Ingrese un día de la semana: ");
        String dia = teclado.next();
        
        switch(dia){
                case "Lunes":
                System.out.println(" Es un día laboral ");
                break;
                case "Martes":
                System.out.println("*** Es un día laboral*** ");
                break;
                case "Miercoles":
                System.out.println("*** Es un día laboral*** ");
                break;
                case "Jueves":
                System.out.println("** Es un día laboral*** ");
                break;
                case "Viernes":
                System.out.println("*** Es un día laboral*** ");
                break;
                case "Sábado":
                System.out.println("*** Es un día No laboral*** ");
                break;
                case "Domingo":
                System.out.println("*** Es un día No laboral*** ");
                break;
                default:
                System.out.println("*** No es un día de la semana*** ");
        }  
                
    }
                
}
        

