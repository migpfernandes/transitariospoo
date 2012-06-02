package proj_TransitariosPOO;

import java.util.Comparator;
/**
 * Write a description of class VeiculoCompareCarga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VeiculoCompareCarga implements Comparator<Veiculo>
{
   public int compare(Veiculo v1, Veiculo v2)
   {
    if (v1.espacoUtilizado() < v2.espacoUtilizado()) return -1;
    if (v1.espacoUtilizado() > v2.espacoUtilizado())
        return 1;
    else
        return 0;
   }
}
