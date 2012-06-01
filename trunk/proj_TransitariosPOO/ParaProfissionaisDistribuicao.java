package proj_TransitariosPOO;


/**
 * Write a description of class ParaProfissionaisDistribuicao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParaProfissionaisDistribuicao extends Produto
{
    // instance variables - replace the example below with your own
    private final double taxaServicoSimples = 0.85;
    private final double taxaRefrigeracao = 1.50;
    private final int numCargas = 10;

    
   public ParaProfissionaisDistribuicao()
    {
        super();
    }
    
    public ParaProfissionaisDistribuicao(String nome)
    {
        super(nome);
    }
    
    public ParaProfissionaisDistribuicao(String nome,Cargas cargas)
    {
        super(nome,cargas);
    }    
    
    public ParaProfissionaisDistribuicao(ParaProfissionaisDistribuicao p)
    {
        super(p);
    }
    
    
    public double getCustoProduto(){
        return (taxaServicoSimples * taxaRefrigeracao * super.getCustoBase());
    }
    
    public boolean addCarga(Carga c){
        Cargas cargas;
        if (!(c instanceof iCargaPerecivel))
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
    public ParaProfissionaisDistribuicao clone(){return new ParaProfissionaisDistribuicao(this);}
    
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
