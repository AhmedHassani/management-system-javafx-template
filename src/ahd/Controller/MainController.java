/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahd.Controller;

import com.sun.javafx.scene.control.skin.FXVK;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.animation.Timeline;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class MainController implements Initializable {

    @FXML
    private AnchorPane main_layou_program;
    @FXML
    private HBox topmenu;
    @FXML
    private HBox topmenu1;
    @FXML
    private HBox topmenu2;
    @FXML
    private Label admin;
    @FXML
    private HBox topmenu3;
    @FXML
    private ComboBox<?> languege;
    @FXML
    private VBox sild;
    @FXML
    private Label l_mnue;
    @FXML
    private Label l_sjall;
    @FXML
    private Label l_material;
    @FXML
    private Label l_chart;
    @FXML
    private Label l_setting;
    @FXML
    private Label l_wsel;
    @FXML
    private Label l_debt;
    @FXML
    private Label l_about;
    @FXML
    private Label l_logout;
    @FXML
    private BorderPane show_layout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.LoadMnue();
    }

    @FXML
    private void ChangeLan(Event event) {
    }

    @FXML
    private void Close(MouseEvent event) {
        ButtonType yes = new ButtonType("نعم", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("رجوع", ButtonBar.ButtonData.CANCEL_CLOSE);
        Alert alert = new Alert(Alert.AlertType.NONE, "هل تريد اغلاق البرنامج ؟",
                yes,
                no);
        alert.initStyle(StageStyle.UNDECORATED);

        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add(
                getClass().getResource("dialog.css").toExternalForm());
        alert.setTitle("اغلاق البرنامج");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.orElse(no) == yes) {
            Stage window = (Stage) main_layou_program.getScene().getWindow();
            System.exit(0);
            window.close();
        }

    }

    public void LoadMnue() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/ahd/Layout/Mnue.fxml"));
            this.show_layout.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void MakeSilded(MouseEvent event) throws IOException {
        this.LoadMnue();
    }

    @FXML
    private void OpenKey(MouseEvent event) {
        TextField textField = new TextField();
        textField.getProperties().put(FXVK.VK_TYPE_PROP_KEY, "numeric");
        textField.getProperties().put(FXVK.VK_TYPE_PROP_KEY, "numeric");
        FXVK.init(textField);
        FXVK.attach(textField);
    }

}
