package swen.fhtw.tourplanner.UI.view;

import swen.fhtw.tourplanner.UI.viewmodel.MainWindowViewModel;
import swen.fhtw.tourplanner.UI.viewmodel.TourDetailsViewModel;
import swen.fhtw.tourplanner.UI.viewmodel.TourOverviewViewModel;

public class ControllerFactory {

    private final MainWindowViewModel mainWindowViewModel;

    private final TourOverviewViewModel tourOverviewViewModel;

    private final TourDetailsViewModel tourDetailsViewModel;

    public ControllerFactory() {
        tourOverviewViewModel = new TourOverviewViewModel();
        tourDetailsViewModel = new TourDetailsViewModel();
        mainWindowViewModel = new MainWindowViewModel(tourOverviewViewModel, tourDetailsViewModel);
    }

    //
    // Factory-Method Pattern
    //
    public Object create(Class<?> controllerClass) {
        if (controllerClass == MainWindowController.class) {
            return new MainWindowController(mainWindowViewModel);
        } else if (controllerClass == TourDetailsController.class) {
            return new TourDetailsController(tourDetailsViewModel);
        } else if (controllerClass == TourOverviewController.class) {
            return new TourOverviewController(tourOverviewViewModel);
        }
        throw new IllegalArgumentException("Unknown controller class: " + controllerClass);
    }


    // Singleton-Pattern with early-binding
    private static ControllerFactory instance = new ControllerFactory();
    public static ControllerFactory getInstance() {
        return instance;
    }
}
