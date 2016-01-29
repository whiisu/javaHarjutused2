package Proovieksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * kerstima, ringjoone paksus
 */
public class JavaFX4 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(event -> System.exit(0));
        primaryStage.show();

        Circle circle = new Circle(250, 250, 75);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);
        circle.setStrokeWidth(1);

        Slider slider = new Slider();
        pane.getChildren().addAll(slider, circle);

        slider.setMin(0);
        slider.setMax(400);
        //slider.setValue(40);
        // slider.setShowTickLabels(true);
        //slider.setShowTickMarks(true);
        // slider.setMajorTickUnit(50);
        // slider.setMinorTickCount(5);
        // slider.setBlockIncrement(10);
        //slider.setOrientation(Orientation.VERTICAL);
        slider.setTranslateY(390);

        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            circle.setStrokeWidth(newValue.intValue());
        });
    }
}
