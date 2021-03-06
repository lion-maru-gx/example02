package jp.gr.java_conf.lion_maru_gx.example.example02;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Main instance;

    public static enum Page{
        Main("main.fxml"),
        Page1("page1.fxml"),
        Page11("page11.fxml"),
        Page2("page2.fxml");

        // フィールドを定義
        private String url;

        // コンストラクタを定義
        private Page(String url) {
            this.url = url;
        }

        // メソッド
        public String getValue() {
            return this.url;
        }

    };

    /**
     * ステージ
     */
    private Stage stage;

	@Override
	public void start(Stage primaryStage) {
        // インスタンス
        instance = this;

        // ステージの設定
        stage = primaryStage;
        // ページ1に遷移
        sendController(Main.Page.Main);

        // ステージの設定
        stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

    /**
     * ページ移動
     * @param labelText
     */
    public void sendController(Page page) {

        this.setPage(page.url);
    }
    /**
     * シーンの変更
     * @param controller
     */
    private void setPage(String url) {
        Parent root;

        try {
            root = FXMLLoader.load(getClass().getResource(url));
            stage.setScene(new Scene(root, 800, 600));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get Instance
     *
     * @return
     */
    public static Main getInstance() {
        return instance;
    }

    public Stage getStage(){
    	return stage;
    }
}
