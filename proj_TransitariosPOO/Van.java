package proj_TransitariosPOO;


/**
 * Write a description of class Vans here.
 * 
 * @author Miguel Fernandes
 * @version 2012-05-14
 */
public class Van extends Veiculo implements iRefrigeravel
{

    /**
     * Constructor for objects of class Vans
     */
    public Van()
    {
       super();
    }
    
    public Van(String marca,String modelo,String matricula,double capacidade,double precoKm){
                        super(marca,modelo,matricula,capacidade,precoKm);
    }
    
    
    public Van(Van van){
        super(van);
    }  

    public String toString(){
       return super.toString();
    }
    
    public Van clone(){
        return new Van(this);
    }
    
    //Metodos da praxe
    public boolean equals(Object van){
         if (this == van)
            return true;
            
        if ((van == null) || (this.getClass() != van.getClass()))
            return false;
        else{
            return super.equals(van);            
        }
    }    
}
