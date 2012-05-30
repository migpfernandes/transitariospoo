package proj_TransitariosPOO;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;
/**
 * Write a description of class Veiculos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Veiculos
{
    // instance variables - replace the example below with your own
    private TreeMap <String,Veiculo> veiculos;

    /**
     * Constructor for objects of class Veiculos
     */
    public Veiculos()
    {
        // initialise instance variables
        this.veiculos = new TreeMap <String,Veiculo>();
    }
    
    public Veiculos(Veiculos veiculos)
    {
        // initialise instance variables
        this.veiculos = new TreeMap <String,Veiculo>();
        Iterator <Veiculo> it = veiculos.getVeiculos();
        while(it.hasNext()){
            Veiculo v = it.next();
            this.veiculos.put(v.getMatricula(),v.clone());
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Iterator <Veiculo> getVeiculos()
    {
        TreeSet <Veiculo> res = new TreeSet <Veiculo>();
        for(Veiculo v : this.veiculos.values())
            res.add(v.clone());
        return res.iterator();
    }
    
    public Iterator <Veiculo> getVans()
    {
        TreeSet <Veiculo> res = new TreeSet <Veiculo>();
        for(Veiculo v : this.veiculos.values())
            if (v instanceof Van)
                res.add(v.clone());
        return res.iterator();
    }   
    
    public Iterator <Veiculo> getCamioes()
    {
        TreeSet <Veiculo> res = new TreeSet <Veiculo>();
        for(Veiculo v : this.veiculos.values())
            if (v instanceof Camiao)
                res.add(v.clone());
        return res.iterator();
    }     
    
    public Iterator <Veiculo> getFurgoes()
    {
        TreeSet <Veiculo> res = new TreeSet <Veiculo>();
        for(Veiculo v : this.veiculos.values())
            if (v instanceof Furgao)
                res.add(v.clone());
        return res.iterator();
    }  
    
    public Iterator <Veiculo> getVeiculoRefrig()
    {
        TreeSet <Veiculo> res = new TreeSet <Veiculo>();
        for(Veiculo v : this.veiculos.values())
        if (v instanceof iRefrigeravel)
                res.add(v.clone());
        return res.iterator();
    }     
    
    public boolean addVeiculo(Veiculo v){
        if (this.veiculos.containsKey(v.getMatricula()))
            return false;
        else{
            this.veiculos.put(v.getMatricula(),v.clone());
            return true;
        }
    }
    
    public boolean removeVeiculo(Veiculo v){
        if (!this.veiculos.containsKey(v.getMatricula()))
            return false;
        else{
            this.veiculos.remove(v.getMatricula());
            return true;
        }
    }    
    
    public boolean removeVeiculo(String matricula){
        if (!this.veiculos.containsKey(matricula))
            return false;
        else{
            this.veiculos.remove(matricula);
            return true;
        }
    }
    
    /*
     * Métodos de procura
     */
    public Veiculo getVeiculo(String matricula)
    {
        if (this.veiculos.containsKey(matricula)){
            return this.veiculos.get(matricula).clone();
        }
        return null;
    }


    //Metodos da praxe    
    public boolean equals(Object veiculos){
         if (this == veiculos)
            return true;
            
        if ((veiculos == null) || (this.getClass() != veiculos.getClass()))
            return false;
        else{
            Boolean res = true;
            Iterator <Veiculo> it = ((Veiculos) veiculos).getVeiculos();
            while ((it.hasNext()) && res){
                Veiculo v = it.next();
                res = this.veiculos.containsValue(v);
            }
            return res;
        }
    } 
    
    public Veiculos clone(){
        return new Veiculos(this);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("VEICULOS:\n");
        Iterator <Veiculo> it = this.getVeiculos();
        while(it.hasNext()){
            Veiculo v = it.next();
            sb.append(v.toString());
        }
        return sb.toString();
    }
    
}
