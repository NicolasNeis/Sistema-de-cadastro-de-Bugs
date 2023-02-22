package application.example.cadastro_de_bugs;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SampleController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCancel;

    @FXML
    private RadioButton btnNo;

    @FXML
    private Button btnOk;

    @FXML
    private ComboBox btnPriority;

    @FXML
    private ComboBox btnSystem;

    @FXML
    private RadioButton btnYes;

    @FXML
    private TextArea descriptionText;

    @FXML
    private TextField nameEmail;

    @FXML
    private TextField nameText;

    @FXML
    private TextField nameTitle;


    @FXML
    void SelectOk(ActionEvent event) {
        Main.alert();
    }

    @FXML
    void enterDescription(MouseEvent event) {

    }

    @FXML
    void enterEmail(ActionEvent event) {

    }

    @FXML
    void enterName(ActionEvent event) {

    }

    @FXML
    void enterTitle(ActionEvent event) {

    }

    @FXML
    void selectCancel(ActionEvent event) {
        Main.close();
    }

    @FXML
    void selectNo(ActionEvent event) {

    }


    @FXML
    void selectPriority() {
        ObservableList<String> listPriority = FXCollections.observableArrayList("Alta", "M�dia", "Baixa");
        btnPriority.setItems(listPriority);

    }

    @FXML
    void selectSystem() {
        ObservableList<String> listSystem = FXCollections.observableArrayList("ExemploTrabalho");
        btnSystem.setItems(listSystem);
    }

    @FXML
    void selectYes(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btnNo != null : "fx:id=\"btnNo\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btnOk != null : "fx:id=\"btnOk\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btnPriority != null : "fx:id=\"btnPriority\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btnSystem != null : "fx:id=\"btnSystem\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btnYes != null : "fx:id=\"btnYes\" was not injected: check your FXML file 'Sample.fxml'.";
        assert descriptionText != null : "fx:id=\"descriptionText\" was not injected: check your FXML file 'Sample.fxml'.";
        assert nameEmail != null : "fx:id=\"nameEmail\" was not injected: check your FXML file 'Sample.fxml'.";
        assert nameText != null : "fx:id=\"nameText\" was not injected: check your FXML file 'Sample.fxml'.";
        assert nameTitle != null : "fx:id=\"nameTitle\" was not injected: check your FXML file 'Sample.fxml'.";

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        selectPriority();
        selectSystem();
    }

}
