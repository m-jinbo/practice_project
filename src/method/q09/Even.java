package method.q09;

public class Even {
	public static void main(String[] args) {
		int num = 10;
		boolean isEven = checkEven(num);

		if (isEven) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
		int num2 = 5;
		boolean isEven2 = checkEven(num2);

		if (isEven2) {
			System.out.println(num2 + "は偶数です");
		} else {
			System.out.println(num2 + "は奇数です。");
		}
	}

	public static boolean checkEven(int number) {
		return number % 2 == 0;
	}

}
