package proj_TransitariosPOO;


/**
 * Write a description of class ClasseTeste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClasseTeste
{
    // instance variables - replace the example below with your own
    private TransitariosPooSistema emp;

    public void main(String args[]){
        this.emp = new TransitariosPooSistema("Empresa Espetáculo");
        geraVeiculos();
        geraClientes();
        geraProdutos();
        
        System.out.print(this.emp.ListaVeiculosPorEstado());                
        System.out.print(this.emp.ListaClientesNome());
        System.out.print(this.emp.ListaClientePorValorSubcontratado());
        
        
        emp.saveDB();
        
        TransitariosPooSistema emp2 = new TransitariosPooSistema();
        emp2.loadDB();
        if (emp.equals(emp2))
            System.out.print("Ficheiro guardado e restaurado com sucesso!");
        else    
            System.out.print("Ficheiro guardado e restaurado com sucesso!") ;       
    }
    
    private void geraVeiculos(){
        FurgaoNRefrig v1 = new FurgaoNRefrig("Ford","Transit","UI-00-00","G",300,1.20);
        FurgaoNRefrig v2 = new FurgaoNRefrig("Ford","Transit","UI-00-01","G",330,1.23);        
        FurgaoNRefrig v3 = new FurgaoNRefrig("Ford","Transit","UI-00-02","G",320,1.22);   
        
        FurgaoRefrig v4 = new FurgaoRefrig("VW","Transit","UI-00-03","G",400,1.40);
        FurgaoRefrig v5 = new FurgaoRefrig("VW","Transit","UI-00-04","G",370,1.43);        
        FurgaoRefrig v6 = new FurgaoRefrig("VW","Transit","UI-00-05","G",390,1.42); 
        
        Camiao v7 = new Camiao("Mercedes","Transit","UI-00-06",1000, "FREITAS",true,4.2,3.42); 
        Camiao v8 = new Camiao("Mercedes","Transit","UI-00-07",1200, "FREITAS",true,4.2,3.42); 
        Camiao v9 = new Camiao("Mercedes","Transit","UI-00-08",1500, "FREITAS",true,4.2,3.42);         

        Van v10 = new Van("Porsche","Transit","UI-00-10",500,1.42);         
        Van v11 = new Van("Porsche","Transit","UI-00-11",540,1.12);
        Van v12 = new Van("Porsche","Transit","UI-00-12",570,1.32);   
         
        
        
        this.emp.addVeiculo(v1);
        this.emp.addVeiculo(v2);
        this.emp.addVeiculo(v3);        
        this.emp.addVeiculo(v4);
        this.emp.addVeiculo(v5);
        this.emp.addVeiculo(v6);
        this.emp.addVeiculo(v7);
        this.emp.addVeiculo(v8);
        this.emp.addVeiculo(v9);
        this.emp.addVeiculo(v10);
        this.emp.addVeiculo(v11);
        this.emp.addVeiculo(v12);    
       
        
    }
    
    private void geraClientes(){
        Individual c1 = new Individual("Freitas1","Viana do Castelo","0000011");
        Individual c2 = new Individual("Freitas2","Viana do Castelo","0000012");
        Individual c3 = new Individual("Freitas3","Viana do Castelo","0000013");        
        Individual c4 = new Individual("Freitas4","Viana do Castelo","0000014");
        Individual c5 = new Individual("Freitas5","Viana do Castelo","0000015");
        Individual c6 = new Individual("Freitas6","Viana do Castelo","0000016");
        
        Empresariais c7 = new Empresariais("Freitas7","Viana do Castelo","0000017");
        Empresariais c8 = new Empresariais("Freitas8","Viana do Castelo","0000018");
        Empresariais c9 = new Empresariais("Freitas9","Viana do Castelo","0000019");
        Empresariais c10 = new Empresariais("Freitas10","Viana do Castelo","0000020");
        Empresariais c11 = new Empresariais("Freitas11","Viana do Castelo","0000021");
        Empresariais c12 = new Empresariais("Freitas12","Viana do Castelo","0000022");
        Empresariais c13 = new Empresariais("Freitas13","Viana do Castelo","0000023");
        
        this.emp.addCliente(c1);
        this.emp.addCliente(c2);
        this.emp.addCliente(c3);
        this.emp.addCliente(c4);
        this.emp.addCliente(c5);
        this.emp.addCliente(c6);
        this.emp.addCliente(c7);
        this.emp.addCliente(c8);
        this.emp.addCliente(c9);
        this.emp.addCliente(c10);
        this.emp.addCliente(c11);
        this.emp.addCliente(c12);
        this.emp.addCliente(c13);
        
    }
    
    
    private void geraProdutos(){
        CargaIndiferenciada c1 = new CargaIndiferenciada("00011",20,"Teste de funcionamento.",10);
        CargaIndiferenciada c2 = new CargaIndiferenciada("00012",20,"Teste de funcionamento.",20);
        CargaIndiferenciada c3 = new CargaIndiferenciada("00013",20,"Teste de funcionamento.",20);
        CargaIndiferenciada c4 = new CargaIndiferenciada("00014",20,"Teste de funcionamento.",20);
        CargaIndiferenciada c5 = new CargaIndiferenciada("00015",20,"Teste de funcionamento.",20);
        CargaIndiferenciada c6 = new CargaIndiferenciada("00016",20,"Teste de funcionamento.",20);
        CargaIndiferenciada c7 = new CargaIndiferenciada("00017",20,"Teste de funcionamento.",20);
        CargaIndiferenciada c8 = new CargaIndiferenciada("00018",20,"Teste de funcionamento.",20);
        CargaIndiferenciada c9 = new CargaIndiferenciada("00019",20,"Teste de funcionamento.",20);
        CargaIndiferenciada c10 = new CargaIndiferenciada("00020",20,"Teste de funcionamento.",30);
        CargaIndiferenciada c11 = new CargaIndiferenciada("00021",20,"Teste de funcionamento.",30);
        CargaIndiferenciada c12 = new CargaIndiferenciada("00022",20,"Teste de funcionamento.",40);
        CargaIndiferenciada c13 = new CargaIndiferenciada("00023",20,"Teste de funcionamento.",40);
        CargaIndiferenciada c14 = new CargaIndiferenciada("00024",20,"Teste de funcionamento.",25);
        CargaIndiferenciada c15 = new CargaIndiferenciada("00025",20,"Teste de funcionamento.",12);
        CargaIndiferenciada c16 = new CargaIndiferenciada("00026",20,"Teste de funcionamento.",13);
        CargaIndiferenciada c17 = new CargaIndiferenciada("00027",20,"Teste de funcionamento.",16);
        CargaIndiferenciada c18 = new CargaIndiferenciada("00028",20,"Teste de funcionamento.",19);
        CargaIndiferenciada c19 = new CargaIndiferenciada("00029",20,"Teste de funcionamento.",10);
        CargaIndiferenciada c20 = new CargaIndiferenciada("00030",20,"Teste de funcionamento.",10);
        
        
        CargaPerecivel c21 = new CargaPerecivel("00111",20,"Teste de funcionamento.",10);
        CargaPerecivel c22 = new CargaPerecivel("00112",20,"Teste de funcionamento.",20);
        CargaPerecivel c23 = new CargaPerecivel("00113",20,"Teste de funcionamento.",20);
        CargaPerecivel c24 = new CargaPerecivel("00114",20,"Teste de funcionamento.",20);
        CargaPerecivel c25 = new CargaPerecivel("00115",20,"Teste de funcionamento.",20);
        CargaPerecivel c26 = new CargaPerecivel("00116",20,"Teste de funcionamento.",20);
        CargaPerecivel c27 = new CargaPerecivel("00117",20,"Teste de funcionamento.",20);
        CargaPerecivel c28 = new CargaPerecivel("00118",20,"Teste de funcionamento.",20);
        CargaPerecivel c29 = new CargaPerecivel("00119",20,"Teste de funcionamento.",20);
        CargaPerecivel c30 = new CargaPerecivel("00120",20,"Teste de funcionamento.",30);
        CargaPerecivel c31 = new CargaPerecivel("00121",20,"Teste de funcionamento.",30);
        CargaPerecivel c32 = new CargaPerecivel("00122",20,"Teste de funcionamento.",40);
        CargaPerecivel c33 = new CargaPerecivel("00123",20,"Teste de funcionamento.",40);
        CargaPerecivel c34 = new CargaPerecivel("00124",20,"Teste de funcionamento.",25);
        CargaPerecivel c35 = new CargaPerecivel("00125",20,"Teste de funcionamento.",12);
        CargaPerecivel c36 = new CargaPerecivel("00126",20,"Teste de funcionamento.",13);
        CargaPerecivel c37 = new CargaPerecivel("00127",20,"Teste de funcionamento.",16);
        CargaPerecivel c38 = new CargaPerecivel("00128",20,"Teste de funcionamento.",19);
        CargaPerecivel c39 = new CargaPerecivel("00129",20,"Teste de funcionamento.",10);
        CargaPerecivel c40 = new CargaPerecivel("00130",20,"Teste de funcionamento.",10);
        
         ServicoSimples s1 = new ServicoSimples("ServicoSimples1");
         ServicoSimples s2 = new ServicoSimples("ServicoSimples2");
         ServicoSimples s3 = new ServicoSimples("ServicoSimples3");
         ServicoSimples s4 = new ServicoSimples("ServicoSimples4");
         ServicoSimples s5 = new ServicoSimples("ServicoSimples5");
         ServicoSimples s6 = new ServicoSimples("ServicoSimples6");
 
         ParaAeroporto s7 = new ParaAeroporto("ServicoSimples6");
         
         s1.addCarga(c1);
         s1.addCarga(c2);
         s1.addCarga(c3);
         s1.addCarga(c4);
         s1.addCarga(c5);
         s1.addCarga(c6);
         s1.addCarga(c7);
         s1.addCarga(c8);
         s1.addCarga(c9);
         s1.addCarga(c40);
         
         s7.addCarga(c10);
         s7.addCarga(c12);
         s7.addCarga(c13);
         s7.addCarga(c14);         
         
         System.out.print("Produto S1: " + s1.toString() + "\n");
         System.out.print("Produto S7: " + s7.toString() + "\n");
         
        this.emp.addProduto(s1, "0000011");
        this.emp.addProduto(s7, "0000011");        
        
    }    
}
