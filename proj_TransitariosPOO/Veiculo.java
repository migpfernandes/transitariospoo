package proj_TransitariosPOO;

import java.util.TreeSet;
import java.util.Iterator;
/**
 * Abstract class Veiculo - write a description of the class here
 * 
 * @author Miguel Fernandes
 * @version 2012/05/15
 */
public abstract class Veiculo
{
    // instance variables - replace the example below with your own
    private String marca;
    private String modelo;
    private String matricula;
    private double capacidade;
    private double precoKm;
    private boolean emViagem;
    private TreeSet <Carga> cargas;
    
    
    private final double TAXAPARTIDA = 60;

    public Veiculo(){
        this.marca ="";
        this.modelo="";
        this.matricula="";
        this.capacidade = 0;
        this.precoKm = 0;
        this.emViagem = false;
        this.cargas = new TreeSet <Carga>();
    }
    
    public Veiculo(String marca,String modelo,String matricula,
                    double capacidade,double precoKm){
        this.marca =marca;
        this.modelo=modelo;
        this.matricula=matricula;
        this.capacidade = capacidade;
        this.precoKm = precoKm;
        this.emViagem = false;        
        this.cargas = new TreeSet <Carga>();        
    }
    
    
    public Veiculo(Veiculo veiculo){
        this.marca =veiculo.getMarca();
        this.modelo=veiculo.getModelo();
        this.matricula=veiculo.getMatricula();
        this.capacidade = veiculo.getCapacidade();
        this.precoKm = veiculo.getPrecoKm();
        this.emViagem = false;        
        this.cargas = new TreeSet <Carga>();   
        
        Iterator <Carga> it = veiculo.getCargas();
        while(it.hasNext()){
            Carga c = it.next();
            this.cargas.add(c.clone());
        }
    }
    
    
    /**
     * Gets
     */
    public String getMarca(){return this.marca;}
    public String getModelo(){return this.modelo;}
    public String getMatricula(){return this.matricula;}
    public double getCapacidade(){return this.capacidade;}    
    public double getPrecoKm(){return this.precoKm;} 


    /**
     * Sets
     */    
    public void setMarca(String marca){ this.marca = marca;}
    public void setModelo(String modelo){ this.modelo = modelo;}
    public void setMatricula(String matricula){ this.matricula = matricula;}
    public void setCapacidade(double capacidade){ this.capacidade = capacidade;}   
    public void setPrecoKm(double precoKm){ this.precoKm = precoKm;}   
    
    
    /*
     * Métodos relativos à manipulação de cargas
     */
    public Iterator <Carga> getCargas(){
        TreeSet <Carga> res = new TreeSet <Carga>();
        for (Carga c : this.cargas)
            res.add(c.clone());
        
        return res.iterator();
    }
    
    
    public boolean addCargas(TreeSet <Carga> cargas){
        double pesoCargas = 0;
        double pesoDisponivel = this.espacoDisponivel();
        boolean perecivel = false;
        boolean toxica = false;
        
        for (Carga c : cargas){
            pesoCargas += c.getPeso();
            if (c instanceof iCargaPerecivel)
                perecivel = true;
            else if (c instanceof iCargaToxica)
                toxica = true;
        }
        if (pesoCargas > pesoDisponivel)
            return false;
        else if (perecivel && !(this instanceof iRefrigeravel))
            return false;
        else if (toxica && (this instanceof iRefrigeravel))
            return false;
        else{
            for (Carga c : cargas)
                this.cargas.add(c.clone());
            if (this.Ocupacao() >= TAXAPARTIDA)
                this.setVeiculoEmViagem();
            return true;    
        }
    }
    
    public double espacoDisponivel(){
        double capUtilizada = 0;
        for (Carga c : this.cargas)
            capUtilizada += c.getPeso();
        return (this.capacidade - capUtilizada);
        
    }
    
    public double Ocupacao(){
        double capUtilizada = 0;
        for (Carga c : this.cargas)
            capUtilizada += c.getPeso();
        return ((this.capacidade - capUtilizada) * 100 / this.capacidade);
        
    }    
    
    //Partida e chegada de veiculos
    public void setVeiculoEmViagem(){
        this.emViagem = true;
    }
    
    public boolean setVeiculoChegada(){
        if (!this.emViagem)
            return false;
        else{
            this.cargas = new TreeSet <Carga>();
            this.emViagem = false;
            return true;
        }
    }
    
    //Métodos da praxe
    public abstract Veiculo clone();
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("VEICULO:\n");
        sb.append("Matricula: ").append(this.matricula).append("\n");        
        sb.append("Marca: ").append(this.marca).append("\n");
        sb.append("Modelo: ").append(this.modelo).append("\n");
        sb.append("Capacidade: ").append(this.capacidade).append("\n");
        sb.append("PrecoKm: ").append(this.precoKm).append("\n");        
        return sb.toString();
    }
    
    public boolean equals(Object veiculo){
        if (this == veiculo)
            return true;
            
        if ((veiculo == null) || (this.getClass() != veiculo.getClass()))
            return false;
        else{
            Veiculo v = (Veiculo) veiculo;
            return (this.matricula.equals(v.getMatricula()));            
        }

    }
    
}
