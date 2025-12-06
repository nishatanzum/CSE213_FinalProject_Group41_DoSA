package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ClubMemberEditProfileController
{
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField roleTextField;
    @javafx.fxml.FXML
    private Label messageLabel;


    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> emailTableColumn;
    @javafx.fxml.FXML
    private TableColumn <ClubMember, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableView <ClubMember>memberInfoTableView;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> clubRoleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ClubMember, String> phoneTableColumn;

    ArrayList<ClubMember> ClubMemberInfo = new ArrayList<>();
    ClubMember cm = new ClubMember();

    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<ClubMember, String>("name"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<ClubMember, String>("email"));
        phoneTableColumn.setCellValueFactory(new PropertyValueFactory<ClubMember, String>("phone"));
        clubRoleTableColumn.setCellValueFactory(new PropertyValueFactory<ClubMember, String>("ClubRole"));

        //ClubMember cm = new ClubMember();
        ClubMemberInfo.add(cm);
        //memberInfoTableView.getItems().add(cm);

    }

    @javafx.fxml.FXML
    public void saveChangesButtonOnAction(ActionEvent actionEvent) {
        messageLabel.setText("Profile Updated Successfully");
        //memberInfoTableView.getItems().add(cm);


        try {
            File f = new File("ClubMemberInfo.bin");
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

            for(ClubMember cm: ClubMemberInfo ){
                oos1.writeObject(cm);

            }
            oos1.close();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void addTableFromBinFileButtonOnAction(ActionEvent actionEvent) {
        memberInfoTableView.getItems().add(cm);

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            File f = new File("ClubMemberInfo.bin");
            if(f.exists()){
                fis = new FileInputStream(f);
            }
            else{
                Alert z = new Alert(Alert.AlertType.INFORMATION);
                z.setContentText("File does not exists.");
                z.show();
            }
            if(fis!=null){
                ois = new ObjectInputStream(fis);
            }
            while (true){
                memberInfoTableView.getItems().add((ClubMember)ois.readObject());
            }
        }
        catch(Exception e){
            try{
                if(ois!=null)ois.close();
            }
            catch(Exception e1){

            }

        }
    }
}