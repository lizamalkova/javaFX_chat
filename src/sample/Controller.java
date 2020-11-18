package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private TextField inputChat;
    @FXML
    private ListView<String> chatDialog;
    @FXML
    private ListView<String> personView;


  //  ObservableList<String> chatList = FXCollections.observableArrayList();

    ObservableList<String> personViewList = FXCollections.observableArrayList("Max", "Kate", "Jone");

    @FXML
    public void initialize() {
       personView.setItems(personViewList);
    }

    @FXML
    public void addSentenceToChat() {
        String sentence = inputChat.getText();
        if (!sentence.isEmpty()) {
            chatDialog.getItems().add(sentence);
        }
        inputChat.setText("");
    }

    @FXML
    public void exit() {
        System.exit(0);
    }

    @FXML
    void addUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("addUserWindow.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Add user");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openAbout(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("About.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("About");
        stage.setScene(scene);
        stage.show();
    }

}

