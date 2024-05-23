
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;

public class lab8 {
   public static void main(String args[]) {
      NumberFormat currency = NumberFormat.getCurrencyInstance();
      final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
      final String CONNECTION = "jdbc:derby:AccountDatabase";
      
      try {
         Class.forName(DRIVER).newInstance();
         Connection connection = DriverManager.getConnection(CONNECTION);
         Statement statement = connection.createStatement();
         ResultSet resultset = statement.executeQuery("SELECT * FROM BANK");
         
         while (resultset.next()) {
               System.out.print(resultset.getString("NAME") + ", ");
               System.out.print(resultset.getString("ADDRESS") + ", ");
               System.out.println(currency.format(resultset.getFloat("BALANCE")));
         }
         
         resultset.close();
         statement.close();
         connection.close();
      } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      }
   }
}
