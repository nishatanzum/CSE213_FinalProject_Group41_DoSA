package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class UpcomingApprovedEventsController
{
    @javafx.fxml.FXML
    private TableColumn<Student, String> titleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> eventIdTableColumn;
    @javafx.fxml.FXML
    private TableView<Student> eventStatusTableView;
    @javafx.fxml.FXML
    private TableColumn<Student, String> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> venueTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        eventIdTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("id"));
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("title"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("date"));
        venueTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("venue"));

        //StudentInfo.add(s);
    }


    @javafx.fxml.FXML
    public void regButtonOnAction(ActionEvent actionEvent) {
    }
}