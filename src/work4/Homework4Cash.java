package work4;

import java.util.Scanner;

public class Homework4Cash {

//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數

	public static void main(String[] args) {

		int cash, borr;
		int sum = 0;

		int[][] emNum = { { 2500, 800, 500, 1000, 1200 }, { 25, 32, 8, 19, 27 } };

		System.out.println("請輸入預借金額:");
		Scanner sc = new Scanner(System.in);
		borr = sc.nextInt();
		while (borr > 2500) {
			System.out.print("借太多了,沒人可以借你,重新輸入要借多少:");
			borr = sc.nextInt();
			if (borr <= 2500) {
				break;
			}
		}

		System.out.print("有錢可借的員工編號:");
		for (int i = 0; i <= 0; i++) {
			for (int j = 0; j < emNum[i].length; j++) {
				if (emNum[i][j] >= borr) {
					int getEmNum = emNum[1][j];
					sum += 1;

					System.out.print(getEmNum + " ");

				}
			}
			System.out.print("共" + sum + "人!");
		}

	}
}
