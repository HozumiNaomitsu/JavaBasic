/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero SH=new SuperHero();
		Slime S=new Slime();

		SH.setName("勇者<装備あり>");
		S.setName("スライム");


		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください

		Item item=new Item(null,0);
		item.setName("こんぼう");
		item.setAdditionalDamage(4);




		// ★ 作成したItemインスタンスをSuperHeroに持たせてください


		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」


			 while(true){

				int SH=hero.attack();
				boolean slimeDed = slime.damage(H);;
				if(slimeDed) {
					System.out.println(hero.getName()+"は"+slime.getName()+"との戦闘に勝利した。");
					break;
				}


				int S=slime.attack();
				boolean heroDed = hero.damage(H);;
				if(heroDed) {
					System.out.println(slime.getName()+"は"+hero.getName()+"との戦闘に勝利した。");
					break;
				}

	}
}
