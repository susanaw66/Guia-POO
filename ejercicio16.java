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
public class ejercicio16 {
    private static Scanner teclado;
        
public static void main(String[] args) {
    teclado = new Scanner(System.in);
    ejercicio16();
}
public static void ejercicio16(){
    System.out.println(" Ingrese el valor de la variable A : ");
    int vbleA = teclado.nextInt();
    System.out.println(" Ingrese el valor de la variable B : ");
    int vbleB = teclado.nextInt();
    System.out.println(" Ingrese el valor de la variable C : ");
    int vbleC= teclado.nextInt();
    //Ecuación cuadrática aX^2 + bX + c = 0
    //Solución: x = +-b +- raiz(b^2 - 4*a*c)/ 2*a
    double x1;
    double x2;
    double radicando = ((vbleB^2) - (4*vbleA*vbleC));//>=0
    if (radicando > 0){
       System.out.println(" La ecuación tiene dos raices reales");
       x1 = ((-vbleB + Math.sqrt(radicando))/(2*vbleA));
       x2 = ((-vbleB - Math.sqrt(radicando))/(2*vbleA));
       System.out.println(" La raíz de X1 es: " +x1);
       System.out.println(" La raíz de X2 es: " +x2);
    }    
    if (radicando == 0){
       System.out.println("La ecuación tiene sólo una raiz real");
       x1 = -vbleB/(2*vbleA);
       System.out.println("  La solución es: X1 = X2 = " +x1);
    }
    if (radicando < 0) 
       System.out.println(" La Ecuación no tiene solución ");
    }
}

