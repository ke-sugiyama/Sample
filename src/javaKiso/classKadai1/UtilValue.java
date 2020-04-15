package javaKiso.classKadai1;

public class UtilValue {

	public int getMinValue(int value1, int value2) {

		if (value1 < value2) {
			return value1;
		} else if (value1 > value2) {
			return value2;
		} else {
			// この処理は課題ではあってもなくてもよい
			return 0;
		}

	}

}
