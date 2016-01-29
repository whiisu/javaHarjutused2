package Proovieksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * kerstima, ellips, mille taustavärvi saab muuta
 */
public class JavaFX6 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        Ellipse ellipse = new Ellipse(250, 250, 100, 60);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(null);
        ellipse.setStrokeWidth(3);
        Button button = new Button("Red");
        pane.getChildren().addAll(ellipse, button);
        button.setOnAction(e -> ellipse.setFill(Color.RED));
    }
}
