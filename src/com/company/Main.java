package com.company;

import java.util.Collections;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("ui.fxml"));
        Parent root = FXMLLoader.load(Main.class.getResource("com.company.ui.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {

        /*Author RobertKiyosaki = new Author("Kiyosaki", Collections.singletonList("Robert"), "Mainz", "FBV");
        Author TimothyFerriss = new Author("Kiyosaki", Collections.singletonList("Robert"), "Mainz", "FBV");


        Book.createBook(Collections.singletonList(RobertKiyosaki), "Rich Dad Poor Dad", 240, 2014, "Deutsch", "978-3-89879-882-2");
        Book.createBook(Collections.singletonList(TimothyFerriss), "Die 4-Stunden-Woche", 352, 2015, "Deutsch", "978-3-548-37596-0 ");

        Book buch1 = new Book(Collections.singletonList(RobertKiyosaki), "Rich Dad Poor Dad", 240, 2014, "Deutsch", "978-3-89879-882-2");
        buch1.bookList.add(buch1);

        Book.printBook();
         */

        launch(args);
    }
}
