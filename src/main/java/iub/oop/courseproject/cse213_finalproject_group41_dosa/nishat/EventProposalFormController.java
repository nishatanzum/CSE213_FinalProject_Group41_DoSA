package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class EventProposalFormController
{
    @javafx.fxml.FXML
    private DatePicker eventDatepicker;
    @javafx.fxml.FXML
    private TextField budgetTextField;
    @javafx.fxml.FXML
    private TextField venueTextField;
    @javafx.fxml.FXML
    private TextField descriptionTextField;
    @javafx.fxml.FXML
    private TextField eventTitleTextField;
    @javafx.fxml.FXML
    private TextField participantTextField;


    ArrayList<Event> ProposedEvents = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        eventDatepicker.setValue(LocalDate.of(2000, 1, 1));
    }




    @javafx.fxml.FXML
    public void submitProposalButtonOnAction(ActionEvent actionEvent) {
        String title = eventTitleTextField.getText();
        String description = descriptionTextField.getText();
        boolean isFutureDate = eventDatepicker.getValue().isAfter(LocalDate.now());
        String venue = venueTextField.getText();

        try {
            int participants = Integer.parseInt(participantTextField.getText());
            double budget = Double.parseDouble(budgetTextField.getText());
            LocalDate date = eventDatepicker.getValue();


            Event e = new Event(title, description, venue, date, participants, budget);
            ProposedEvents.add(e);


        }
        catch (Exception e) {

        }

        eventTitleTextField.clear();
        descriptionTextField.clear();
        venueTextField.clear();
        participantTextField.clear();
        budgetTextField.clear();


        try {
            File f = new File("ProposedEventInfo.bin");
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

            for(Event e: ProposedEvents ){
                oos1.writeObject(e);

            }
            oos1.close();
        }
        catch(Exception e){

        }





    }
}