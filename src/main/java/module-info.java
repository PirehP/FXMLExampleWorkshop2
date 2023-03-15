module com.example.fxmlexampleworkshop2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxmlexampleworkshop2 to javafx.fxml;
    exports com.example.fxmlexampleworkshop2;
}