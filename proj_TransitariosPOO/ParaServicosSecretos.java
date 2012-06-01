package proj_TransitariosPOO;


/**
 * Write a description of class ParaServicosSecretos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParaServicosSecretos extends Produto
{
    // instance variables - replace the example below with your own
    private final double taxaServicoSimples = 0.8;
    private final double taxaSegredoEstado = 3;    
    private final int numCargas = 1;

    
   public ParaServicosSecretos()
    {
        super();
    }
    
    public ParaServicosSecretos(String nome)
    {
        super(nome);
    }
    
    public ParaServicosSecretos(String nome,Cargas cargas)
    {
        super(nome,cargas);
    }    
    
    public ParaServicosSecretos(ParaServicosSecretos p)
    {
        super(p);
    }
    
    
    public double getCustoProduto(){
        return (taxaServicoSimples * taxaSegredoEstado * super.getCustoBase());
    }
    
    public boolean addCarga(Carga c){
        Cargas cargas;
        if (!(c instanceof iCargaToxica))
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
    public ParaServicosSecretos clone(){return new ParaServicosSecretos(this);}
    
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
