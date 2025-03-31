module br.fatec.bancodebravos.schedu {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;
    requires com.jfoenix;
    

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;


    opens br.fatec.bancodebravos.schedu to javafx.fxml;
    opens br.fatec.bancodebravos.schedu.controller to javafx.fxml;
    exports br.fatec.bancodebravos.schedu;
    exports br.fatec.bancodebravos.schedu.controller;
}