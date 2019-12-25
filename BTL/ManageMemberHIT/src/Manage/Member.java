package Manage;

import java.util.ArrayList;

public class Member extends Person {
	private ArrayList<String> listClass = new ArrayList<String>();
	private ArrayList<Mark> listMark = new ArrayList<Mark>();
	private int dayAbsent = 0;

	public Member() {
		super();
	}

	public Member(String code, String firstName, String lastName, String birth, String address, String major, int k,
			String phone, String position, ArrayList<String> listClass, ArrayList<Mark> listMark, int dayAbsent) {
		super(code, firstName, lastName, birth, address, major, k, phone, position);
		this.listClass = listClass;
		this.listMark = listMark;
		this.dayAbsent = dayAbsent;
	}

	public ArrayList<String> getListClass() {
		return listClass;
	}

	public void setListClass(ArrayList<String> listClass) {
		this.listClass = listClass;
	}

	public ArrayList<Mark> getListMark() {
		return listMark;
	}

	public void setListMark(ArrayList<Mark> listMark) {
		this.listMark = listMark;
	}

	public int getDayAbsent() {
		return dayAbsent;
	}

	public void setDayAbsent(int dayAbsent) {
		this.dayAbsent = dayAbsent;
	}

	public void ShowInfor() {
	};
}
