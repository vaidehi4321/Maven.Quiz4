package rocks.zipcode.quiz4.collections.culonary;

/**
 * @author leon on 27/12/2018.
 */
public class Pepper implements Spice{
    private static Pepper INSTANCE = new Pepper();

    static Pepper getInstance(){
        return INSTANCE;
    }
}
