package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

    public class Hello extends Application {

        public void launcchthis() {
            Application.launch();
        }

        @Override
        public void start(Stage stage) throws Exception {
            Text text = new Text("Hello World");

            text.setFont(Font.font(100));
            text.setLayoutY(350);
            text.setLayoutX(150);

            Group group = new Group(text);

            Scene scene = new Scene(group, Color.GREEN);
            stage.setScene(scene);
            stage.setTitle("ex_11_12");
            stage.setWidth(1000);
            stage.setHeight(650);
            stage.show();
        }
    }