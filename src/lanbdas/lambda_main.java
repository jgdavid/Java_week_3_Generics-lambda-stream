package lanbdas;

public class lambda_main {

	public static void main(String[] args) {
		Calc addition = (a, b) -> a + b;
		Calc subtraction = (a, b) -> a - b;
		Calc multiply = (a, b) -> a * b;
		Calc divide = (a, b) -> a / b;
		System.out.println(addition.calculate(10, 10));
		System.out.println(subtraction.calculate(15, 5));
		System.out.println(multiply.calculate(2, 7));
		System.out.println(divide.calculate(30, 2));
	}

}
