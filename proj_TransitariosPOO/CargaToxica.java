package proj_TransitariosPOO;


/**
 * Write a description of class CargaToxica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CargaToxica extends Carga implements iCargaToxica
{

    public CargaToxica()
    {
        super();
    }
    
    public CargaToxica(String codigo, double peso, String descricao, double tempoCarregamento) {
        super(codigo,peso,descricao,tempoCarregamento);
    }    
    
    public CargaToxica(CargaToxica c)
    {
        super(c);
    }
    
    public CargaToxica clone(){return new CargaToxica(this);}
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
