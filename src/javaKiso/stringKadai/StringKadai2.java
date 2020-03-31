package javaKiso.stringKadai;

public class StringKadai2 {

	public static void main(String[] args) {
		// 1.1文字列を変数に設定する
		String s1 = "東京都杉並区";
		String s2 = "東京都練馬区";
		String s3 = "東京都杉並区";

		// 1.2 1.1.で文字列を設定した変数を利用して以下の内容をコンソールに出力する
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);

		// 2. １で設定した変数同士を比較しその結果をコンソールに出力する
		System.out.println("s1とs2の比較結果 = " + s1.equals(s2));
		System.out.println("s1とs3の比較結果 = " + s1.equals(s3));

		//3.変数s1(東京都杉並区)の2文字が何であるか判定しその結果を出力する
		System.out.println("2文字目は" + s1.charAt(1) + "です");

		//4.変数s1(東京都杉並区)の2文字が何であるか判定しその結果を出力する
		System.out.println("3文字めから5文字目は" + s1.substring(2,5) + "です");

	}

}
