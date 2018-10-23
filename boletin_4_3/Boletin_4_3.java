package boletin_4_3;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_4_3 {
        
    public static void main(String[] args) {
            
    System.out.println("Teclee el Radio del circulo a calcular:");
    Scanner scanGC = new Scanner(System.in);
    double r = scanGC.nextFloat();   
        
    Circulo circulo1 = new Circulo(r);
    System.out.println("Area del circulo: " + circulo1.calcularArea());
    System.out.println("Perimetro del circulo: " + circulo1.calcularLonxitude());        
    
    }
  
}        

