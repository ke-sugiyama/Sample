package javaKiso.methodKadai;

public class MethodKadai5 {

	public static void main(String[] args) {

		int minValue = getMinValue(3,7);
		System.out.println("minValue = " + minValue);

	}

	public static int getMinValue(int value1, int value2) {

		if(value1 < value2) {
			return value1;
		} else if(value1 > value2) {
			return value2;
		} else {
			// この処理は課題ではあってもなくてもよい
			return 0;
		}

	}

}
