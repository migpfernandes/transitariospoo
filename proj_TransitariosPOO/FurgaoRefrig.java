package proj_TransitariosPOO;


/**
 * Write a description of class FurgaoRefrig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgaoRefrig extends Furgao implements iRefrigeravel
{

    /**
     * Constructor for objects of class FurgaoRefrig
     */
    public FurgaoRefrig()
    {
        super();   
    }
    
    public FurgaoRefrig(String marca,String modelo,String matricula,String combustivel,
    double capacidade,double precoKm){
        super(marca,modelo,matricula,combustivel,capacidade,precoKm);
    }     
    
    public FurgaoRefrig(FurgaoRefrig f){
        super(f);
    }

    public FurgaoRefrig clone(){
        return new FurgaoRefrig(this);
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
