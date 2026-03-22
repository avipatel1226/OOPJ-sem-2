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
        input1.setPrefWidth(200); // UI polish

        TextField input2 = new TextField();
        input2.setPromptText("Enter second number");
        input2.setPrefWidth(200); // UI polish

        // Step 2: Create Buttons for operations
        Button addBtn = new Button("+");
        Button subBtn = new Button("-");
        Button mulBtn = new Button("*");
        Button divBtn = new Button("/");

        // Step 3: Create Label for result
        Label resultLabel = new Label("Result: ");

        // Step 4: HBox for buttons
        HBox buttonBox = new HBox(15); // increased spacing for polish
        buttonBox.getChildren().addAll(addBtn, subBtn, mulBtn, divBtn);

        // Step 5: VBox main layout
        VBox root = new VBox(15); // spacing between elements
        root.getChildren().addAll(input1, input2, buttonBox, resultLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;"); // padding + center alignment

        // Step 6: Event handling for buttons
        addBtn.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                resultLabel.setText("Result: " + (num1 + num2));
            } catch (Exception ex) {
                resultLabel.setText("Invalid input");
            }
        });

        subBtn.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                resultLabel.setText("Result: " + (num1 - num2));
            } catch (Exception ex) {
                resultLabel.setText("Invalid input");
            }
        });

        mulBtn.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                resultLabel.setText("Result: " + (num1 * num2));
            } catch (Exception ex) {
                resultLabel.setText("Invalid input");
            }
        });

        divBtn.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());

                if (num2 == 0) {
                    resultLabel.setText("Error: Division by zero");
                } else {
                    resultLabel.setText("Result: " + (num1 / num2));
                }
            } catch (Exception ex) {
                resultLabel.setText("Invalid input");
            }
        });

        // Step 7: Create scene and show stage
        Scene scene = new Scene(root, 300, 250); // slightly taller for spacing
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        
    }
}