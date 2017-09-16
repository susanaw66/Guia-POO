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
public class GuiaBasica {
    private static Scanner teclado;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        //ejercicio3();
        //ejercicio4();
        teclado = new Scanner(System.in);
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio14Bis();
        //ejercicio14Bis2();
        //ejercicio15();
    }
    public static void ejercicio3() {
        // TODO code application logic here
        int a = 10;
        int b = -8;
        int c = 36;
        
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);
        
        a = b;
        b = c;
        c = a;
        
        System.out.println("nueva a=" +a);
        System.out.println("nueva b=" +b);
        System.out.println("nueva c=" +c);
        
    }
    
    public static void ejercicio4(){
        int a = 8;
        int b = 2;
        
        if (a>b)
            System.out.println("El mayor es:" +a);
           else 
            System.out.println("El mayor es:" +b);
           
        if(a == b)
            System.out.println("Las variables son iguales" +a +b);
                   
        
        }
    
    public static void ejercicio5(){
        String miNom = "Susana";
        System.out.println("Bienvenido Septiembre");
    
    }
    
    public static void ejercicio6(){
        System.out.println("Ingrese un nombre: ");
        String nombre = teclado.next();
        System.out.println("Bienvenido" +nombre);
    }
    
    public static void ejercicio7(){
        System.out.println("Ingrese el valor del radio: ");
        double radio = teclado.nextDouble();
        double area = Math.PI*Math.pow(radio,2);
        System.out.println("El Ã¡rea del circulo es: " +area);
    }
    
    public static void ejercicio8(){
        System.out.println(" Ingrese un número: ");
        double numero = teclado.nextDouble();
        if (numero % 2 == 0)
           System.out.println(" El número es divisible por 2");
        else
           System.out.println(" El número No es divisible por 2");
    }
    
    public static void ejercicio9(){
        System.out.println(" Ingrese un número: ");
        double numero = teclado.nextDouble();
        char letraNum = (char)numero;
        System.out.println(" La letra correspondiente es: " +letraNum);
    }
    
    public static void ejercicio10(){
        System.out.println(" Ingrese una letra: ");
        char letra = teclado.next().charAt(0);
        int numAscii = (int)letra;
        System.out.println(" La número correspondiente es: " +numAscii);
    }
    
    public static void ejercicio11(){
        System.out.print(" Ingrese el Precio del Producto: ");
        double precio = teclado.nextDouble();
        double iva = 21;
        double porcentaje = ((precio*iva)/100);
        double precioFinal = precio + porcentaje;
        System.out.println(" Precio final del producto mas IVA: "+precioFinal);
    }
    
    public static void ejercicio12(){
        int numero = 1;
        System.out.println(" Lista de números del 1 al 100 ");
        while(numero <= 100){
            System.out.println("    "+numero);
             numero++;
        }
    }
    
    public static void ejercicio13(){
        System.out.println(" Lista de números del 1 al 100 ");
        for(int i = 1; i <= 100; i++)
         System.out.println("    "+i);
    }
    
    public static void ejercicio14(){
        for(int i = 1;i <= 100; i++){
            if((i % 2 == 0)&&(i % 3 == 0))
                System.out.println(" El número es divisible por 2 y 3: "+i);
        }
    }
    
    public static void ejercicio14Bis(){
        for(int i = 1;i <= 100; i++){
            if(i % 6 == 0)
                System.out.println(" El número es divisible por 2 y 3: "+i);
        }
    }
    
    public static void ejercicio14Bis2(){
        for(int i = 6;i <= 100; i += 6){
           System.out.println(" El número es divisible por 2 y 3: "+i);
        }
    }
    
    public static void ejercicio15(){
        int totalVentas = 0;
        int ventas = 0;
        
        System.out.println(" Ingrese el número de ventas que desee: ");
        int nroVentas = teclado.nextInt();
        
        while (nroVentas >= ventas){
            System.out.print(" Ingrese el monto de la "+nroVentas+"° venta: ");
            double monto = teclado.nextDouble();
            totalVentas += monto;
            ventas++;       
            System.out.println(" cantidad de ventas: "+ventas);            
        }
        System.out.println(" El Total de las Ventas es:" +totalVentas);
    }
}

    
    

