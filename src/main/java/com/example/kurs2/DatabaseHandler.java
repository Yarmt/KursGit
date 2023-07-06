package com.example.kurs2;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.nio.file.Path;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.*;

import static java.nio.file.Files.exists;

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
    public void signup(User user) throws SQLException, NoSuchAlgorithmException, InvalidKeySpecException {
        if (exists(Path.of(user.getUsername()))) return;
        String insert = "INSERT INTO Users(id, password, name, address, number) VALUES ('" + user.getUsername() + "','" + passwordHashing(user.getPassword()) + "', 1,'" + user.getName() + "','" + user.getAddress() + "','" + user.getNumber() + "')";
        PreparedStatement prst = connection.prepareStatement(insert);
        prst.executeUpdate();
    }

    public ResultSet getUser(User user) throws NoSuchAlgorithmException, InvalidKeySpecException, SQLException {
        ResultSet rs;
        String select = "SELECT * FROM Users WHERE username = '" + user.getUsername() + "' AND password = '" + user.getPassword() + "';";
        PreparedStatement prst = connection.prepareStatement(select);
        rs = prst.executeQuery();
        return rs;
    }
    public static String passwordHashing(String password) throws NoSuchAlgorithmException, InvalidKeySpecException {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = factory.generateSecret(spec).getEncoded();
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : hash) {
            stringBuilder.append(b);
        }
        return stringBuilder.toString();
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

//public class DatabaseHandler extends Configs{
//    Connection dbConnection;
//    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
//        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
//
//        Class.forName("com.mysql.jdbc.Driver");
//
//        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
//
//        return dbConnection;
//    }
//>>>>>>> origin/master
}
