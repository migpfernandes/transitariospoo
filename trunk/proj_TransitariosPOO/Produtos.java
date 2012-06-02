package proj_TransitariosPOO;

import java.util.TreeSet;
import java.util.Iterator;
import java.io.Serializable;
/**
 * Write a description of class Produtos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Produtos implements Serializable
{
    // instance variables - replace the example below with your own
    private TreeSet <Produto> produtos;

    /**
     * Constructor for objects of class Clientes
     */
    public Produtos()
    {
        // initialise instance variables
        this.produtos = new TreeSet <Produto>();
    }
    
    public Produtos(Produtos produtos)
    {
        // initialise instance variables
        this.produtos = new TreeSet <Produto>();
        Iterator <Produto> it = produtos.getProdutos();
        while(it.hasNext()){
            Produto p = it.next();
            this.produtos.add(p.clone());
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */    
    public boolean addProduto(Produto p){
        if (this.produtos.contains(p))
            return false;
        else{
            this.produtos.add(p.clone());
            return true;
        }
    }
    
    public boolean removeProduto(Produto p){
        if (!this.produtos.contains(p))
            return false;
        else{
            this.produtos.remove(p);
            return true;
        }
    }    
    
    public boolean removeProduto(String nome){
        Produto p = this.getProduto(nome);
        if (p == null)
            return false;
        else{
            this.produtos.remove(p);
            return true;
        }
    }
    
    /*
     * Métodos de procura
     */
    public Produto getProduto(String nome)
    {
        Produto res = null;
        Iterator <Produto> it = this.produtos.iterator();
        while ((it.hasNext()) && (res == null)){
            Produto p = it.next();
            if (p.getNome().equals(nome))
                res = p.clone();
            }        
        return res;
    } 
    
    public Iterator <Produto> getProdutos()
    {
        TreeSet <Produto> res = new TreeSet <Produto>();
        for(Produto p : this.produtos)
            res.add(p.clone());
        return res.iterator();
    }    
    
    
    public double getCustoTotal(){
        double res = 0;
        Iterator <Produto> it = this.getProdutos();
        while (it.hasNext()){
            res += ((Produto) it.next()).getCustoProduto();
        }
        return res;
    }
    
    public double getPesoTotal(){
        double res = 0;
        Iterator <Produto> it = this.getProdutos();
        while (it.hasNext()){
            res += ((Produto) it.next()).getPesoSubcontratado();
        }
        return res;
    }    

    //Metodos da praxe    
    public boolean equals(Object produtos){
         if (this == produtos)
            return true;
            
        if ((produtos == null) || (this.getClass() != produtos.getClass()))
            return false;
        else{
            Boolean res = true;
            Iterator <Produto> it = ((Produtos) produtos).produtos.iterator();
            while ((it.hasNext()) && res){
                Produto p = it.next();
                res = this.produtos.contains(p);
            }
            return res;
        }
    } 
    
    public Produtos clone(){
        return new Produtos(this);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Iterator <Produto> it = this.produtos.iterator();
        while(it.hasNext()){
            Produto p = it.next();
            sb.append(p.toString());
        }
        return sb.toString();
    }
    
}
