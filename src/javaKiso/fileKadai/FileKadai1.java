package javaKiso.fileKadai;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileKadai1 {
	public static void main(String[] args) {

		//プロパティファイルの読み込み
		Properties propA = new Properties();

		try {
			propA.load(new FileInputStream("C:\\temp\\workspace\\kadai\\src\\kadai4\\PropA.properties"));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		//プロパティの要素数をint型配列で作成
		int[] propVal = new int[propA.keySet().size()];
		int loopCount = 0;

		//int型配列に格納
		for (Object key : propA.keySet()) {
			int val = Integer.parseInt(propA.getProperty((String) key));
			propVal[loopCount] = val;
			loopCount++;

		}
	}

}
