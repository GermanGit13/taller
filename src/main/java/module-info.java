module com.fhecor.taller {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

//    requires com.almasb.fxgl.all;

    opens com.fhecor.taller to javafx.fxml;
    exports com.fhecor.taller;
    exports com.fhecor.taller.controller;
    opens com.fhecor.taller.controller to javafx.fxml;
}