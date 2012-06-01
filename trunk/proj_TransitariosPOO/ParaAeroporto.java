package proj_TransitariosPOO;


/**
 * Write a description of class ParaAeroporto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParaAeroporto extends Produto
{
    // instance variables - replace the example below with your own
    private final double taxaServicoSimples = 0.85;
    private final int numCargas = 3;

    
   public ParaAeroporto()
    {
        super();
    }
    
    public ParaAeroporto(String nome)
    {
        super(nome);
    }
    
    public ParaAeroporto(String nome,Cargas cargas)
    {
        super(nome,cargas);
    }    
    
    public ParaAeroporto(ParaAeroporto p)
    {
        super(p);
    }

    
    public double getCustoProduto(){
        return (taxaServicoSimples * super.getCustoBase());
    }
    
    public boolean addCarga(Carga c){
        Cargas cargas;
        if (!(c instanceof iCargaIndiferenciada))
            return false;
        else{
            cargas = super.getCargas();
            if (cargas.getCargas().size() >= numCargas)
                return false;
            else
                return super.addCarga(c);
            }
    }      
    
    /*
     * Métodos da praxe
     */
    public ParaAeroporto clone(){return new ParaAeroporto(this);}
    
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
            return super.equals(o);
    }
    
    public String toString()
    {
        return super.toString();
    } 
}
