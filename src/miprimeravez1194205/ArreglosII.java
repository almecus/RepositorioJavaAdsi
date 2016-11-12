
package miprimeravez1194205;
import java.util.Scanner;

public class ArreglosII {
    
    public static void main (String [] args){
        
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese cantidad de usuarios");
        int largo = read.nextInt();
        String datos [] = new String [largo];
        
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Ingrese el dato para el usuario"+ (i+1));
            datos[i] = read.nextLine();
            
        }
    }
    
}
