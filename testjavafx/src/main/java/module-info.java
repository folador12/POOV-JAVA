module poov.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens poov.testjavafx to javafx.fxml;
    exports poov.testjavafx;
}
