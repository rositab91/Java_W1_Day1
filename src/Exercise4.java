
public class Exercise4 {


	public static void main(String[] args) {
		// a
		double x = 3.6;
		double y = 2.3;
		double rectanglePerimeter = calculatePerimeter(x, y);
		System.out.println("The rectangle perimeter result is: " + rectanglePerimeter + "\n------");

		// b
		int number = 4;
		int even = oddEven(number);
		System.out.println("Result is: " + even + "\n------");

		// c
		double b = 3.6;
		double h = 5.4;
		double area = calculateArea(b, h);
		System.out.println("The triangle area result is: " + area + "\n------");
	}

	public static double calculatePerimeter(double x, double y) {
		return (x + y) * 2;
	}

	public static int oddEven(int number) {
		if (number % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public static double calculateArea(double b, double h) {
		return (b * h) / 2;
	}
}

