/* サンプルプログラム Main
 　 開発者：みれい　作成日：2025年2月
 */
public class Main {

	//ここからmainメソッド
	public static void main(String[] args) {
		process01();
		process02();
		process03();
		process04();
	}

	private static void process01() {
		int age; // 年齢を入れる箱
		age = 26;
		System.out.println("私は" + age + "歳");

		//いろんな文を書いてみよう

		int version;
		/* ①変数宣言の文
		 　　データを入れる箱を準備する
		 */

		version = 1 + 5;
		/*　②計算の文
		 　　　さまざまな計算をして結果を箱に入れる
		 */

		System.out.println("日記ソフト");
		System.out.println("ver" + version);
		System.out.println("まだ開発中です");
		System.out.println("終了します");

		/* ③命令実行の文(System.promtln...)
		 　　Javaが用意している命令を呼び出す
		 */

		//char　一文字だけを代入
		char zodiac;
		zodiac = '兎';
		//String 文字列を代入
		String name;
		name = "平氏";
	}

	private static void process02() {
		//自己紹介します。
		System.out.println("充禮です");
		System.out.println("26歳になりました");
		System.out.println("日本酒が好きです");

		System.out.println("26+26の計算をします");
		System.out.println(26 + 26);
		int x;
		x = 6;
		System.out.println(x * x * 3.14);

		System.out.println("もっと複雑な計算をします");
		System.out.println(35 - 10);
		System.out.println(-5 * 2);
		System.out.println(6 * 6 * 3.14);
		System.out.println("こたえは" + 64);
	}

	private static void process03() {
		System.out.println("Hello World!");
		int luckyNumber;
		luckyNumber = 7;
		String name;
		name = "名前";
		char color = '赤';
		name = "名前";
		luckyNumber = 7;
		luckyNumber = 777;
		System.out.println(luckyNumber);
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

	private static void process04() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int i = 0;
		while (i < 100) {
			System.out.println(i);
			i++;
		}
		i = 100;
		do {
			System.out.println(i);
			i++;
		} while (i < 100);

	}
}
