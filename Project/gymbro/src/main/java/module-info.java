module sk.stuba.fiit.martin.szabo.gymbro {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    exports sk.stuba.fiit.martin.szabo.gymbro.window;
    opens sk.stuba.fiit.martin.szabo.gymbro.window to javafx.fxml;
    exports sk.stuba.fiit.martin.szabo.gymbro;
    opens sk.stuba.fiit.martin.szabo.gymbro to javafx.fxml;
    exports sk.stuba.fiit.martin.szabo.gymbro.window.fxml;
    opens sk.stuba.fiit.martin.szabo.gymbro.window.fxml to javafx.fxml;
    exports sk.stuba.fiit.martin.szabo.gymbro.window.eventmanager;
    opens sk.stuba.fiit.martin.szabo.gymbro.window.eventmanager to javafx.fxml;
}