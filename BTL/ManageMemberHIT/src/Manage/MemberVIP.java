package Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberVIP extends Person{
	private ArrayList<String> listClass = new ArrayList<String>();//những lớp là leader/support đảm nhiệm, nếu là ban quản trị,chủ nhiệm thì = null

	public MemberVIP() {
		super();
	}

	public MemberVIP(String code, String firstName, String lastName, String birth, String address, String major, int k,
			String phone, String position, ArrayList<String> listClass) {
		super(code, firstName, lastName, birth, address, major, k, phone, position);
		this.listClass = listClass;
	}

	public ArrayList<String> getListClass() {
		return listClass;
	}

	public void setListClass(ArrayList<String> listClass) {
		this.listClass = listClass;
	}
	
	public void showInfor() {};
	
}
