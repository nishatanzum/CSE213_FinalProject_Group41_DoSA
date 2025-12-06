package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;

public class StudentEditProfileController
{
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private Label successMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Student, String> emailTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> addressTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> phoneTableColumn;
    @javafx.fxml.FXML
    private TableView<Student> studentInfoTableView;

    ArrayList<Student> StudentInfo = new ArrayList<>();
    Student s = new Student();


    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
        phoneTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("phone"));
        addressTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("address"));

        StudentInfo.add(s);

    }

    @javafx.fxml.FXML
    public void saveChangesButtonOnAction(ActionEvent actionEvent) {
        successMessageLabel.setText("Profile Updated Successfully");

        try {
            File f = new File("StudentInfo.bin");
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

            for(Student s: StudentInfo ){
                oos1.writeObject(s);

            }
            oos1.close();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void addTableFromBinFileButtonOnAction(ActionEvent actionEvent) {
        studentInfoTableView.getItems().add(s);

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            File f = new File("StudentInfo.bin");
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
                studentInfoTableView.getItems().add((Student)ois.readObject());
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