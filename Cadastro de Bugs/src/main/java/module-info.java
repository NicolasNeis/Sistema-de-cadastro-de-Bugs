module application.example.cadastro_de_bugs {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.example.cadastro_de_bugs to javafx.fxml;
    exports application.example.cadastro_de_bugs;
}