package Exercise1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise1 extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GridPane gridPane = new GridPane();
        gridPane.setPadding((new Insets(5, 5, 5, 5)));

        gridPane.add(new ImageView(new Image("image/flag5.gif")),0,0);
        ImageView canada = new ImageView(new Image("image/ca.gif"));
        canada.setPreserveRatio(true);
        gridPane.add(canada,1,0);
        gridPane.add(new ImageView(new Image("image/flag2.gif")),0,1);
        gridPane.add(new ImageView(new Image("image/flag6.gif")),1,1);

        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Exercise 14.1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
