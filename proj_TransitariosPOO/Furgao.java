package proj_TransitariosPOO;


/**
 * Write a description of class Furgoes here.
 * 
 * @author Miguel Fernandes
 * @version 2012-05-14
 */
public class Furgao extends Veiculo
{
    private String tipoCombustivel;

    /**
     * Constructor for objects of class Furgao
     */
    public Furgao()
    {
        super();
        this.tipoCombustivel = "";
    }
    
    public Furgao(String marca,String modelo,String matricula,String combustivel,
    double capacidade,double precoKm){
        super(marca,modelo,matricula,capacidade,precoKm);
        this.tipoCombustivel = combustivel;
    }
    
    
    public Furgao(Furgao furgao){
        super(furgao);
        this.tipoCombustivel = furgao.getTipoCombustivel();
    }    

    
    /*
     * Gets
     */
    public String getTipoCombustivel(){return this.tipoCombustivel;}
    
    /*
     * Sets
     */
    public void setTipoCombustivel(String tipoCombustivel){this.tipoCombustivel = tipoCombustivel;}
    
    
    public double getAutonomiaKm()
    {
        return -1;
    }
    
    public String toString(){
        return super.toString();
    }
    
    public Furgao clone(){
        return new Furgao(this);
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
