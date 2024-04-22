module org.example.testfx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.testfx2 to javafx.fxml;
    exports org.example.testfx2;
}