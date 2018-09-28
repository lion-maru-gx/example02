package jp.gr.java_conf.lion_maru_gx.example.example02;


import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class Page1Controller {
    File            f                       = null;                     // 選択したファイルorディレクトリ情報
    String          str                     = null;                     // 一時変数
	@FXML
	Label fileName;
    /**
     * ボタンクリックアクション
     */
    @FXML
    protected void handleButton0Action() {
        Main.getInstance().sendController(Main.Page.Main);
    }
    /**
     * ボタンクリックアクション
     */
    @FXML
    protected void handleButton11Action() {
        Main.getInstance().sendController(Main.Page.Page11);
    }

    @FXML
    protected void handleFileOpen() {
        // ファイル選択ダイアログを表示し、選択したファイルパスを取得
        FileChooser fc = new FileChooser();
        fc.setTitle( "ファイル選択ダイアログ" );
        fc.getExtensionFilters().addAll( new ExtensionFilter( "All Files", "*.*" ),
                                         new ExtensionFilter( "Text Files", "*.txt" ),
                                         new ExtensionFilter( "Image Files", "*.png", "*.jpg", "*.gif" ),
                                         new ExtensionFilter( "Audio Files", "*.wav", "*.mp3", "*.aac" )
                                        );
        f   = fc.showOpenDialog(Main.getInstance().getStage());
        str = ( f == null )? "選択なし" : f.toURI().toString() ;
        fileName.setText("選択したファイル名 : " + str );

    }
    
    
}
