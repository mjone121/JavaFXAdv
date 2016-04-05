import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * Created by mervenjones on 3/29/16.
 */
public class RadioCheckandButtons extends Application {
    protected Text line = new Text(50, 50, "Java FX Advanced");

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane act1 = new Pane();

        Scene alack = new Scene(act1);
        primaryStage.setTitle("Control booth");
        primaryStage.setScene(alack);
        primaryStage.show();
    }

    class checkmark extends RadioCheckandButtons {
        protected BorderPane getPane();

        BorderPane scene1 = super.getPane;

        Font BI = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font Bold = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
        Font Italic = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font Normal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);

        line.setFont()
    }
}
