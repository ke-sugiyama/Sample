package javaKiso.fileKadai;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class FileKadai1 {

	public static void main(String[] args) {

		//ファイルのデータを読み込む
		InputStream propAStream = null;
		InputStream propBStream = null;
		// 最後に昇順で出力するためLinkedHashMapで並び順を保持する
		Map<Integer, String> employeeMap = new LinkedHashMap<Integer, String>();
		try {

			Properties propA = new Properties();
			String pathA = "プロパティファイルAのパスを入れる(絶対パスが無難)";

			propAStream = new FileInputStream(pathA);
			propA.load(propAStream);

			int[] empNumberArray = new int[propA.size()];
			for (int i = 0; i < propA.size(); i++) {
				empNumberArray[i] = Integer.parseInt(propA.get("Key" + (i + 1)).toString());

			}

			//昇順にソート
			Arrays.sort(empNumberArray);

			//ファイルBのデータを読み込む
			Properties propB = new Properties();
			String pathB = "プロパティファイルBのパスを入れる(絶対パスが無難)";

			propBStream = new FileInputStream(pathB);
			InputStreamReader reader = new InputStreamReader(propBStream, "UTF-8");
			propB.load(reader);

			//Mapを作成する
			for (int i = 0; i < propB.size(); i++) {
				int empNumber = empNumberArray[i];

				employeeMap.put(empNumber, propB.get(String.valueOf(empNumber)).toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (propAStream != null) {
					propAStream.close();
				}

				if (propBStream != null) {
					propBStream.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		// ファイル出力
		PrintWriter pw = null;
		try {
			// ファイルは存在しなくても新規作成される
			String ouputPath = "出力するファイルのパスをいれる";
			pw = new PrintWriter(ouputPath);
			for (Entry<Integer, String> set : employeeMap.entrySet()) {
				pw.println(set.getKey() + " : " + set.getValue());

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (pw != null) {

				pw.close();
			}
		}

	}

}
