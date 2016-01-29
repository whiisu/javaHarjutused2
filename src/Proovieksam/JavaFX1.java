package Proovieksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Loo Label, mille sisu saab kasutaja TextFieldi kaudu muuta.
 */
public class JavaFX1 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox = new VBox();
        Scene scene = new Scene(vBox, 300, 100);
        primaryStage.setScene(scene);
        Label label = new Label("Kirjuta midagi, et teksti sisu muuta");
        TextField textField = new TextField();

        textField.setOnAction(event ->{
            String uuskiri = textField.getText();
            System.out.println(uuskiri);
            label.setText(uuskiri);
        });
        vBox.getChildren().addAll(label, textField);
        primaryStage.show();
    }
}
