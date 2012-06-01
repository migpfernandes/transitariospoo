package proj_TransitariosPOO;


/**
 * Write a description of class ServicoSimples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ServicoSimples extends Produto implements iCargaIndiferenciada
{

    public ServicoSimples()
    {
        super();
    }

    public ServicoSimples(ServicoSimples s)
    {
        super(s);
    }
    
    public boolean addCargas(Cargas c)
    {
        super.addCargas(c);
    }
    
}
