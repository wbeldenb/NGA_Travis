import javafx.application.Application;
import javafx.scene.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calculator extends Application{
	
	public static void main (String[] args) {
		launch(args);
	}
	
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");
                
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("Calculator");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Number #1:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Number #2:");
        grid.add(pw, 0, 2);

        TextField pwBox = new TextField();
        grid.add(pwBox, 1, 2);
        
        Button btn1 = new Button("/");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn1.getChildren().add(btn1);
        grid.add(hbBtn1, 1, 7);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 8);
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                int x = Integer.parseInt(userTextField.getText());
                int y = Integer.parseInt(pwBox.getText());
                if (y != 0)
                	actiontarget.setText(x + "/" + y + " = " + (x/y));
                
                else
                	actiontarget.setText("Illegal operation. \nCannot Divide by 0.");
            }
        });
        
        Button btn2 = new Button("*");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn2.getChildren().add(btn2);
        grid.add(hbBtn2, 1, 6);
                
        btn2.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                int x = Integer.parseInt(userTextField.getText());
                int y = Integer.parseInt(pwBox.getText());
                actiontarget.setText(x + "*" + y + " = " + (x*y));
            }
        });
        
        Button btn3 = new Button("+");
        HBox hbBtn3 = new HBox(10);
        hbBtn3.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn3.getChildren().add(btn3);
        grid.add(hbBtn3, 1, 4);
                
        btn3.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                int x = Integer.parseInt(userTextField.getText());
                int y = Integer.parseInt(pwBox.getText());
                actiontarget.setText(x + "+" + y + " = " + (x+y));
            }
        });

        Button btn4 = new Button("-");
        HBox hbBtn4 = new HBox(10);
        hbBtn4.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn4.getChildren().add(btn4);
        grid.add(hbBtn4, 1, 5);
                
        btn4.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                int x = Integer.parseInt(userTextField.getText());
                int y = Integer.parseInt(pwBox.getText());
                actiontarget.setText(x + "-" + y + " = " + (x-y));
            }
        });
        
        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
