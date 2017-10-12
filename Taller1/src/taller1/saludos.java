/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antho
 */
import java.util.Scanner;
public class saludos {   
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       String n;
       System.out.println("Intruduzca su nombre: ");
       System.out.println("- ");
       n=sc.nextLine();
       System.out.println("");
       System.out.println("Hola, "+n+", espero que tengas un buen día");
    }    
}
