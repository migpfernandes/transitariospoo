package proj_TransitariosPOO;

import java.util.TreeSet;
import java.util.Iterator;

/**
 * Write a description of class Clientes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clientes
{
    // instance variables - replace the example below with your own
    private TreeSet <Cliente> clientes;

    /**
     * Constructor for objects of class Clientes
     */
    public Clientes()
    {
        // initialise instance variables
        this.clientes = new TreeSet <Cliente>();
    }
    
    public Clientes(Clientes clientes)
    {
        // initialise instance variables
        this.clientes = new TreeSet <Cliente>();
        Iterator <Cliente> it = clientes.getClientes();
        while(it.hasNext()){
            Cliente c = it.next();
            this.clientes.add(c.clone());
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Iterator <Cliente> getClientes()
    {
        TreeSet <Cliente> res = new TreeSet <Cliente>();
        for(Cliente c : this.clientes)
            res.add(c.clone());
        return res.iterator();
    }
    
  
    
    public boolean addCliente(Cliente c){
        if (this.clientes.contains(c))
            return false;
        else{
            this.clientes.add(c.clone());
            return true;
        }
    }
    
    public boolean removeCliente(Cliente c){
        if (!this.clientes.contains(c))
            return false;
        else{
            this.clientes.remove(c);
            return true;
        }
    }    
    
    public boolean removeCliente(String nome){
        Cliente c = this.getCliente(nome);
        if (c == null)
            return false;
        else{
            this.clientes.remove(c);
            return true;
        }
    }
    
    /*
     * Métodos de procura
     */
    public Cliente getCliente(String nome)
    {
        Cliente res = null;
        Iterator <Cliente> it = this.clientes.iterator();
        while ((it.hasNext()) && (res == null)){
            Cliente c = it.next();
            if (c.getNome().equals(nome))
                res = c.clone();
            }        
        return res;
    } 

    //Metodos da praxe    
    public boolean equals(Object clientes){
         if (this == clientes)
            return true;
            
        if ((clientes == null) || (this.getClass() != clientes.getClass()))
            return false;
        else{
            Boolean res = true;
            Iterator <Cliente> it = ((Clientes) clientes).clientes.iterator();
            while ((it.hasNext()) && res){
                Cliente c = it.next();
                res = this.clientes.contains(c);
            }
            return res;
        }
    } 
    
    public Clientes clone(){
        return new Clientes(this);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Iterator <Cliente> it = this.clientes.iterator();
        while(it.hasNext()){
            Cliente c = it.next();
            sb.append(c.toString());
        }
        return sb.toString();
    }
    
}
