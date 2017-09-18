import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadFromBase {

    public static void readFromBase() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        ResultSet setResult = null;

        final String DATA_BASE_USER = "coni";

        Scanner passRead = new Scanner(System.in);
        String password = passRead.nextLine();

        String serwerUrl = "jdbc:mysql://sql.coni.nazwa.pl:3306/coni";

        try {
            String sqlQuery = "SELECT * FROM Rodzic";

            connection = DriverManager.getConnection(serwerUrl, DATA_BASE_USER, password);
            preparedStatement = connection.prepareStatement(sqlQuery);
            setResult = preparedStatement.executeQuery();

            while (setResult.next()){
                System.out.println(setResult.getString(1) +" " +setResult.getString(2) );
            }
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(ReadFromBase.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {

                if (setResult != null) {
                    setResult.close();
                }

                if (preparedStatement != null) {
                    preparedStatement.close();
                }

                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(ReadFromBase.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
}
