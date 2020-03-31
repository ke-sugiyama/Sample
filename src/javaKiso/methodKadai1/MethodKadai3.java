package javaKiso.methodKadai1;

public class MethodKadai3 {

	public static void main(String[] args) {

		printRectangleArea(5,10);


	}

	public static void printRectangleArea(int height, int width) {
		int area = height * width;
		System.out.println("高さ：" + height + " 横幅：" + width + " 面積：" + area);
	}

}
