/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiabasica;

/**
 *
 * @author trabajo
 */
public class ejercicio24 {
        
    public static void main(String[]args){
        ejercicio24();
    }
    public static void ejercicio24(){
        System.out.println("***La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo***");
        String frase = "La lluvia en Corrientes fue una pesadilla durante "
                + "los meses de abril y mayo";
        int vocales = 0;
        for (int i=0; i<frase.length(); i++){
            switch(frase.charAt(i)){
            case 'a': vocales++;
            break;
            case 'e': vocales++;
            break;
            case 'i': vocales++;
            break;
            case 'o': vocales++;
            break;
            case 'u': vocales++;
            break;
            default: break;
            }
        }        
        System.out.println(" *** Total de vocales: "+vocales+" *** ");
    }
}
