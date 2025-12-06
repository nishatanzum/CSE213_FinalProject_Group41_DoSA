package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class CancelEventRegistrationController
{
    @javafx.fxml.FXML
    private Label confirmationMassegeLabel;
    @javafx.fxml.FXML
    private TableColumn<Student, String> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String>  eventNameTableColumn;
    @javafx.fxml.FXML
    private TableView <Student> cancelEventTableView;

    ArrayList<Event> eventList;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cancelEventButtonOnAction(ActionEvent actionEvent) {
    }
}