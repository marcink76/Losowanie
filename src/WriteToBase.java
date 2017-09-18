import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteToBase {

    public static void writeToBase(Man man) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String serwerUrl = "jdbc:mysql://sql.coni.nazwa.pl:3306/coni";
        String user = "coni";

        Scanner readPass = new Scanner(System.in);
        System.out.println("Podaj hasło do bazy:");
        String password = readPass.nextLine();

        try {

            String sqlQuery = "INSERT INTO Rodzic (imie, nazwisko) VALUES (\""+man.getName()+ "\",\""+man.getLastName()+ "\");";

            connection = DriverManager.getConnection(serwerUrl, user, password);
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.execute();
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(WriteToBase.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } finally

        {

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }

        }
    }
}
