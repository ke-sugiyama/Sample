package javaKiso.ifKada;

import java.util.ArrayList;
import java.util.List;

public class IfKadai2 {

	public static void main(String[] args) {

		List<String> languageList = new ArrayList<String>();
		languageList.add("日本語");
		languageList.add("英語");
		languageList.add("フランス語");
		languageList.add("スペイン語");

		for(int i = 0; i < languageList.size();i++) {

			switch (languageList.get(i)) {
			case "日本語":
				System.out.println(languageList.get(i) + "での挨拶は「こんにちは」");
				break;
			case "英語":
				System.out.println(languageList.get(i) + "での挨拶は「Hello」");
				break;
			case "フランス語":
				System.out.println(languageList.get(i) + "での挨拶は「Bonjour」");
				break;
			default:
				System.out.println(languageList.get(i) + "での挨拶は「Buenas tardes」");
				break;
			}

		}


	}

}
