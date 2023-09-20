module es.ieslosmontecillos.demogit {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.demogit to javafx.fxml;
    exports es.ieslosmontecillos.demogit;
}