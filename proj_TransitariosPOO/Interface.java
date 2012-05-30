package proj_TransitariosPOO;


/**
 * Write a description of class Interface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public final class Interface
{
public static Boolean implementsInterface(Object object, Class interf){
    for (Class c : object.getClass().getInterfaces()) {
        if (c.equals(interf)) {
            return true;
        }
    }
    return false;
}
}
