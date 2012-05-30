package proj_TransitariosPOO;


/**
 * Write a description of class Camioes here.
 * 
 * @author Miguel Fernandes
 * @version 2012-05-14
 */
public class Camiao extends Veiculo
{
    // instance variables - replace the example below with your own
    private String condutor;
    private boolean atrelado;
    private double altura;

    /**
     * Constructor for objects of class Camioes
     */
    public Camiao()
    {
        // initialise instance variables
        super();
        this.condutor = "";
        this.atrelado = false;
        this.altura = 0;
    }
   
    
    public Camiao(String marca,String modelo,String matricula,double capacidade,String condutor,
    boolean atrelado,double altura,double precoKm){
                        super(marca,modelo,matricula,capacidade,precoKm);
                        this.condutor = condutor;
                        this.atrelado = atrelado;
                        this.altura = altura;
    }
    
    public Camiao(Camiao camiao){
                        super(camiao);
                        this.condutor = camiao.getCondutor();
                        this.atrelado = camiao.getAtrelado();
                        this.altura = camiao.getAltura();
    }

    /**
     * Gets
     */
    public String getCondutor(){return this.condutor;}
    public boolean getAtrelado(){return this.atrelado;}
    public double getAltura(){return this.altura;}
    
    
    /**
     * Sets
     */
    public void setCondutor(String condutor){ this.condutor = condutor;}
    public void setAtrelado(boolean atrelado){ this.atrelado = atrelado;}
    public void setAltura(double altura){ this.altura = altura;}  
    


    
    //Metodos da praxe
    public boolean equals(Object camiao){
         if (this == camiao)
            return true;
            
        if ((camiao == null) || (this.getClass() != camiao.getClass()))
            return false;
        else{
            return super.equals(camiao);            
        }
    }
    
    public Camiao clone(){
        return new Camiao(this);
    }
    
    public String toString(){return super.toString();}
}
