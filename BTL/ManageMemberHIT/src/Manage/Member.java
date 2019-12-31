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
		System.out.print("Mã sv=" + this.getMemberCode() + ", Họ=" + this.getFirstName() + ", Tên=" + this.getLastName() + ", Ngày sinh="
				+ this.getBirth() + ", Địa chỉ=" + this.getAddress() + ", Chuyên ngành=" + this.getMajor() + ", Khóa=" + this.getK() + "\n\t Số đt=" + this.getPhone() + ", Chức vụ="
				+ this.getPosition()+", ");
		
		if (listClass.size()>0) {
			System.out.print("Lớp học:");
			for(String x: listClass) {
				System.out.print(x+", ");
			}
			
		}
		System.out.println();
	}
}
