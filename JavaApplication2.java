/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2389050
 */
public class JavaApplication2 extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override 
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Vaca");
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets().add("style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Label numberOfDaysLabel = new Label("Number of days on the trip:");
        TextField numberOfDaysField = new TextField();
        root.add(numberOfDaysLabel, 0, 0);
        root.add(numberOfDaysField, 1, 0);
        
        Label airfareLabel = new Label("Amount of Airfare:");
        TextField airfareField = new TextField();
        root.add(airfareLabel, 0, 1);
        root.add(airfareField, 1, 1);
        
        Label carRentalLabel = new Label("Amount of Car Rental Fees:");
        TextField carRentalField = new TextField();
        root.add(carRentalLabel, 0, 2);
        root.add(carRentalField, 1, 2);
        
        Label milesDrivenLabel = new Label("Number of miles driven(if any):");
        TextField milesDrivenField = new TextField();
        root.add(milesDrivenLabel, 0, 3);
        root.add(milesDrivenField, 1, 3);
        
        Label parkingFeesLabel = new Label("Amount of Parking Fees:");
        TextField parkingFeesField = new TextField();
        root.add(parkingFeesLabel, 0, 4);
        root.add(parkingFeesField, 1, 4);
        
        Label taxiChargesLabel = new Label("Amount of Taxi Charges:");
        TextField taxiChargesField = new TextField();
        root.add(taxiChargesLabel, 0, 5);
        root.add(taxiChargesField, 1, 5);
        
        Label registrationFeesLabel = new Label("Registration Fees:");
        TextField registrationFeesField = new TextField();
        root.add(registrationFeesLabel, 0, 6);
        root.add(registrationFeesField, 1, 6);
        
        Label lodgingChargesLabel = new Label("Lodging Charges per night:");
        TextField lodgingChargesField = new TextField();
        root.add(lodgingChargesLabel, 0, 7);
        root.add(lodgingChargesField, 1, 7);
        
        Button calculateButton = new Button("Calculate Expenses");
        
        Label totalExpensesLabel = new Label("Total Expenses: $0.00");
        Label allowableExpensesLabel = new Label("Total Allowable Expenses: $0.00");
        Label excessLabel = new Label("Excess to be paid by person: $0.00");
        Label savingsLabel = new Label("Amount Saved: $0.00");
        
       
        
        
    }
}
