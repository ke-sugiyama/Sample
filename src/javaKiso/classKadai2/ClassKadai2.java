package javaKiso.classKadai2;

import java.util.Map;

public class ClassKadai2 {

	public static void main(String[] args) {

		String filePathA = "ファイルのパス";
		String filePathB = "ファイルのパス";

		ReadWriter readWrite = new ReadWriter(filePathA, filePathB);
		readWrite.setOutputPath("ファイルのパス");
		Map<Integer, String> employeeMap = readWrite.read();

		ReadWriter.write(employeeMap);

	}

}
