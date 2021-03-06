import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * Created by corey on 2/28/16.
 */
public class MainMenu extends BorderPane {

    private Button startButton;
    private Button options;
    private Button quit;

    public MainMenu(){

        startButton = new Button("Start");
        setButton(startButton);
        options = new Button("Options");
        setButton(options);
        quit = new Button("Quit");
        setButton(quit);


        setStyle("-fx-background-color: black");
        setBottom(makeButtonBox());

        ImageView img = new ImageView(new Image("raceCar.jpg"));
        setCenter( img );

        setupTopText();
    }

    /**
     * creates a button and sets parameters for the button
     * @param btn the created button
     */
    private void setButton( Button btn ){

        if( btn == null )
            return;

        btn.setAlignment(Pos.CENTER);
        btn.setMaxWidth(80);
        btn.setMinWidth(20);
    }

    private VBox makeButtonBox(){

        VBox box = new VBox();
        box.setStyle("-fx-background-color: transparent");
        box.setAlignment(Pos.TOP_CENTER);
        box.setSpacing(15);
        box.setPadding(new Insets(10, 10, 10, 10));
        box.getChildren().add(startButton);
        box.getChildren().add(options);
        box.getChildren().add(quit);

        return box;
    }

    private void setupTopText(){

        VBox box = new VBox();

        Text top = new Text("Super Awesome Extreme \nRacing!!!");
        top.setFill(Color.RED);
        top.setStyle("-fx-background-color: transparent;" +
                "-fx-font-size: 20;" +
                "-fx-font-style: italic;" +
                "-fx-font-weight: bold");

        top.setTextAlignment(TextAlignment.CENTER);

        box.getChildren().add(top);
        box.setAlignment(Pos.TOP_CENTER);

        setTop(box);
    }

    public Button getStartButton(){

        return startButton;
    }

    public Button getOptions(){

        return options;
    }

    public Button getQuit(){

        return quit;
    }
}
