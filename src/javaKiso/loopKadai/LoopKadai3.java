package javaKiso.loopKadai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoopKadai3 {

	public static void main(String[] args) {

		Random random = new Random();
		int randomValue = random.nextInt(10) + 2;

		System.out.println("randomValue = " + randomValue);

		List<Integer> randomList = new ArrayList<Integer>();
		for(int i = 0; i < randomValue; i ++) {
			randomList.add(i + 1);
		}

		for(int number : randomList) {
			System.out.println(number + "個");
		}

	}

}
