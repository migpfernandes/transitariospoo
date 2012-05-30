package proj_TransitariosPOO;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Possui todos os m√©todos necess√°rios para gerir os ficheiros
 * 
 * @author F√°bio Costa, Miguel Costa, Sofia Vieira
 */
public class SaveLoadDB {

    public static final String DefualtObjectFileName = "transitarios_poo.obj";

    public static void saveDB(TransitariosPooSistema tp, String filename) {
        try {
            FileOutputStream fich = new FileOutputStream(filename);
            ObjectOutputStream ficheiro = new ObjectOutputStream(fich);

            ficheiro.writeObject(tp);
            ficheiro.close();
            fich.close();
        } catch (Exception ex) {
            System.out.println("ERRO (save DB): " + ex.getMessage());
        }
    }

    public static TransitariosPooSistema loadDB(String filename) {
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

    public static void showDBInFile(TransitariosPooSistema tp, String filename) {
        try {
            FileWriter fich = new FileWriter(filename);
            BufferedWriter ficheiro = new BufferedWriter(fich);

            ficheiro.write(tp.toString());
        } catch (Exception ex) {
            System.out.println("ERRO (save File DB): " + ex.getMessage());
        }
    }
}
