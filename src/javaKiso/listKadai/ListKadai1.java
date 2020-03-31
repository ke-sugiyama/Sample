package javaKiso.listKadai;

import java.util.ArrayList;
import java.util.List;

public class ListKadai1 {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("ジャイアンツ");
		stringList.add("ベイスターズ");
		stringList.add("タイガース");
		stringList.add("カープ");
		stringList.add("ドラゴンズ");
		stringList.add("スワローズ");

		System.out.println("1個目：" + stringList.get(0));
		System.out.println("2個目：" + stringList.get(1));
		System.out.println("3個目：" + stringList.get(2));
		System.out.println("4個目：" + stringList.get(3));
		System.out.println("5個目：" + stringList.get(4));
		System.out.println("6個目：" + stringList.get(5));

		System.out.println();


		stringList.remove(3);
		System.out.println("4個目の文字列削除後");
		System.out.println("1個目：" + stringList.get(0));
		System.out.println("2個目：" + stringList.get(1));
		System.out.println("3個目：" + stringList.get(2));
		System.out.println("4個目：" + stringList.get(3));
		System.out.println("5個目：" + stringList.get(4));

		System.out.println();

		stringList.remove("ベイスターズ");

		System.out.println("文字列ベイスターズ削除後");
		System.out.println("1個目：" + stringList.get(0));
		System.out.println("2個目：" + stringList.get(1));
		System.out.println("3個目：" + stringList.get(2));
		System.out.println("4個目：" + stringList.get(3));

	}

}
