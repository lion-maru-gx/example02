package jp.gr.java_conf.lion_maru_gx.example.example02;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

public class Page1Controller implements Initializable {
    /** ラベル */
    @FXML
    private Label voiceName01;
    @FXML
    private Label voiceName02;
    @FXML
    private Label voiceName03;
    @FXML
    private Label voiceName04;
    @FXML
    private Label voiceName05;
    @FXML
    private Label voiceName06;
    @FXML
    private Label voiceName07;
    @FXML
    private Label voiceName08;
    @FXML
    private Label voiceName09;
    @FXML
    private Label voiceName10;
    @FXML
    private Label voiceName11;
    @FXML
    private Label voiceName12;
    @FXML
    private Label voiceName13;
    @FXML
    private Label voiceName14;
    @FXML
    private Label voiceName15;
    @FXML
    private Label voiceName16;
    @FXML
    private ComboBox<String> fruitCombo;
    @FXML
    private ChoiceBox<String> bankChoiceBox;
    /**
     * ボタンクリックアクション
     */
    @FXML
    protected void handleButtonAction() {
        Main.getInstance().sendController(Main.Page.Main);
    }

    /**
     * ボタンクリックアクション
     */
    @FXML
    protected void onClickSaveBtn() {
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Open Resource File");
    	File file = fileChooser.showSaveDialog(Main.getInstance().getStage());
    }

    @FXML
    protected void onClickRestoreBtn() {
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Open Resource File");
    	File file = fileChooser.showOpenDialog(Main.getInstance().getStage());
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	    Label[] voiceNameArray = {
	    		voiceName01,voiceName02,voiceName03,voiceName04
	    		,voiceName05,voiceName06,voiceName07,voiceName08
	    		,voiceName09,voiceName10,voiceName11,voiceName12
	    		,voiceName13,voiceName14,voiceName15,voiceName16
	    		};
		for(int i=0; i < 16 ; i++){
			voiceNameArray[i].setText("VOICENAME"+i);
		}
	}
    @FXML
    protected void onClickVoiceLabel(ActionEvent e) {
    	Label label = (Label)e.getSource();
    	
    }

}
