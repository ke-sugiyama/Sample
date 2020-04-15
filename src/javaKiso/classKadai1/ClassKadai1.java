package javaKiso.classKadai1;

public class ClassKadai1 {

	public static void main(String[] args) {
		UtilValue utilValue = new UtilValue();

		int minValue = utilValue.getMinValue(7, 6);

		System.out.println("小さい数字は" + minValue);

	}

}
