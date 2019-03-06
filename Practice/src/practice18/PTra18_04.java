/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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
		Collections.shuffle(array);

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		//for(Player s:array) {
		//if()
		int gkCount =0;
		int dfCount =0;
		int mfCount =0;
		int fwCount =0;



		for (int i = array.size() - 1; 0 <= i; i--) {

			if(array.get(i).getPosition().equals("GK")) {
				if(gkCount<1) {
					System.out.println(array.get(i));
					gkCount++;
				}
			}

			if(array.get(i).getPosition().equals("DF")) {
				if(dfCount<4) {
					System.out.println(array.get(i));
					dfCount++;
				}
			}
			if(array.get(i).getPosition().equals("MF")) {
				if(mfCount<4) {
					System.out.println(array.get(i));
					mfCount++;
				}
			}
			if(array.get(i).getPosition().equals("FW")) {
				if(fwCount<2) {
					System.out.println(array.get(i));
					fwCount++;
				}
			}
	}
}
		}



		//
		//			if (array.get(i).getPosition().equals("GK") && gkCount<1){
		//				System.out.println(array.get(i));
		//				array.remove(i);
		//
		//			}else if(array.get(i).getPosition().equals("DF") && dfCount<4) {
		//				break;

		//if(array.get(i).getPosition().equals("MF") ll getPosition =4) {
		//break;

		//if(array.get(i).getPosition().equals("FW") ll getPosition=2) {
		//break;

		//|| array.get(i).getTeam().equals("バルセロナ")) {
		//array.remove(i);