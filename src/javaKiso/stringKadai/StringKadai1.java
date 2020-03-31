package javaKiso.stringKadai;

public class StringKadai1 {

	public static void main(String[] args) {
		// 1.1文字列を変数に設定する
		String s1 = "東京都千代田区";
		String s2 = "名古屋市中村区名駅";
		String s3 = "大阪市";

		// 1.2 1.1.で文字列を設定した変数を利用して以下の内容をコンソールに出力する
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);

		//2.文字列の文字数を判定しコンソールに出力する
		System.out.println("s1の文字列長は" + s1.length() +  "です");
		System.out.println("s2の文字列長は" + s2.length() + "です");
		System.out.println("s3の文字列長は" + s3.length() + "です");

	}

}
