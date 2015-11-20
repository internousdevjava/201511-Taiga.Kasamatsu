import java.util.Random;
import java.util.Scanner;

public class Kisokadai2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random rnd = new Random();

		int num = rnd.nextInt(101);

		System.out.println("数当てゲームの始まりです。");
		System.out.println("１～１００まで数字を当てて下さい！");

		int a;
		a = s.nextInt();

		do {
			System.out.println("");

			a = s.nextInt();
			if (a == 0 || 101 <= a)
				System.out.println("１～１００までの値を入力して下さい。");

			if (num > a)
				if ((num - a) <= 100 && (num - a) >= 50)
					System.out.println("全然上！");
				else if ((num - a) <= 49 && (num - a) >= 20)
					System.out.println("もう少し上");
				else if ((num - a) <= 19 && (num - a) >= 5)
					System.out.println("近い！もちっと上");
				else if ((num - a) <= 4 && (num - a) >= 1)
					System.out.println("惜しい、わずかに上");

			if (num < a)
				if ((a - num) <= 100 && (a - num) >= 50)
					System.out.println("全然下！");
				else if ((a - num) <= 49 && (a - num) >= 20)
					System.out.println("もう少し下");
				else if ((a - num) <= 19 && (a - num) >= 5)
					System.out.println("近い！もちっと下");
				else if ((a - num) <= 4 && (a - num) >= 1)
					System.out.println("惜しい！わずかに下");

		} while (num != a);

		System.out.println("大～～～当たり！！！");
	}

}