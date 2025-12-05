package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import iub.oop.courseproject.cse213_finalproject_group41_dosa.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class ClubmemberDashboardController
{
    @javafx.fxml.FXML
    private BorderPane clubBorderpane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void giveFeedbackAfterEventsButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-give-feedback-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();


        }
    }

    @javafx.fxml.FXML
    public void viewClubInformationButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-clubinfo-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();


        }
    }

    @javafx.fxml.FXML
    public void submitEventIdeasButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-submit-event-ideas-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();


        }
    }

    @javafx.fxml.FXML
    public void cancelEventRegistrationButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-cancel-event-registration-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();


        }
    }

    @javafx.fxml.FXML
    public void registerToJoinEventsButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-register-to-join-event-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();


        }
    }

    @javafx.fxml.FXML
    public void viewClubMemberListButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-list-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();


        }
    }

    @javafx.fxml.FXML
    public void editPersonalProfileButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/club-member-edit-profile-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();


        }
    }

    @javafx.fxml.FXML
    public void signOutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewUpcomingApprovedEventsButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-upcoming-approved-events-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();


        }
    }
}