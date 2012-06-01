package proj_TransitariosPOO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
/**
 * Write a description of class Cargas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cargas
{
    // instance variables - replace the example below with your own
    private HashMap<String,Carga> cargas;

    /**
     * Constructor for objects of class Cargas
     */
    public Cargas()
    {
        // initialise instance variables
        this.cargas = new HashMap<String,Carga>();
    }
    
    public Cargas(Cargas c){
        this.cargas = c.getCargas();
    }
    
    
    public HashMap<String,Carga> getCargas(){
        HashMap <String,Carga> res = new HashMap<String,Carga>();
        for (Carga c : this.cargas.values())
            res.put(c.getCodigo(),c.clone());
        return res;
    }
    
    public Iterator<Carga> getCargasIterator(){
        TreeSet <Carga> res = new TreeSet<Carga>();
        for (Carga c : this.cargas.values())
            res.add(c.clone());
        return res.iterator();
    }    
    
    public boolean addCarga(Carga c){
        if (this.getCargas().containsValue(c))
            return false;
        else{
            this.cargas.put(c.getCodigo(),c.clone());
            return true;
        }
    }

    
    public Carga getCarga(String codigo){
        if (this.cargas.containsKey(codigo))
            return this.cargas.get(codigo).clone();
        else
            return null;
    }
    
    //Metodos da praxe    
    public boolean equals(Object cargas){
         if (this == cargas)
            return true;
            
        if ((cargas == null) || (this.getClass() != cargas.getClass()))
            return false;
        else{
            Boolean res = true;
            Iterator <Carga> it = ((Cargas) cargas).getCargasIterator();
            while ((it.hasNext()) && res){
                Carga c = it.next();
                res = this.cargas.containsValue(c);
            }
            return res;
        }
    } 
    
    public Cargas clone(){
        return new Cargas(this);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("CARGAS:\n");
        Iterator <Carga> it = this.getCargasIterator();
        while(it.hasNext()){
            Carga c = it.next();
            sb.append(c.toString());
        }
        return sb.toString();
    } 
    
}
