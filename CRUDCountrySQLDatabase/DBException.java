
package countryapp;

/**
 *
 * @author Bradley
 */
public class DBException extends Exception {
    DBException() {}
    
    DBException(Exception e) {
        super(e);
    }
}
