package boletin_4_4;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_4_4 {
        
    public static void main(String[] args) {
    
        System.out.println("Teclee los KG de Pulpo:");
        Scanner scanKg = new Scanner(System.in);
        float pulpo = scanKg.nextFloat();  
 
        System.out.println("Teclee los KG de Patatas:");
        float patatas = scanKg.nextFloat();      
        
        Stock servicio1 = new Stock(pulpo, patatas);
         
        System.out.println(servicio1.capacidadstock());
    }
}

