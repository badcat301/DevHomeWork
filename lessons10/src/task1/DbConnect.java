package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Fylhtq on 24.05.2017.
 */
public class DbConnect {


        private String bddriver = "org.sqlite.JDBC";
        Connection dbConnection;
        Statement statement;
        String nameDB = "USERAUTORIZE";



// проверяем наличие драйвера

        public  void dBCheck(){
            try { Class.forName(bddriver);
            }
            catch (ClassNotFoundException e) {
                System.out.println("SQL JDBC Driver NOT FOUND!");
            }
        }
//конектимся к драйверу

        public  Connection getDBConnection(){
            try {
                String urlDB = "jdbc:sqlite:lessons10/task1/db/TestHomeWork.sqlite"; //путь к бд
                dbConnection = DriverManager.getConnection(urlDB);

            } catch (SQLException e) {
                System.out.println("DB NOT FOUND!!!"+e.getMessage());
            }
            return dbConnection;
        }


        //создаем тайбл с столбцами
        public void createDbUserTable() throws SQLException {
            Connection dbConnection;
            Statement statement;

            try {
                dbConnection = getDBConnection();
                statement = dbConnection.createStatement();
                String qForCreateTable = "CREATE TABLE " + nameDB + "("
                        + "USERNAME text(20) NOT NULL, "
                        + "EMAIL text(70) NOT NULL, "
                        + "PASS text(10) NOT NULL)";
                // SQL запрос
                statement.execute(qForCreateTable);
                System.out.println("Table "+ nameDB+" is created!");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        //add new user
        public void createNewUserDbTable(String insertSQL) throws SQLException {
            String nameDB = "USERAUTORIZE";
            String insertTableSQL = "INSERT INTO +nameDB+"
                    + "(USERNAME, EMAIL,PASS) " + "VALUES";



            statement.executeUpdate(insertTableSQL
                    + insertSQL);


        }
    }


