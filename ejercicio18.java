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
   public class ejercicio18 {
       private static Scanner teclado;

       public static void main(String[] args) {
       teclado = new Scanner(System.in);
       ejercicio18();
    }
    public static void ejercicio18() {
        int intentos = 0;
        boolean valido = false;
        while (valido == false && intentos < 3){
            System.out.println("*** Ingrese usuario: ");
            String usuario = teclado.next();
            System.out.println("***Ingrese contraseña: ");
            String contraseña = teclado.next();
            valido = esValido(usuario, contraseña);
            intentos++;
        }
        if (valido == true)
            System.out.println("*** Logueo Exitoso ***");
        if (valido == false && intentos == 3)
            System.out.println("*** Se acabaron los intentos ***");       
    } 
    public static boolean esValido(String p_usuario, String p_contraseña){
        String usuarioValido = "Susana";
        String contraseñaValida = "qwerty";
        return p_usuario.equals(usuarioValido) && p_contraseña.equals(contraseñaValida);
        
    }
}
