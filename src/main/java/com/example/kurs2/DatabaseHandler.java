package com.example.kurs2;
<<<<<<< HEAD

//import javax.crypto.SecretKeyFactory;
//import javax.crypto.spec.PBEKeySpec;
//import java.security.NoSuchAlgorithmException;
//import java.security.SecureRandom;
//import java.security.spec.InvalidKeySpecException;
//import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs{
    private static Connection connection;
    private static final String DB_URL = "jdbc:mysql://std-mysql.ist.mospolytech.ru:3306/std_2292_restorsan";
    private static final String DB_USER = "std_2292_restorsan";
    private static final String DB_PASSWORD = "12345678";
    public DatabaseHandler() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }
        catch (ClassNotFoundException e) {
            System.out.println("JDBC не найден");
        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к базе данных: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        return connection;
    }
//    public void singUpUser(String firstName) throws SQLException, ClassNotFoundException {
//        //продолжить Стринги
//        String insert = "INSERT INTO "+ Const.USER_TABLE+"("+Const.USER_LASTNAME+
//                "VALUES(?,?,?)";
//        //дописать
//        try {
//            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
//            prSt.setString(1, firstName);
//            prSt.executeUpdate();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
////        }
//
//    }
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler extends Configs{
    Connection dbConnection;
    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }
>>>>>>> origin/master
}
