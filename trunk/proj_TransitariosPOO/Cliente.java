package proj_TransitariosPOO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Cliente
{
    // instance variables - replace the example below with your own
    private String nome;
    private String morada;
    private String numContribuinte;
    private ArrayList<Produto> produtos;
    

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente()
    {
        this.nome = "";
        this.morada = "";
        this.numContribuinte = "";
        this.produtos = new ArrayList<Produto>();
    }

    
    public Cliente(String nome,String morada,String numContribuinte)
    {
        this.nome = nome;
        this.morada = morada;
        this.numContribuinte = numContribuinte;
        this.produtos = new ArrayList<Produto>();        
    }    
   
    public Cliente(Cliente cliente)
    {
        this.nome = cliente.getNome();
        this.morada = cliente.getMorada();        
        this.numContribuinte = cliente.getNumContribuinte();   
        this.produtos = new ArrayList<Produto>();
        
        Iterator <Produto> itr = cliente.getProdutos(); 
        while(itr.hasNext()) {            
            Produto prd = itr.next(); 
            this.produtos.add(prd.clone());
        } 
    }
    
    /*
     * Gets
     */
    public String getNome(){return this.nome;}
    public String getMorada(){return this.morada;}
    public String getNumContribuinte(){return this.numContribuinte;}
    public Iterator<Produto> getProdutos(){
        TreeSet <Produto> res = new TreeSet<Produto>();
        for (Produto p : this.produtos)
            res.add(p.clone());
        return res.iterator();
    };
  
    /*
     * Sets
     */
    public void setNome(String nome){ this.nome = nome;}
    public void setMorada(String morada){ this.morada = morada;}
    public void setNumContribuinte(String numcontribuinte){this.numContribuinte = numcontribuinte;}    
    
    
    /*
     * Métodos de adição, remoção, procura e listagem de produtos
     */
    
    
    //Metodos da praxe
    public boolean equals(Object cliente){
         if (this == cliente)
            return true;
            
        if ((cliente == null) || (this.getClass() != cliente.getClass()))
            return false;
        else{
            Cliente c = (Cliente) cliente;
            return (this.nome.equals(c.getNome()));         
        }
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.numContribuinte);
        sb.append(" ");
        sb.append(this.nome);
        sb.append(" ");
        sb.append(this.morada);
        return sb.toString();
    }
        
        
    public abstract Cliente clone();            
}
