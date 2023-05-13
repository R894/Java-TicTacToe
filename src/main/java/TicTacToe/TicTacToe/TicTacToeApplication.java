package TicTacToe.TicTacToe;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class TicTacToeApplication extends Application {


    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        MainView mainView = new MainView();
        
        Scene view = new Scene(mainView.getView());
        window.setScene(view);
        window.show();
    }
}