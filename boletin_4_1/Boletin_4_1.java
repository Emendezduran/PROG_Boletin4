package boletin_4_1;

public class Boletin_4_1 {

    public static void main(String[] args) {

        Coche ferrari = new Coche();
        System.out.println("Velocidad inicial:" + ferrari.getVelocidade());

        ferrari.acelerar(112);
        System.out.println("Velocidad Post-aceleracion:" + ferrari.getVelocidade());

        ferrari.frenar(100);
        System.out.println("Velocidad Post-frenado:" + ferrari.getVelocidade());
    }

}
