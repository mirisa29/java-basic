
public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
			}
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}
}