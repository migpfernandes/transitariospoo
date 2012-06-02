package proj_TransitariosPOO;

import java.util.Comparator;
/**
 * Write a description of class ClienteCompareContrato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClienteCompareContrato implements Comparator<Cliente>
{
   public int compare(Cliente c1, Cliente c2)
   {
    if (c1.getValorSubcontratado() < c2.getValorSubcontratado()) return -1;
    if (c1.getValorSubcontratado() > c2.getValorSubcontratado()) 
        return 1;
    else
        return 0;
   }
}
