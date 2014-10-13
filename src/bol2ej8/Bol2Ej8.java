
package bol2ej8;

import java.util.Scanner;

public class Bol2Ej8 {

    public static void main(String[] args) {
    
        float temp = 0;
        
        System.out.println("Introduzca una temperatura:");
        Scanner rec_temp = new Scanner (System.in);
        
        temp = rec_temp.nextFloat();
        
        System.out.println("La temperatura equivalr a "+temp+ " grados centígrados");
        System.out.println(+(temp * 9/5 + 32)+ " grados Farenhait");
        System.out.println("y "+ (temp + 273) + " grados Kelvin");
        
    }
    
}
