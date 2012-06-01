package proj_TransitariosPOO;


/**
 * Write a description of class ParaQueridaMudeiACasa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParaQueridaMudeiACasa extends Produto
{
    // instance variables - replace the example below with your own
    private final double taxaServicoSimples = 0.9;
    private final int numCargas = 10;

    
   public ParaQueridaMudeiACasa()
    {
        super();
    }
    
    public ParaQueridaMudeiACasa(String nome)
    {
        super(nome);
    }
    
    public ParaQueridaMudeiACasa(String nome,Cargas cargas)
    {
        super(nome,cargas);
    }    
    
    public ParaQueridaMudeiACasa(ParaQueridaMudeiACasa p)
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
    public ParaQueridaMudeiACasa clone(){return new ParaQueridaMudeiACasa(this);}
    
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
