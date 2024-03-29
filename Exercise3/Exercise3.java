package Exercise3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Exercise3 extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        Label[] labels = new Label[5];

        for (int i = 0; i < labels.length; i++)
        {
            labels[i] = new Label("Java");
            labels[i].setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            labels[i].setTextFill(getRandomColor());
            labels[i].setRotate(90);

            pane.add(labels[i], i, 0);
        }

        Scene scene = new Scene(pane, 250, 100);
        primaryStage.setTitle("Exercise 14.3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Color getRandomColor()
    {
        return new Color(Math.random(), Math.random(), Math.random(), Math.random());
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}