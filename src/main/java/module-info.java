module com.example.calculadorfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    exports com.example.calculadorfx;
    exports Controller;
    opens Controller to javafx.fxml;
}