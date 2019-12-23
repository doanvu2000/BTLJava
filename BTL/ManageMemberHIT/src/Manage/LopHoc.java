package Manage;

import java.util.ArrayList;

public class LopHoc {
	private String codeClass;
	private String nameClass;
	private ArrayList<Member> listMember = new ArrayList<Member>(); //Danh sách học sinh trong lớp đó
	private ArrayList<MemberVIP> listLeader = new ArrayList<MemberVIP>(); // danh sách leader + support
	
	public LopHoc() {
		super();
		this.codeClass = null;
		this.nameClass = null;
		this.listMember.clear();
		this.listLeader.clear();
	}
	public LopHoc(String codeClass, String nameClass, ArrayList<Member> listMember, ArrayList<MemberVIP> listLeader) {
		super();
		this.codeClass = codeClass;
		this.nameClass = nameClass;
		this.listMember = listMember;
		this.listLeader = listLeader;
	}
	public String getCodeClass() {
		return codeClass;
	}
	public void setCodeClass(String codeClass) {
		this.codeClass = codeClass;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public ArrayList<Member> getListMember() {
		return listMember;
	}
	public void setListMember(ArrayList<Member> listMember) {
		this.listMember = listMember;
	}
	public ArrayList<MemberVIP> getListLeader() {
		return listLeader;
	}
	public void setListLeader(ArrayList<MemberVIP> listLeader) {
		this.listLeader = listLeader;
	}
	public void show() {};
	public void addStudent() {};
	public void updateStudent() {};
	public void removeStudent() {};
	public void sortStudent() {};
	public void searchStudent() {};
	
}
