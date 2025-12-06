package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class GiveFeedbackController
{
    @javafx.fxml.FXML
    private TableColumn<Student, String> eventIdTableColumn;
    @javafx.fxml.FXML
    private TableView<Student> feedbackTableView;
    @javafx.fxml.FXML
    private TableColumn<Student, String> ratingTableColumn;
    @javafx.fxml.FXML
    private Label feedbackconfirmationlabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void feedbackSubmitButtonOnAction(ActionEvent actionEvent) {
    }
}