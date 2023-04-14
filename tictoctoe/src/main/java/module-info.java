module com.example.tictoctoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictoctoe to javafx.fxml;
    exports com.example.tictoctoe;
}