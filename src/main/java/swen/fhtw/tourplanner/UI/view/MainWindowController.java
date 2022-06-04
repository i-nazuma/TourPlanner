package swen.fhtw.tourplanner.UI.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.Getter;
import swen.fhtw.tourplanner.UI.viewmodel.MainWindowViewModel;

public class MainWindowController {
    // Controllers of included fxml-files are injected here
    // fx:id Attribute of <fx:include> tag + "Controller"
    // tutorial see https://riptutorial.com/javafx/example/7285/nested-controllers
    //@FXML private TourOverviewController tourOverviewController;   // injected controller of MediaOverview.fxml
    //@FXML private TourDetailsController tourDetailsController;    // injected controller of MediaDetails.fxml

    private final MainWindowViewModel mainViewModel;
    public MainWindowController(MainWindowViewModel mainViewModel) {
        this.mainViewModel = mainViewModel;
    }

/*    @FXML
    private Label welcomeText;

    @FXML
    private void onHelloButtonClick() {
        welcomeText.setText("u stink xd");
    }*/
}
