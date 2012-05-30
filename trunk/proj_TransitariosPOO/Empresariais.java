package proj_TransitariosPOO;


/**
 * Write a description of class Empresariais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empresariais extends Cliente
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Empresariais
     */
    public Empresariais()
    {
        super();
    }

    
    public Empresariais(String nome,String morada,String numContribuinte)
    {
        super(nome,morada,numContribuinte);
    }    
   
    public Empresariais(Empresariais cliente)
    {
        super(cliente);
    }
    
    /*
     * Métodos de praxe
     */
    public Empresariais clone(){return new Empresariais(this);}
    public String toString(){return super.toString();}
    
    public boolean equals(Object emp){
         if (this == emp)
            return true;
            
        if ((emp == null) || (this.getClass() != emp.getClass()))
            return false;
        else{
            return (super.equals(emp));         
        }
    }
}
