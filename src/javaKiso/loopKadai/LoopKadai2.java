package javaKiso.loopKadai;

public class LoopKadai2 {

	public static void main(String[] args) {

		int i = 1;
		int sumA = 0;
		while(i<101) {
			sumA += i;
			i++;
		}

		System.out.println("合計：" + sumA);

	}

}
