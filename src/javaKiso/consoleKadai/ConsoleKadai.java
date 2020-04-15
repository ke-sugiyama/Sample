package javaKiso.consoleKadai;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleKadai {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1001, "エスアイ太郎");
		map.put(1002, "エスアイ次郎");
		map.put(1003, "エスアイ花子");

		Integer input_text1;

		Scanner sc1 = new Scanner(System.in);
		while (sc1.hasNext()) {
			input_text1 = sc1.nextInt();

			if (input_text1 == 9999) {
				break;
			}

			System.out.println(map.get(input_text1));

		}

		sc1.close();

	}

}
