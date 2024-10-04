package method.q06;

public class Circle {
	public static void main(String[] args) {
		double radius = 5.0;

		double area = getCircleArea(radius);

		System.out.println("半径:" + radius);
		System.out.println("円の面積:" + area);

	}

	public static double getCircleArea(double radius) {
		double pi = 3.14;
		return pi * radius * radius;
	}

}
