package Proovieksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * ringi diameetri muutmine
 */
public class JavaFX5 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stack = new StackPane();
        Scene scene = new Scene(stack);
        Circle circle = new Circle(300);
        stack.getChildren().add(circle);

        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(300);
        stack.getChildren().add(slider);
        slider.setTranslateY(290);

        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            circle.setRadius(newValue.intValue());
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
