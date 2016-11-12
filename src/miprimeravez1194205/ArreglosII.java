
package miprimeravez1194205;
import java.util.Scanner;

public class ArreglosII {
    
    public static void main (String [] args){
        
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese cantidad de usuarios");
        int largo = read.nextInt();
        String[] nombre = new String [largo];
        int[]nacimiento=new int[largo];
        byte[]edad=new byte[largo];
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingrese el dato para el usuario "+ (i+1));
            nombre[i] = read.nextLine();
            System.out.println("Ingrese el año de nacimiento para el usuario "+ (i+1));
            nacimiento[i]=read.nextInt();
            edad[i]=(byte)(2016-nacimiento[i]);
        }
    }
    
}
