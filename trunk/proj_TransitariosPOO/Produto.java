package proj_TransitariosPOO;


/**
 * Write a description of class ProdutosComerciais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Produto
{
    // instance variables - replace the example below with your own
    private final double PBVan = 12;
    private final double PBFurgao = 12;
    private final double PBCamiao = 12;
    
    private final double PBCamiao = 12;
    private final double PBCamiao = 12;
    private final double PBCamiao = 12;    
    
    /**
     * Constructor for objects of class ProdutosComerciais
     */
    public Produto()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public abstract double getCustoProduto();
    public abstract Produto clone();
}
