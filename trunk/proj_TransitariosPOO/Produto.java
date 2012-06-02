package proj_TransitariosPOO;

import java.io.Serializable;
/**
 * Write a description of class ProdutosComerciais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Produto implements Comparable <Produto>,Serializable
{
    // instance variables - replace the example below with your own
    private final double PBCatg1 = 12.34;
    private final double PBCatg2 = 11.2;
    private final double PBCatg3 = 10.5;
    private final double PBCatg4 = 10;
  
   
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
    
    public boolean addCarga(Carga c){
        return (this.cargas.addCarga(c));
    }
    
    public double getPesoSubcontratado(){
        return this.cargas.getPesoTotalCarga();
    }
    
    public Cargas getCargas(){
        return new Cargas(this.cargas);
    }
    
    public abstract double getCustoProduto();
    
    public final double getCustoBase(){
        
        //Categoria - Descrição --> PB/Kg
        //catg1 - até 100kg --> 12.34
        //catg2 - de 100 kg a 500 --> 11.2        
        //catg3 - de 500 kg a 1000 --> 10.5        
        //catg4 - a partir de 1000 --> 10          
        
        double pb;
        double pesoCarga = this.cargas.getPesoTotalCarga();
        if (pesoCarga <= 100)
            pb = PBCatg1;
        else if ((pesoCarga > 100) && (pesoCarga <= 500))    
            pb = PBCatg2;
        else if ((pesoCarga > 500) && (pesoCarga <= 1000))
            pb = PBCatg3;        
        else
            pb = PBCatg4;            
        
        
        return pb * pesoCarga;
    }
    
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
        sb.append("TotalCarga: ").append(this.getPesoSubcontratado()).append("\n");
        sb.append("Custo: ").append(this.getCustoProduto()).append("\n");        
        
        return sb.toString();
    }
    
    public int compareTo(Produto c){
        return this.nome.compareTo(c.getNome());
    }    
}
