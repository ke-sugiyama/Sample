package javaKiso.ifKada;

import java.util.ArrayList;
import java.util.List;

public class IfKadai1 {

	public static void main(String[] args) {

		List<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(80);
		scoreList.add(75);
		scoreList.add(60);

		for(int i = 0; i < scoreList.size();i++) {
			if(scoreList.get(i) >= 80) {
				System.out.println(i + 1 + "個目：合格");
			} else {
				System.out.println(i + 1 + "個目：不合格");
			}
		}

		System.out.println();


		for(int j = 0; j < scoreList.size();j++){
			int score = scoreList.get(j);
			if( score >= 80) {
				System.out.println(j + 1 + "個目：秀");
			} else if (score > 60 && score < 80) {
				System.out.println(j + 1 + "個目：優");
			} else {
				System.out.println(j + 1 + "個目：良");
			}
		}


	}

}
