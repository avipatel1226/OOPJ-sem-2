//STARTER CODE
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class CalculatorApp extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        // Step 1: Create TextFields for input
        TextField input1 = new TextField();
        input1.setPromptText("Enter first number");

        TextField input2 = new TextField();
        input2.setPromptText("Enter second number");
 
        // Step 2: Create Buttons for operations
        Button addBtn = new Button("+");
        Button subBtn = new Button("-");
        Button mulBtn = new Button("*");
        Button divBtn = new Button("/");
 
        // Step 3: Create Label for result
        Label resultLabel = new Label("Result: ");
       
        // Step 4: HBox for buttons
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(addBtn, subBtn, mulBtn, divBtn);
       
        // Step 5: VBox main layout
        VBox root = new VBox(10);
        root.getChildren().addAll(input1, input2, buttonBox, resultLabel);
       
        // Step 6: Event handling for buttons
       
        // Step 7: Create scene and show stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}