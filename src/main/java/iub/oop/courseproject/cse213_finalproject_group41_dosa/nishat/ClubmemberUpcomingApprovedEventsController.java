package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ClubmemberUpcomingApprovedEventsController
{
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> titleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> eventIdTableColumn;
    @javafx.fxml.FXML
    private TableView<ClubMember> eventStatusTableView;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> venueTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void regButtonOnAction(ActionEvent actionEvent) {
    }
}