module com.project.m1.coderchat {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.project.m1.coderchat to javafx.fxml;
    exports com.project.m1.coderchat;
}