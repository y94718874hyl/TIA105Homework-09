package work5;

public class Random {

//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:

	public void randAvg() {

		int ran = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			ran = (int) (Math.random() * 101);
			System.out.print(ran + " ");
			sum += ran;

		}
		System.out.println();
		System.out.println(sum / 10);

	}

	public static void main(String[] args) {
		Random ranSult = new Random();
		System.out.println("本次亂數結果");
		ranSult.randAvg();
	}

}
