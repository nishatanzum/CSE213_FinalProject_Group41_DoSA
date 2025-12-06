package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import iub.oop.courseproject.cse213_finalproject_group41_dosa.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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

        }
    }

    @javafx.fxml.FXML
    public void viewClubInformationButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-clubinfo-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void submitEventIdeasButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-submit-event-ideas-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){



        }
    }

    @javafx.fxml.FXML
    public void cancelEventRegistrationButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-cancel-event-registration-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){



        }
    }

    @javafx.fxml.FXML
    public void registerToJoinEventsButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-register-to-join-event-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){



        }
    }

    @javafx.fxml.FXML
    public void viewClubMemberListButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-list-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){



        }
    }

    @javafx.fxml.FXML
    public void editPersonalProfileButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/club-member-edit-profile-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){



        }
    }

    @javafx.fxml.FXML
    public void signOutButtonOnAction(ActionEvent actionEvent) {
        try {

            Alert a2 = new Alert(Alert.AlertType.INFORMATION);
            a2.setTitle("Sign Out");
            a2.setHeaderText(null);
            a2.setContentText("You have been logged out successfully.");
            a2.showAndWait();

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("user-view.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage= new Stage();
            nextStage.setTitle("DoSA Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();

        }
        catch(Exception e){



        }


    }

    @javafx.fxml.FXML
    public void viewUpcomingApprovedEventsButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/clubmember-upcoming-approved-events-view.fxml"));
            clubBorderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){



        }
    }
}