package proj_TransitariosPOO;


/**
 * Write a description of class CargaIndiferenciada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CargaIndiferenciada extends Carga implements iCargaIndiferenciada
{
public CargaIndiferenciada()
    {
        super();
    }
    
    public CargaIndiferenciada(CargaIndiferenciada c)
    {
        super(c);
    }
    
    public CargaIndiferenciada clone(){return new CargaIndiferenciada(this);}
    public String toString(){return super.toString();}
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
            
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        else{
            return super.equals(o);            
        }
        
    }
}
