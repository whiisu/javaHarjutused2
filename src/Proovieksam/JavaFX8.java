package Proovieksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista Ellipse, mille ringjoone paksust saab kasutaja slideriga muuta.
 */
public class JavaFX8 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 350, 400);
        Ellipse ellipse = new Ellipse(150, 250, 150, 100);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(5);
        ellipse.setFill(Color.GREEN);
        Button button = new Button("Muuda värvi");
        Slider slider = new Slider(0, 250, 0);
        slider.setTranslateY(50);
        slider.valueProperty().addListener((observable, oldValue, newValue) ->
                ellipse.setStrokeWidth(newValue.intValue()));


        pane.getChildren().addAll(ellipse, button, slider);
        primaryStage.setScene(scene);
        primaryStage.show();

        button.setOnAction(e -> {
            Color color = null;
            //String varv = " ";
            int red = 25;
            int green = 70;
            int blue = 120;
            //color = new Color(red, green, blue);
            ellipse.setFill(Color.BLUE);
        });
    }

}
