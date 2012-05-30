package proj_TransitariosPOO;


/**
 * Write a description of class ProdutosComerciais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Produto
{
    // instance variables - replace the example below with your own
    private final double PBVan = 12;
    private final double PBFurgao = 12;
    private final double PBCamiao = 12;
 
    
    private String nome;
    private Cargas cargas;
    
    /**
     * Constructor for objects of class ProdutosComerciais
     */
    public Produto()
    {
        this.nome = "";
        this.cargas = new Cargas();
    }
    
    public Produto(String nome)
    {
        this.nome = nome;
        this.cargas = new Cargas();        
    }
    
    public Produto(String nome,Cargas cargas)
    {
        this.nome = nome;
        this.cargas = cargas.clone();
    }    
    
    public Produto(Produto p)
    {
        this.nome = p.getNome();
        this.cargas = p.getCargas();
    }
    
    public String getNome(){return this.nome;}
    
    public void setNome(String nome){this.nome = nome;}
    
    public abstract boolean addCarga(Carga c);
    
    public Cargas getCargas(){
        return new Cargas(this.cargas);
    }
    
    public abstract double getCustoProduto();
    
    /*
     * Métodos da praxe
     */
    public abstract Produto clone();
    
        public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Produto prod = (Produto) o;
        if ((this.nome.equals(prod.getNome())) && (this.cargas.equals(prod.getCargas()))) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder("Produto:\n");
        sb.append("Nome: ").append(this.getNome()).append("\n");
        
        return sb.toString();
    }
}
