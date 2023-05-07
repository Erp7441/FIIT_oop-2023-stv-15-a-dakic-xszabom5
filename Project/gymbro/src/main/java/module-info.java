module com.gymbro {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    exports com.gymbro.window;
    opens com.gymbro.window to javafx.fxml;
    exports com.gymbro;
    opens com.gymbro to javafx.fxml;
    exports com.gymbro.window.fxml;
    opens com.gymbro.window.fxml to javafx.fxml;
    exports com.gymbro.setups;
    opens com.gymbro.setups to javafx.fxml;
    exports com.gymbro.managers.scene;
    opens com.gymbro.managers.scene to javafx.fxml;
    exports com.gymbro.managers.event;
    opens com.gymbro.managers.event to javafx.fxml;
    exports com.gymbro.utils;
    opens com.gymbro.utils to javafx.fxml;
}