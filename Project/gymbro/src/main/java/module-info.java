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
    exports sk.stuba.fiit.martin.szabo.gymbro.setups;
    opens sk.stuba.fiit.martin.szabo.gymbro.setups to javafx.fxml;
    exports sk.stuba.fiit.martin.szabo.gymbro.managers.scene;
    opens sk.stuba.fiit.martin.szabo.gymbro.managers.scene to javafx.fxml;
    exports sk.stuba.fiit.martin.szabo.gymbro.managers.event;
    opens sk.stuba.fiit.martin.szabo.gymbro.managers.event to javafx.fxml;
}