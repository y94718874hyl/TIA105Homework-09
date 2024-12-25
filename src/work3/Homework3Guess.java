package work3;

import java.util.Scanner;

public class Homework3Guess {
	// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
	// (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!請輸入0~9的數字:");
		int r = (int) (Math.random() * 10);

		while (true) {
			int i = sc.nextInt();
			if (i != r) {
				if (i < r) {
					System.out.println("答錯,猜太小囉");
				} else {
					System.out.println("答錯,猜太大囉");
				}
			} else {
				System.out.println("猜對囉答案就是" + r);
				break;
			}
		}
	}
}
