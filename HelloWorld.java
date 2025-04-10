
public class HelloWorld {
	static void process03() {
		System.out.println("Hello World!");
		int luckyNumber;
		luckyNumber = 7;
		String name;
		name = "名前";
		char color = '赤';
		name = "名前";
		luckyNumber = 7;
		luckyNumber = 777;
		final float PI = 3.14F;
		System.out.println("こんにちは\nfoo barです。");

		String[] weekdays;
		weekdays = new String[7];
		weekdays[0] = "日";
		weekdays[1] = "月";
		weekdays[2] = "火";
		weekdays[3] = "水";
		weekdays[4] = "木";
		weekdays[5] = "金";
		weekdays[6] = "土";
		System.out.println(weekdays.length);
		System.out.println(weekdays[2]);
		System.out.println(weekdays[5]);

		if (name.equals("名前")) {
			System.out.println("正解です");
		}
	}
}