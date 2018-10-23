package boletin_4_4;

/**
 *
 * @author emendezduran
 */
public class Stock {
   
    private float pulpo;
    private float patatas;
    
     public Stock(){}
 
    public Stock(float pulpo, float patatas){
        this.pulpo= pulpo;
        this.patatas= patatas;
    }
    
    public float capacidadstock(){
        float capacidadPulpo = (pulpo/2); 
        float capacidadPatatas = (patatas/1);        
        float capacidadRaciones = ((capacidadPulpo + capacidadPatatas)*3);
        int capacidadPersonas = (int) capacidadRaciones;
        return capacidadPersonas;
    } 
    
   public void setKgPulpo(float masPulpo){ 
    this.pulpo= masPulpo;
    }
    
    public void setKgPatatas(float masPatatas){ 
    this.patatas= masPatatas;
    }
    
}
