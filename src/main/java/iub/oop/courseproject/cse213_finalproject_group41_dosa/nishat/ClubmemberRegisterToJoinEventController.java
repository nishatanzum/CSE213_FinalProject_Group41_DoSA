package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ClubmemberRegisterToJoinEventController
{
    @javafx.fxml.FXML
    private Label regConMsglabel;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> eventTitleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> eventIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> eventDateTableColumn;
    @javafx.fxml.FXML
    private TableView <ClubMember>approvedEventTableView;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> eventVenueTableColumn;

    ArrayList<Event> ClubMemberToJoinEventsInfo = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void eventRegisterButtonOnAction(ActionEvent actionEvent) {
        try {
            File f = new File("ClubMemberToJoinEventsInfo.bin");
            FileOutputStream fos1 = null;
            ObjectOutputStream oos1 = null;
            if (f.exists()) {
                fos1 = new FileOutputStream(f, true);
                oos1 = new AppendableObjectOutputStream(fos1);
            }
            else {
                fos1 = new FileOutputStream(f);
                oos1 = new ObjectOutputStream(fos1);
            }

            for(Event s: ClubMemberToJoinEventsInfo ){
                oos1.writeObject(s);

            }
            oos1.close();
        }
        catch(Exception e){

        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Registration Successful!");
        alert.show();


    }
}