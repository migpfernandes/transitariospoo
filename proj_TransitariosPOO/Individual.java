package proj_TransitariosPOO;


/**
 * Write a description of class Individual here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Individual extends Cliente
{

    /**
     * Constructor for objects of class Individual
     */
    public Individual()
    {
        super();
    }

    
    public Individual(String nome,String morada,String numContribuinte)
    {
        super(nome,morada,numContribuinte);
    }    
   
    public Individual(Individual cliente)
    {
        super(cliente);
    }
    
    /*
     * Métodos da praxe
     */
    public Individual clone(){return new Individual(this);}
    public String toString(){return super.toString();}
    
    public boolean equals(Object ind){
         if (this == ind)
            return true;
            
        if ((ind == null) || (this.getClass() != ind.getClass()))
            return false;
        else{
            return (super.equals(ind));         
        }
    }
    
}
