package boletin_4_2;

public class Satelite{
 
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public Satelite(){

        meridiano = 0; 
        paralelo = 0;
        distanciaTerra = 0 ;
    }

    public Satelite(double m,double p,double d){

        meridiano = m;
        paralelo = p;
        distanciaTerra = d;
    }

    public void getPosicion(){
        System.out.println ("o satelite atopase no paralelo"+ paralelo  + "meridiano" +meridiano  +"a unha distancia da terra" +distanciaTerra);  
        
    }

}
