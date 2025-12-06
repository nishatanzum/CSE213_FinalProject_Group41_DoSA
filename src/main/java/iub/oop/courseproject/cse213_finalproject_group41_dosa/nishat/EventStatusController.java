package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EventStatusController
{
    @javafx.fxml.FXML
    private TableColumn<Student, String> titleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> eventIdTableColumn;
    @javafx.fxml.FXML
    private TableView<Student> eventStatusTableView;
    @javafx.fxml.FXML
    private TableColumn<Student, String> dateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewDetailButtonOnAction(ActionEvent actionEvent) {
    }
}