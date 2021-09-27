// Author: Tanner Cox

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.event.*;
import java.util.Random;

// DND roll dice program
public class dndDiceGUI extends Application
{
    Button d4, d6, d8, d12, d20;
    Label roll;
    int ans;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("DND Dice"); // set title

        // set our label
        this.roll = new Label("You rolled " + ans);

        //initialize vertical box for all components in tictactoe
        VBox DNDBox = new VBox();

        // arrange labels
        VBox vertBox = new VBox(roll);
        vertBox.setAlignment(Pos.CENTER);
        vertBox.setPadding(new Insets(10));
        //store vertBox into ticTacToeBox
        DNDBox.getChildren().add(vertBox);

        // set up our buttons
        d4 = new Button("D4");
        d4.setOnAction(new ButtonClickHandler());
        d6 = new Button("D6");
        d6.setOnAction(new ButtonClickHandler());
        d8 = new Button("D8");
        d8.setOnAction(new ButtonClickHandler());
        d12 = new Button("D12");
        d12.setOnAction(new ButtonClickHandler());
        d20 = new Button("D20");
        d20.setOnAction(new ButtonClickHandler());

        HBox box = new HBox(5, d4, d6, d8, d12, d20);
        box.setAlignment(Pos.CENTER);
        box.setPadding(new Insets(10));// space out the buttons
        //store box into DNDBox
        DNDBox.getChildren().add(box);

        //300x300 pixel window
        Scene scene = new Scene(DNDBox, 300, 100);
   
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    class ButtonClickHandler implements EventHandler<ActionEvent> 
    {
        public void handle(ActionEvent event)
        {
            Button buttonClicked = (Button)event.getSource(); //get button that is clicked
            Random r = new Random();
            int val;

            // decision structure for buttons clicked
            if(buttonClicked.getText().equals("D4"))
            {
                val = r.nextInt(4) + 1;
                roll.setText("You rolled " + val);
            }

            else if(buttonClicked.getText().equals("D6"))
            {
                val = r.nextInt(6) + 1;
                roll.setText("You rolled " + val);
            }

            else if(buttonClicked.getText().equals("D8"))
            {
                val = r.nextInt(8) + 1;
                roll.setText("You rolled " + val);
            }

            else if(buttonClicked.getText().equals("D12"))
            {
                val = r.nextInt(12) + 1;
                roll.setText("You rolled " + val);
            }

            else if(buttonClicked.getText().equals("D20"))
            {
                val = r.nextInt(20) + 1;
                roll.setText("You rolled " + val);
            }
        }
    }
}