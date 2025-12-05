package iub.oop.courseproject.cse213_finalproject_group41_dosa;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class UserController
{
    @javafx.fxml.FXML
    private TextField userIDTextfield;
    @javafx.fxml.FXML
    private PasswordField passwordTextField;
    @javafx.fxml.FXML
    private ComboBox <String>userTypeCombobox;
    @javafx.fxml.FXML
    private Label notificationLabel;

    @javafx.fxml.FXML
    public void initialize() {
        userTypeCombobox.getItems().addAll("Student", "Club Member");
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) {
        String userId = userIDTextfield.getText();
        String password = passwordTextField.getText();

        boolean isUserIdValid = true;
        try {
            int ID = Integer.parseInt(userId);
            isUserIdValid = userId.length() == 7;
        } catch (Exception e) {
            isUserIdValid = false;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean isPasswordValid = password.length() >= 8;

        if (isPasswordValid) {
            for (char c : password.toCharArray()) {
                if (Character.isLetter(c)) hasLetter = true;
                if (Character.isDigit(c)) hasDigit = true;
            }
            isPasswordValid = hasLetter && hasDigit;

        }

        if (!isUserIdValid || !isPasswordValid) {
            notificationLabel.setText("Fill up the form properly with 7 digits and valid password.");
            return;

        }

        String userType = userTypeCombobox.getValue();
        String fxmlPath = "";

        if (userType.equals("Student")) {
            fxmlPath = "nishat/student-dashboard-view.fxml";
        }
        else if (userType.equals("Club Member")) {
            fxmlPath = "nishat/clubmember-dashboard-view.fxml";
        }


        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlPath));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage= new Stage();
            nextStage.setTitle("Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){

        }
    }
}