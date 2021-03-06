package Proovieksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista ring, mille suurust saab kasutaja Slideriga muuta
 */
public class JavaFX2 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle circle = new Circle(250, 250, 150);
        circle.setStroke(Color.RED);

        Slider slider = new Slider(0, 250, 0);
        slider.setTranslateY(10);
        slider.valueProperty().addListener((observable, oldValue, newValue) ->
                circle.setStrokeWidth(newValue.intValue()));

        pane.getChildren().addAll(slider, circle);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(event -> System.exit(0));
        primaryStage.show();
    }
}
