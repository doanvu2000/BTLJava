package Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementMemberHIT {
	public static ArrayList<Member> listMember = new ArrayList<Member>();
	public static ArrayList<MemberVIP> listMemberVIP = new ArrayList<MemberVIP>();
	public static ArrayList<LopHoc> listClass = new ArrayList<LopHoc>();
	public static void main(String[] args) {
		
	}
	public static void inputInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhập mã thành viên: ");
		String memberCode = sc.nextLine();
		System.out.print("\tNhập họ đệm: ");
		String firstName = sc.nextLine();
		System.out.print("\tNhập tên: ");
		String lastName = sc.nextLine();
		System.out.print("\tNhập ngày sinh: ");
		String birth = sc.nextLine();
		System.out.print("\tNhập địa chỉ: ");
		String address = sc.nextLine();
		System.out.print("\tNhập ngành học: ");
		String major = sc.nextLine();
		System.out.print("\tNhập khóa đang học: ");
		int K = sc.nextInt();
		System.out.print("\tNhập SĐT: ");
		sc.nextLine();
		String phone = sc.nextLine();
		System.out.print("\tNhập vị trí: ");
		String position = sc.nextLine();
		if(position.compareTo("Leader") == 0) {// là leader => add các lớp mà leader đó đứng lớp 
			System.out.println("\t======Nhập các lớp mà leader + "+firstName+" "+lastName+" đứng lớp =======");
			int size;
			do { // Nhập số lớp mà leader đứng lớp
				System.out.print("Nhập số lượng lớp "+firstName+" "+lastName+" leader:");
				size = sc.nextInt();
				if (size>listClass.size()) {
					System.out.println("Hiện tại HIT chỉ có "+listClass.size()+" lớp, mời bạn nhập số lớp <= "+listClass.size());
				}else {
					if(size <=0) System.out.println("Số lớp không thể <= 0,mời bạn nhập lại số lớp");
				}
			} while (size>listClass.size() || size <=0);
			
			System.out.println("Nhập lần lượt các mã lớp");
			int index = 0;
			ArrayList<String> listclass = new ArrayList<String>(); // danh sách các lớp mà leader đứng lớp
			String codeClass;
			for(int i=0;i<size;i++) {// lần lượt nhập các mã lớp đến khi thỏa mãn đủ size mã lớp thì add
				do {
					System.out.print("Lớp thứ "+(i+1)+" : ");
					codeClass = sc.nextLine();
					index = indexofClass(codeClass);
					if (index == -1) {
						System.out.println("Mã lớp này không có trong danh sách lớp của HIT, mời bạn nhập lại");
					}
				}while(index == -1);
				// sau khi có size mã lớp đã đúng: => add size mã lớp này vào listclass của leader
				listclass.add(codeClass);			
			}
			MemberVIP leader = new MemberVIP(memberCode, firstName, lastName, birth, address, major, K, phone, position, listclass);
			for (int i = 0; i < listclass.size(); i++) {//duyệt lại mảng listclass để add leader vào từng lớp trong listClass
				index = indexofClass(listclass.get(i)); // vị trí của mã lớp đấy trong mảng listClass
				//tiến hành add vào listClass
				listClass.get(index).getListLeader().add(leader);
			}
			listclass.clear();//tạo mới listclass để dùng lại
		}else if(position.compareTo("Support") == 0) {// là support => add các lớp mà support đó support
			System.out.println("\t======Nhập các lớp mà support + "+firstName+" "+lastName+" support =======");
			int size;
			do { // Nhập số lớp mà support đảm nhiệm
				System.out.print("Nhập số lượng lớp "+firstName+" "+lastName+" support:");
				size = sc.nextInt();
				if (size>listClass.size()) {
					System.out.println("Hiện tại HIT chỉ có "+listClass.size()+" lớp, mời bạn nhập số lớp <= "+listClass.size());
				}else {
					if(size <=0) System.out.println("Số lớp không thể <= 0,mời bạn nhập lại số lớp");
				}
			} while (size>listClass.size() || size <=0);
			
			System.out.println("Nhập lần lượt các mã lớp");
			int index = 0;
			ArrayList<String> listclass = new ArrayList<String>(); // danh sách các lớp mà support đảm nhiệm
			String codeClass;
			for(int i=0;i<size;i++) {// lần lượt nhập các mã lớp đến khi thỏa mãn đủ size mã lớp thì add
				do {
					System.out.print("Lớp thứ "+(i+1)+" : ");
					codeClass = sc.nextLine();
					index = indexofClass(codeClass);
					if (index == -1) {
						System.out.println("Mã lớp này không có trong danh sách lớp của HIT, mời bạn nhập lại");
					}
				}while(index == -1);
				// sau khi có size mã lớp đã đúng: => add size mã lớp này vào listclass của support
				listclass.add(codeClass);			
			}
			MemberVIP leader = new MemberVIP(memberCode, firstName, lastName, birth, address, major, K, phone, position, listclass);
			for (int i = 0; i < listclass.size(); i++) {//duyệt lại mảng listclass để add leader vào từng lớp trong listClass
				index = indexofClass(listclass.get(i)); // vị trí của mã lớp đấy trong mảng listClass
				//tiến hành add vào listClass
				listClass.get(index).getListLeader().add(leader);
			}
			listclass.clear();//tạo mới listclass để dùng lại
		}else {//Ban quản trị, ban chủ nhiệm => add vào ArrayList MemberVIP 
			listMemberVIP.add(new MemberVIP(memberCode, firstName, lastName, birth, address, major, K, phone, position, null));
		}
	}
	public static int indexofClass(String codeClass) {
		for(int i=0;i<listClass.size();i++) {
			if(codeClass.compareToIgnoreCase(listClass.get(i).getCodeClass())==0) {
				return i;
			}
		}
		return -1;
	}
}
