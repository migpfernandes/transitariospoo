package proj_TransitariosPOO;


/**
 * Write a description of class CargaPerecivel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CargaPerecivel extends Carga implements iCargaPerecivel
{

    public CargaPerecivel()
    {
        super();
    }
    
    public CargaPerecivel(String codigo, double peso, String descricao, double tempoCarregamento) {
        super(codigo,peso,descricao,tempoCarregamento);
    }       
    
    public CargaPerecivel(CargaPerecivel c)
    {
        super(c);
    }
    
    public CargaPerecivel clone(){return new CargaPerecivel(this);}
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
