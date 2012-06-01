package proj_TransitariosPOO;


/**
 * Write a description of class ServicoSimples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ServicoSimples extends Produto
{
    
   public ServicoSimples()
    {
        super();
    }
    
    public ServicoSimples(String nome)
    {
        super(nome);
    }
    
    public ServicoSimples(String nome,Cargas cargas)
    {
        super(nome,cargas);
    }    
    
    public ServicoSimples(ServicoSimples p)
    {
        super(p);
    }

    public double getCustoProduto(){
        return (super.getCustoBase());
    }
    
    public boolean addCarga(Carga c){
        Cargas cargas;
        if (!(c instanceof iCargaIndiferenciada))
            return false;
        else{
                return super.addCarga(c);
            }
    }

    
    /*
     * Métodos da praxe
     */
    public ServicoSimples clone(){return new ServicoSimples(this);}
    
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
