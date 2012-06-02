package proj_TransitariosPOO;

import java.util.Comparator;
/**
 * Write a description of class ClienteCompareNome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClienteCompareNome implements Comparator<Cliente>
{
   public int compare(Cliente c1, Cliente c2)
   {
    if (c1.getNome().compareTo(c2.getNome()) < 0) return -1;
    if (c1.getNome().compareTo(c2.getNome()) > 0)
        return 1;
    else
        return 0;
   }
}
