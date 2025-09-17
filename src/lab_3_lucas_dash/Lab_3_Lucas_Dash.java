/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_3_lucas_dash;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 *
 * @author 2389873
 */
//https://github.com/Lucas-Dash76/Lab-3/tree/master
public class Lab_3_Lucas_Dash extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage stage) {
        BorderPane bp = new BorderPane();
        GridPane gpane = new GridPane();
        
        
        gpane.setHgap(10);
        gpane.setVgap(10);
        gpane.setPadding(new Insets(25, 25, 25, 25));
      
        
        Label fname = new Label("First Name:");
        gpane.add(fname, 0, 1);
        
        TextField fnameField = new TextField();
        gpane.add(fnameField, 1, 1);
        
        Label lname = new Label("Last name:");
        gpane.add(lname, 0, 2);

        TextField lnamefield = new TextField();
        gpane.add(lnamefield, 1, 2);
        
        Label email = new Label("Email:");
        gpane.add(email, 0, 3);
        
        TextField emailfield = new TextField();
        gpane.add(emailfield, 1, 3);
        
        Label pw = new Label("Password:");
        gpane.add(pw, 0, 4);
        
        PasswordField pwfield = new PasswordField();
        gpane.add(pwfield, 1, 4);
        
        Button btn1 = new Button("Register");
        Button btn2 = new Button("Clear");
        gpane.add(btn1, 0, 5);
        btn1.setDisable(true);
        gpane.add(btn2, 1, 5);
       
        fnameField.setOnKeyTyped(e -> {
                if (!fnameField.getText().isEmpty()) {
                    
                }
        });
        
        btn2.setOnAction(e -> {
               fnameField.clear();
               lnamefield.clear();
               emailfield.clear();
               pwfield.clear();
            
        });
        boolean[] t = {false, false, false, false};
        fnameField.setOnKeyTyped(e -> {
            t[0] = !fnameField.getText().isEmpty();
            if (t[0] == true & t[1] == true & t[2] == true & t[3] == true) {
                btn1.setDisable(false);
            }
            else {
                btn1.setDisable(true);
            }
        });
        lnamefield.setOnKeyTyped(e -> {
            t[1] = !lnamefield.getText().isEmpty();
            if (t[0] == true & t[1] == true & t[2] == true & t[3] == true) {
                btn1.setDisable(false);
            }
            else {
                btn1.setDisable(true);
            }
        });
        emailfield.setOnKeyTyped(e -> {
            t[2] = !emailfield.getText().isEmpty();
            if (t[0] == true & t[1] == true & t[2] == true & t[3] == true) {
                btn1.setDisable(false);
            }
            else {
                btn1.setDisable(true);
            }
        });
        pwfield.setOnKeyTyped(e -> {
            t[3] = !pwfield.getText().isEmpty();
            if (t[0] == true & t[1] == true & t[2] == true & t[3] == true) {
                btn1.setDisable(false);
            }
            else {
                btn1.setDisable(true);
            }
        });
        Label lbl = new Label();
        btn1.setOnAction(e -> {
            boolean digit = false;
            boolean letter = false;
            for (int i = 0; i < pwfield.getText().length(); i++) {
               if (Character.isDigit(pwfield.getText().charAt(i))) {
                   digit = true;
               }
               if (Character.isLetter(pwfield.getText().charAt(i))) {
                   letter = true;
               }
            
            }
            if (emailfield.getText().contains("@")&
                    emailfield.getText().contains(".")&
                            digit == true &
                            letter == true) {
                    
                 lbl.setText("Welcome");
                
            }
            
            else {
                lbl.setText("Error");
                
            }
        });
        
        gpane.add(lbl, 0, 6);
        bp.setCenter(gpane);
        stage.setTitle("User Registration form");
        Scene s = new Scene(bp);
        stage.setScene(s);
        stage.show();
    }
    
}
