package Proovieksam;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista ring, mille värvi saab kasutaja muuta
 */
public class JavaFX7 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox = new VBox(0);
        StackPane pane = new StackPane(vBox);
        Scene scene = new Scene(pane, 300, 300);
        Circle circle = new Circle(100, Color.BLUEVIOLET);

        //Scene scene2 = new Scene(vBox, 150, 300);
        Button roosa = new Button("Roosa");
        Button sinine = new Button("Sinine");
        Button roheline = new Button("Roheline");
        Button kollane = new Button("Kollane");
        pane.getChildren().addAll(circle);
        vBox.getChildren().addAll(roosa,sinine, roheline, kollane );
        primaryStage.setScene(scene);
        primaryStage.show();

        roosa.setOnAction(event -> {circle.setFill(Color.DEEPPINK);});
        sinine.setOnAction(e -> circle.setFill(Color.BLUE));
        roheline.setOnAction(e -> circle.setFill(Color.GREEN));
        kollane.setOnAction(e -> circle.setFill(Color.YELLOW));

    }


}
