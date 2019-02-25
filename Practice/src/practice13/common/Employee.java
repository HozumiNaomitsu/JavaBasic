package practice13.common;

public class Employee extends Person {


	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */

	private String departmentNm;
	private int departmenCnt;

	public String getDepartmentNm() {
		return departmentNm;
	}
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	public int getDepartmenCnt() {
		return departmenCnt;
	}
	public void setDepartmenCnt(int departmenCnt) {
		this.departmenCnt = departmenCnt;
	}




}
