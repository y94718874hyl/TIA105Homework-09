package work3;

import java.util.Scanner;

public class Homework3Lotto {
//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
//(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int sum = 0;
		int noNum = 0;
		System.out.print("請輸入0~9中不想要的數字");

		noNum = sc.nextInt();
		while (noNum > 10) {
			System.out.print("輸入錯誤,請輸入0~9的數字");
			noNum = sc.nextInt();
			if (noNum <= 9) {
				break;
			}
		}

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i <= 9; i++) {
				if ((j != noNum) && (i != noNum)) {
					if (j != 0 || i != 0) {
						sum += 1;
						System.out.print(j);
						System.out.print(i + " ");
					}
				}
			}
		}
		System.out.println();
		System.out.println("共" + sum + "個");
	}
}
