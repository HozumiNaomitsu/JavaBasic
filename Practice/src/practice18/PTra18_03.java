/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				Player player = new Player();
				String line = scanner.nextLine();
				// ★ 1行ごとにArrayListに格納してください
				String[] list = line.split(",");

				//listの中身をplayerインスタンスのフィールドにセット
				player.setPosition(list[0]);
				player.setName(list[1]);
				player.setCountry(list[2]);
				player.setTeam(list[3]);

				// 作成したplayerインスタンスをarrayについかする

				array.add(player);

			}

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}
		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		//zyogai
		for (int i = array.size() - 1; 0 <= i; i--) {
			if (array.get(i).getTeam().equals("レアル・マドリード") || array.get(i).getTeam().equals("バルセロナ")) {
				array.remove(i);

			}
		} //チームだけの出力
			//本で以前やったとこ

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		// ★ 削除後のArrayListの中身を全件出力してください
		for (Player player : array) {
			System.out.println(player.toString());
		}

	}
}