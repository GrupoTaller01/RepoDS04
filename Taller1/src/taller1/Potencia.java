/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

import java.util.Scanner;


/**
 *
 * @author CltControl
 */
public class Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, exponente, total;
       
        Scanner leer=new Scanner(System.in);
        
        System.out.println("ingrese numero: ");
        numero=leer.nextInt();
        
        System.out.println("ingrese exponente: ");
        exponente=leer.nextInt();
        
        total=(int) Math.pow(numero,exponente);
        System.out.println("El total es: " + total);         
    }
    
}
