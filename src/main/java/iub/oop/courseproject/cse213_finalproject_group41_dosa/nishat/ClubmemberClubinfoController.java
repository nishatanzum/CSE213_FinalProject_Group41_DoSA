package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ClubmemberClubinfoController
{
    @javafx.fxml.FXML
    private TableView<ClubMember> clubInfoTableView;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> clubPresidentTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> clabNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> aboutTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }
}