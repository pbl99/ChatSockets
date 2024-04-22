module com.palmen.chatsockets.chatsockets {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.palmen.chatsockets.chatsockets to javafx.fxml;
    exports com.palmen.chatsockets.chatsockets;
}