package proj_TransitariosPOO;


/**
 * Write a description of class FurgaoNRefrig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgaoNRefrig extends Furgao
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class FurgaoNRefrig
     */
    public FurgaoNRefrig()
    {
        super();
    }
    
    public FurgaoNRefrig(String marca,String modelo,String matricula,String combustivel,
    double capacidade,double precoKm){
        super(marca,modelo,matricula,combustivel,capacidade,precoKm);
    }    
    
    public FurgaoNRefrig(FurgaoNRefrig f){
        super(f);
    }

    public FurgaoNRefrig clone(){
        return new FurgaoNRefrig(this);
    }
    
    public String toString(){
        return super.toString();
    }
    
    //Metodos da praxe
    public boolean equals(Object furgao){
         if (this == furgao)
            return true;
            
        if ((furgao == null) || (this.getClass() != furgao.getClass()))
            return false;
        else{
            return super.equals(furgao);            
        }
    }     
}
