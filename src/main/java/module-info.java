module com.example.gymgorilla {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.gymgorilla to javafx.fxml;
    exports com.example.gymgorilla;
}