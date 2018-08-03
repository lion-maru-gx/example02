package jp.gr.java_conf.lion_maru_gx.example.example02;

import javafx.fxml.FXML;

public class Page11Controller {
    /**
     * ボタンクリックアクション
     */
    @FXML
    protected void handleButton1Action() {
        Main.getInstance().sendController(Main.Page.Page1);
    }

}
