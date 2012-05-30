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
        // initialise instance variables

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
