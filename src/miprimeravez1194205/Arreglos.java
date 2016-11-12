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
public class Arreglos {
    
    public static void main (String [] args) {
        Scanner read = new Scanner(System.in);
        String nombre[]=new String [3];
        nombre[0]="Alceo";
        nombre[1]="Mesa";
        nombre [2]="Cuadros";
     /*   for (int i = 0; i < nombre.length; i++) {
            //String string = nombre[i];
            System.out.println(nombre [i]);
        }*/
                
        /*for (int i = 0; i < 3; i++) {
            alias = alias+nombre[i].charAt(0);
            
        }*/
      // System.out.println(alias);
            
            /*for (int i = 0; i < nombre.length-1; i++) {
                System.out.print(nombre[i].charAt(0));
        }
            System.out.print(nombre[nombre.length-1]);
        }
      
          */ 
            String alias="";
            for (int i = 0; i < nombre.length; i++) {
                if (i < nombre.length - 1) {
                    alias = alias+nombre[i].charAt(0);                    
                }
                else {
                    alias = alias + nombre[i];
                }
        }
            System.out.println(alias.toLowerCase());
            String dia[] = new String [5];
            //dia[]= "Lunes"; "martes"; "Miercoles"; "Jueves"; "Viernes";
            int consulta=read.nextInt();
            
            switch  (consulta)
            {
                case 0:
                    System.out.println(nombre[0]);
                    break;
                case 1:
                    System.out.println(nombre[1]);
                    break;
                case 2:
                    System.out.println(nombre[2]);
                    break;
                
                default:
                    System.out.println(alias);
                    break;
                    
            }
 }
   
}