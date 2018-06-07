package jp.gr.java_conf.lion_maru_gx.example.example02;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class MainController {

    /**
     * ボタンクリックアクション
     */
    @FXML
    protected void handleEndButtonAction() {
    	Platform.exit();
    }
    /**
     * ボタンクリックアクション
     */
    @FXML
    protected void handleButtonAction() {
        Main.getInstance().sendController(Main.Page.Page1);
    }

}
