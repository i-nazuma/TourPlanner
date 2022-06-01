package UI;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;

public class TourPlannerApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLDependencyInjection.load("MainWindow.fxml", Locale.GERMAN );  // Locale.GERMANY, Locale.ENGLISH

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TourPlanner");
        primaryStage.show();
    }
}
