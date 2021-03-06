package swen.fhtw.tourplanner.UI.viewmodel;

import swen.fhtw.tourplanner.DAL.model.Tour;

public class MainWindowViewModel {

    private TourOverviewViewModel tourOverviewViewModel;
    private TourDetailsViewModel tourDetailsViewModel;


    public MainWindowViewModel(TourOverviewViewModel tourOverviewViewModel, TourDetailsViewModel tourDetailsViewModel) {
        this.tourOverviewViewModel = tourOverviewViewModel;
        this.tourDetailsViewModel = tourDetailsViewModel;
    }

    private void selectTour(Tour selectedTour) {
        tourDetailsViewModel.setTourModel(selectedTour);
    }
}
