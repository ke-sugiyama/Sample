package javaKiso.classKadai2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class ReadWriter {

	private String pathA;
	private String pathB;
	private  static String outputPath;

	/**
	 * コンストラクタ
	 * @param filePathA
	 * @param filePathB
	 */
	public ReadWriter(String filePathA, String filePathB) {
		this.pathA = filePathA;
		this.pathB = filePathB;

	}

	/**
	 * setter
	 * @param ouputFilePath
	 */
	public void setOutputPath(String ouputFilePath) {
		outputPath = ouputFilePath;
	}

	public Map<Integer, String> read() {
		//ファイルのデータを読み込む
		InputStream propAStream = null;
		InputStream propBStream = null;
		// 最後に昇順で出力するためLinkedHashMapで並び順を保持する
		Map<Integer, String> employeeMap = new LinkedHashMap<Integer, String>();
		try {

			Properties propA = new Properties();

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
		return employeeMap;
	}

	public static void write(Map<Integer, String> employeeMap) {

		// ファイル出力
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(outputPath);
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
