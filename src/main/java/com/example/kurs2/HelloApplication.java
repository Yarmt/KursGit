package com.example.kurs2;

import  javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 450);
        stage.setTitle("App for Java Project!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        try {
            Class.forName(" com.mysql.cj.jdbc.Driver " );
            Connection connection = DriverManager.getConnection(
                    " jdbc:mysql://std-mysql.ist.mospolytech.ru:3306/std_1620_staff " ,
                    " std_1620_staff " , " qwerty " );
            Statement statement = connection.createStatement();
            String query = " SELECT * FROM posts " ;
            // mmm
            ResultSet result = (ResultSet) statement.executeQuery(query);
            while(((java.sql.ResultSet) result).next()){
                int id = result.getInt(" id " );
                String name = result.getString(" name " );
                String short_name = result.getString(" short_name " );
                System.out.print(" Vacant post: " );
                System.out.print(" id = " + id);
                System.out.print(" , name = \" " + name + " \" " );
                System.out.println(" , short name = \" " + short_name + " \" . " );
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}