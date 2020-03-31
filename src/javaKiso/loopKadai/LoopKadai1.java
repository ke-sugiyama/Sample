package javaKiso.loopKadai;

import java.util.ArrayList;
import java.util.List;

public class LoopKadai1 {

	public static void main(String[] args) {

		for(int i = 0;  i<5; i++) {

			System.out.println("SIシステム株式会社");
		}

		List<String> seasonList = new ArrayList<String>();
		seasonList.add("春");
		seasonList.add("夏");
		seasonList.add("秋");
		seasonList.add("冬");
		System.out.println();

		for(int i = 0;  i<4; i++) {

			System.out.println(i+1 + "個目" + seasonList.get(i));
		}

		System.out.println();

		for(int i = 1; i<10; i ++) {
			System.out.print(i + "の段：");
			for(int j = 1; j < 10; j++) {
				System.out.print(i*j);
				System.out.print(" ");
			}

			System.out.println();
		}


	}

}
