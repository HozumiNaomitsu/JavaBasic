package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		final int distance = 100;

		Car car1 = new Car();
		car1.color = "blue";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.color = "rose";
		car2.gasoline = 100;

		Car car3 = new Car();
		car3.color = "green";
		car3.gasoline = 150;

		Car[] cars = new Car[3];
		cars[0]=car1;
		cars[1]=car2;
		cars[2]=car3;


		for(int i=0 ; i<cars.length; i++) {

			System.out.println("----------------" + cars[i].color + "---------------------");

			int n1 = 0;
			int sum1 = 0;

			while (true) {
				int run1 = cars[i].run();
				n1++;

				if (run1 == -1) {
					System.out.println("目的地に到達できません");
					break;
				}

				sum1 += run1;
				System.out.println(sum1);

				if (distance <= sum1) {

					System.out.println("目的地にまで" + n1 + "時間までかかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです");
					break;
				}
			}
		}


	}
}
