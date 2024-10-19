import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JNDIDemo {
  public static void main(String[] args){
    try {
      
      Context ctx = new InitialContext();

      String dbName = "jdbc/myDatabase";  
      DataSource ds = (DataSource) ctx.lookup(dbName);

      if (ds != null) {
        System.out.println("DataSource found: " + dbName);
      } else {
        System.out.println("DataSource not found: " + dbName);
      }

    } catch (NamingException e) {
      System.out.println("JNDI Error: " + e.getMessage());
    }
  }
}
