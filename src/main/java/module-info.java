module com.example.barchart {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens com.example.barchart to javafx.fxml;
    exports com.example.barchart;
}