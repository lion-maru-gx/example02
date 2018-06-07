package jp.gr.java_conf.lion_maru_gx.example.common;

/**
 * 実行中のクラス名、メソッド名取得ユーティリティ
 * @author lion-maru-gx
 *
 */
public class ClassUtil {

    /**
     * 実行中のクラス名を取得します。
     * スレッドからの取得のため呼び出し方法に注意
     * @return クラス名
     */
    public static String getClassName() {
        return Thread.currentThread().getStackTrace()[2].getClassName();
    }

    /**
     * 実行中のメソッド名を取得します。
     * @return メソッド名
     */
    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

}
