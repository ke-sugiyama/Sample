package javaKiso.arrayKadai;

import java.util.Arrays;
import java.util.Collections;

public class ArrayKadai2 {

	public static void main(String[] args) {
		Integer[] numberArray = {1, 5, 11 ,3, 7};

		System.out.println("1個目：" + numberArray[0]);
		System.out.println("2個目：" + numberArray[1]);
		System.out.println("3個目：" + numberArray[2]);
		System.out.println("4個目：" + numberArray[3]);
		System.out.println("5個目：" + numberArray[4]);

		System.out.println();

		System.out.println("numberArrayの要素数：" + numberArray.length);

		System.out.println();

		Arrays.sort(numberArray);
		System.out.println("numberArrayの昇順");
		System.out.println("1個目：" + numberArray[0]);
		System.out.println("2個目：" + numberArray[1]);
		System.out.println("3個目：" + numberArray[2]);
		System.out.println("4個目：" + numberArray[3]);
		System.out.println("5個目：" + numberArray[4]);

		System.out.println();

		System.out.println("numberArrayの降順");
		Arrays.sort(numberArray, Collections.reverseOrder());
		System.out.println("1個目：" + numberArray[0]);
		System.out.println("2個目：" + numberArray[1]);
		System.out.println("3個目：" + numberArray[2]);
		System.out.println("4個目：" + numberArray[3]);
		System.out.println("5個目：" + numberArray[4]);

	}

}
