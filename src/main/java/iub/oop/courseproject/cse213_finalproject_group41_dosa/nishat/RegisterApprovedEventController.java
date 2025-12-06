package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RegisterApprovedEventController
{
    @javafx.fxml.FXML
    private TableColumn<Student, String> eventTitleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> eventIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> eventDateTableColumn;
    @javafx.fxml.FXML
    private TableView<Student> approvedEventTableView;
    @javafx.fxml.FXML
    private TableColumn<Student, String> eventVenueTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void eventRegisterButtonOnAction(ActionEvent actionEvent) {
    }
}