
public class ArgsLastPrinter {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("なし");
		}
		for (int i = 0; i < args.length; i++) {
			if (i == args.length - 1) {
				System.out.println(args[i]);
			}
		}
	}
}