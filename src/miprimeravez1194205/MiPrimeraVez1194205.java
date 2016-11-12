/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeravez1194205;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class MiPrimeraVez1194205 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nombre;
        System.out.println("Por favor ingrese su nombre"); 
        nombre=read.nextLine();
        System.out.println(nombre+"\n ingrese su a_no de nacimiento\t");
        short nacimiento=read.nextShort();
        System.out.println(nombre+":\t"+nacimiento);
        short edad=(short)(2016-nacimiento);
        System.out.println("Su edad es: "+edad);
                
        
        
                
        
        
        
        // TODO code application logic here
    }
    
}
