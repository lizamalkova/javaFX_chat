package sample;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class aboutController {

    @FXML
    private javafx.scene.control.Button closeButton;
    @FXML
    public void close() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
