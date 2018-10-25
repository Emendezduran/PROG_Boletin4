package boletin_4_4;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_4_4 {

    public static void main(String[] args) {

        System.out.println("Teclee cuantos KG de Pulpo dispone:");
        Scanner scanKg = new Scanner(System.in);
        float pulpo = scanKg.nextFloat();

        System.out.println("Teclee cuantos KG de Patatas dispone:");
        float patatas = scanKg.nextFloat();

        Stock servicio1 = new Stock(pulpo, patatas);

        System.out.println(servicio1.capacidadstock());
    }
}
