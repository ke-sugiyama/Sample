package javaKiso.exceptionKadai;

public class ExceptionKadai {

	public static void main(String[] args) {

		System.out.println("★引数100で実行");
		System.out.println(changeType(100));

		System.out.println("★引数こんにちはで実行");
		System.out.println(changeType("こんにちは"));

		System.out.println("★引数nullで実行");
		System.out.println(changeType(null));

	}

	/**
	 * 受け取った引数をint型に変換する
	 * @param value
	 * @return
	 */
	public static int changeType(Object value) {
		int intValue = 0;

		try {
			intValue = (int) value;

		} catch (ClassCastException cce) {

		} catch (NullPointerException npe) {
			System.out.println("例外発生");
		}

		return intValue;
	}

}
