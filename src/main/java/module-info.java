module helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;

    opens at.fhtw.helloworld to javafx.graphics, javafx.fxml;
    exports at.fhtw.helloworld;
}
