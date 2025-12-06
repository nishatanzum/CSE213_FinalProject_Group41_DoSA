package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ClubmemberCancelEventRegistrationController
{
    @javafx.fxml.FXML
    private Label confirmationMassegeLabel;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> eventNameTableColumn;
    @javafx.fxml.FXML
    private TableView<ClubMember> cancelEventTableView;

    @javafx.fxml.FXML
    public void initialize() {
        //cancelEventTableView.getItems().addAll();
    }


    @javafx.fxml.FXML
    public void cancelEventButtonOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Registration Cancelled Successfully");
        alert.show();
    }
}