/* Guidriver
 *
 * Runs check soft program
*/
package gui;
import db.DbConnect;
/**
 *
 * @author Alvaro
 */
public class Guidriver {
    
    public static void main(String[] args) {
        System.out.println("Begin Program");
        System.out.println("Connect to database");
        DbConnect myDb = new DbConnect();
        Login myDash = new Login(myDb);
        System.out.println("End Program");
    }
}
