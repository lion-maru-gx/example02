package jp.gr.java_conf.lion_maru_gx.example.example02;

import javafx.fxml.FXML;

public class Page2Controller {
    /**
     * ボタンクリックアクション
     */
    @FXML
    protected void handleButton0Action() {
        Main.getInstance().sendController(Main.Page.Main);
    }

}
