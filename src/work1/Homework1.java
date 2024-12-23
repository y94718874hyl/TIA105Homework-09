package work1;

public class Homework1 {
	public static void main(String[] args) {
		//一.請設計一隻Java程式,計算12,6這兩個數值的和與積
		int num1 = 12 , num2 = 6;
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		
		//二.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		int eggD = (egg / 12);
		
		if(egg % 12 != 0) {
		System.out.println("共" + eggD + "打" + egg % 12 + "顆");
		}else {
		System.out.println("共" + eggD + "打" );
		}
		
		//三.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec = 256559;

		int min = (sec / 60);
		sec = (sec % 60);
		int hour = (min / 60);
		min =(min % 60) ;
		int day = (hour / 24);
		hour =(hour % 24) ;
		
		System.out.println("共" + day + "天" + hour+ "時" + min + "分" + sec + "秒");

		//四.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double PI = 3.1415;
		double n1 = 5, sum1, sum2;
		sum1 = n1 * n1 * PI;
		sum2 = (n1 * 2) * PI;
		
		System.out.println("圓周率是" + sum1 + ",圓面積是" + sum2);
		
		
		//五.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		double money=150 , rate= 0.02, years=10 ;
		System.out.println("共" + money * (Math.pow((1+rate),years)) + "萬元");
		
		
		
		//六請寫一隻程式,利用System.out.println()印出以下三個運算式結果,並請用註解各別說明答案的產生原因
		System.out.println(5 + 5);   //皆為整數,因此運算後為整數10
		
		System.out.println(5 + '5'); //前者為整數,後者單引號表char,編碼為53,因此計算後為58
		
		System.out.println(5 + "5"); //前者為整數,後者雙引號表String,串接後以字串表示,因此為字串55
		
		
	}

}
