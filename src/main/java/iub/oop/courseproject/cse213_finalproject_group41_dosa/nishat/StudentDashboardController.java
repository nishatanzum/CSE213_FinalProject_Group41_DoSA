package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import iub.oop.courseproject.cse213_finalproject_group41_dosa.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StudentDashboardController
{
    @javafx.fxml.FXML
    private BorderPane borderpane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void giveFeedbackButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/give-feedback-view.fxml"));
            borderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void cancelEventRegistrationButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/cancel-event-registration-view.fxml"));
            borderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void viewEventStatusButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/event-status-view.fxml"));
            borderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }


    @javafx.fxml.FXML
    public void editPersonalProfileButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/student-edit-profile-view.fxml"));
            borderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void receiveNotificationsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/recieve-notification-view.fxml"));
            borderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void signOutButtonOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void proposeNewEventButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/event-proposal-form-view.fxml"));
            borderpane.setCenter(fxmlLoader.load());
//            Scene nextScene = new Scene(fxmlLoader.load());
//            Stage nextStage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
//            nextStage.setTitle("Dashboard");
//            nextStage.setScene(nextScene);
//            nextStage.show();




        }
        catch(Exception e){
            e.printStackTrace();


        }
    }

    @javafx.fxml.FXML
    public void viewUpcomingApprovedEventsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/upcoming-approved-events-view.fxml"));
            borderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void registerApprovedEventButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nishat/register-approved-event-view.fxml"));
            borderpane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }
}