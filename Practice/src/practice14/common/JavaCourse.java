package practice14.common;

public  class JavaCourse implements Course {



	public String getCourseName() {
		return PREFIX+"Java";
	}


	public String[] getCourseUnit() {
		String[]a=new String[7];

		a[0]="式と演算";
		a[1]="制御構文";
		a[2]="メソッド";
		a[3]="配列";
		a[4]="オブジェクト指向";
		a[5]="継承";
		a[6]="高度な継承";

		return a;




	}




	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */



}
