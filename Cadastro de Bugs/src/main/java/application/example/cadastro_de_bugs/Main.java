package application.example.cadastro_de_bugs;

import java.time.LocalDate;
import java.util.Calendar;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) {

        stage = primaryStage;

        try {
            primaryStage.setTitle("Cadastro de Bugs");
            BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root,600,400);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        stage.close();
    }



    public static void alert() {
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int min = data.get(Calendar.MINUTE);
        int seg = data.get(Calendar.SECOND);

        try {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Cadastro de Bug");
            alert.setHeaderText("Bug cadastrado com sucesso!!");
            alert.setContentText("Data: " + LocalDate.now() + "\nHora: " + hora + ":" + min + ":" + seg);

            alert.showAndWait();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
