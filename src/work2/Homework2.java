package work2;

public class Homework2 {
	public static void main(String[] args) {

		// 一.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int n = 2, sum = 0;
		for (n = 2; n <= 1000; n += 2) {
			sum += n;
		}
		System.out.println("1~1000的偶數和為" + sum);

		
		// 二.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int n2, sum2 = 1;
		for (n2 = 1; n2 <= 10; n2++) {
			sum2 = sum2 * n2;
		}
		System.out.println("用for迴圈1~10的連乘積為" + sum2);

		
		// 三.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int n3 = 1, sum3 = 1;
		while (n3 <= 10) {
			sum3 = sum3 * n3;
			n3 += 1;
		}
		System.out.println("用while迴圈1~10的連乘積為" + sum3);

		
		// 四.請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		int n4, m4;
		for (n4 = 1; n4 <= 10; n4++) {
			for (m4 = n4; m4 <= n4; m4++) {
				System.out.print(m4 * n4 + " ");
			}
		}
		System.out.println();

		
		// 五.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int n5, m5, sum5 = 0; // n5十位數,m5個位數
		for (n5 = 0; n5 <= 4; n5++) {
			for (m5 = 0; m5 <= 9; m5++) {
				if (m5 != 4 && n5 != 4) { // 十位數、個位數皆不為4
					if (n5 != 0 || m5 != 0) { // 刪去00
						sum5 += 1; // 完成所有條件計次一次
						System.out.print(n5);
						System.out.print(m5 + " ");
					}
				}
			}
		}
		System.out.println();
		System.out.println("共" + sum5 + "個");

		
		/*
		 * 六.請設計一隻Java程式,輸出結果為以下: 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8
		 * 1 2 3 4 5 6 7 1 2 3 4 5 6 1 2 3 4 5 1 2 3 4 1 2 3 1 2 1
		 */
		int n6, m6;
		for (n6 = 1; n6 <= 10; n6++) {
			for (m6 = 1; m6 <= 11 - n6; m6++) {
				System.out.print(m6);
			}
			System.out.println();
		}

		
		/*
		 * 七.請設計一隻Java程式,輸出結果為以下: A BB CCC DDDD EEEEE FFFFFF
		 */
		int n7, m7;
		for (n7 = 1; n7 <= 6; n7++) {
			for (m7 = 1; m7 <= n7; m7++) {
				if (n7 == 1) {
					System.out.print("A");

				} else if (n7 == 2) {
					System.out.print("B");

				} else if (n7 == 3) {
					System.out.print("C");

				} else if (n7 == 4) {
					System.out.print("D");

				} else if (n7 == 5) {
					System.out.print("E");

				} else if (n7 == 6) {
					System.out.print("F");
				}

			}
			System.out.println();

		}

	}

}
