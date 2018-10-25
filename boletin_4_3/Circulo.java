package boletin_4_3;

public class Circulo {
    
    private double radio;
    final double PI = 3.14;

    public Circulo() {
        radio = 0;
    }

    public Circulo(double r) {
        radio = r;
    }

    public void setradio(double r) {
        radio = r;
    }

    public double calcularArea() {
        double area = PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularLonxitude() {
        double perimetro = ((2 * PI) * radio);
        return perimetro;
    }
     
       
        
        
}
