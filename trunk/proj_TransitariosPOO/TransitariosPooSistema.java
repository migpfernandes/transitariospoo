package proj_TransitariosPOO;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

/**
 * Write a description of class TransitariosPOO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransitariosPooSistema implements Serializable
{
    // instance variables - replace the example below with your own
    private static String ficheiroBD = "TransitariosPoo.dbase";
    
    private Set<Cliente> clientes;
    private Map<String, Carga> cargas;

   
    
    
    
    /*
     * Metodos de leitura e escrita da base de dados
     */
    public  void saveDB() {
        try {
            FileOutputStream fich = new FileOutputStream(ficheiroBD);
            ObjectOutputStream ficheiro = new ObjectOutputStream(fich);

            ficheiro.writeObject(this);
            ficheiro.close();
            fich.close();
        } catch (Exception ex) {
            System.out.println("ERRO (save DB): " + ex.getMessage());
        }
    }
    
    
    public TransitariosPooSistema loadDB(String filename) {
        try {
            FileInputStream fich = new FileInputStream(filename);
            ObjectInputStream ficheiro = new ObjectInputStream(fich);

            TransitariosPooSistema tp = (TransitariosPooSistema) ficheiro.readObject();

            ficheiro.close();
            fich.close();
            return tp;
        } catch (IOException ex) {
            System.out.println("ERRO (load DB): " + ex.getMessage());
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("ERRO (load DB): " + ex.getMessage());
            return null;
        } catch (ClassFormatError ex) {
            System.out.println("ERRO (load DB): " + ex.getMessage());
            return null;
        }
    }
}
