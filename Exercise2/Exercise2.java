package Exercise2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.Random;

public class Exercise2 extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER );
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                Random random = new Random();
                int select = random.nextInt(3);

                switch(select)
                {
                    case 0:
                    {
                        gridPane.add(new ImageView(new Image("image/x.gif")), i , j);
                        break;
                    }

                    case 1:
                    {
                        gridPane.add(new ImageView(new Image("image/o.gif")), i , j);
                        break;
                    }

                    default:
                        break;
                }
            }
        }

        Scene scene = new Scene(gridPane, 150, 150);
        primaryStage.setTitle("Exercise 14.2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

