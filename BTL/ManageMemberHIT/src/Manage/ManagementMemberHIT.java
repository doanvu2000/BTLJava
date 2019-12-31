package Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementMemberHIT {
	public static ArrayList<Member> listMember = new ArrayList<Member>();
	public static ArrayList<MemberVIP> listMemberVIP = new ArrayList<MemberVIP>();
	public static ArrayList<LopHoc> listClass = new ArrayList<LopHoc>();
	public static ArrayList<Mark> listMark = new ArrayList<Mark>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//add a Member
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> class01 = new ArrayList<String>();
		class01.add("Java");
		class01.add("C++");
		class01.add("Web");
		class01.add("PHP");
		listMark.add(new Mark("01", 8));
		listMark.add(new Mark("02", 7));
		listMark.add(new Mark("03", 8.5));
		listMark.add(new Mark("04", 9));
		Member Doan = new Member("222", "Vũ Văn", "Doan1", "20/12/2000", "Nam Định", "CNTT", 13, "0987328540", 
				"Normal", class01, listMark, 0);
		Member Doan2 = new Member("222", "Vũ Văn", "Doan2", "20/12/2000", "Nam Định", "CNTT", 13, "0987328540", 
				"Normal", class01, listMark, 0);
//		listMemberVIP.add(new MemberVIP("111", "Nguyễn Đức", "Linh1", "01/01/1999", "Gia Lâm", "KHMT", 12, "0123456789",
//				"Ban chủ nhiệm",temp));
		MemberVIP Son = new MemberVIP("113", "Trần Hải", "Sơn", "01/01/1999", "Gia Lâm", "KHMT", 12, "0123456789",
				"Leader",class01);
		listMemberVIP.add(Son);
		//add a class
		ArrayList<Member> listMemberOfClass =new ArrayList<Member>();
		ArrayList<MemberVIP> listLeader =new ArrayList<MemberVIP>();
		ArrayList<Member> m_Java = new ArrayList<Member>();
		ArrayList<MemberVIP> l_Java = new ArrayList<MemberVIP>();
		m_Java.add(Doan);
		m_Java.add(Doan2);
		l_Java.add(Son);
		LopHoc Java = new LopHoc("01", "Java", m_Java, listLeader);
		listClass.add(Java);
		
//		LopHoc C = new LopHoc();
//		ArrayList<Member> m_C = new ArrayList<Member>();
//		ArrayList<MemberVIP> l_C = new ArrayList<MemberVIP>();
//		LopHoc Web = new LopHoc();
//		ArrayList<Member> m_Web = new ArrayList<Member>();
//		ArrayList<MemberVIP> l_Web = new ArrayList<MemberVIP>();
//		LopHoc PHP = new LopHoc();
//		ArrayList<Member> m_PHP = new ArrayList<Member>();
//		ArrayList<MemberVIP> l_PHP = new ArrayList<MemberVIP>();
		
		listMemberVIP.add(new MemberVIP("112", "Nguyễn Đức", "Linh2", "01/01/1999", "Gia Lâm", "KHMT", 12, "0123456789",
				"Ban chủ nhiệm", temp));
//		listMemberVIP.add(new MemberVIP("117", "Nguyễn Đức", "Linh3", "01/01/1999", "Gia Lâm", "KHMT", 12, "0123456789",
//				"Ban quản trị", temp));
//		listMemberVIP.add(new MemberVIP("115", "Nguyễn Đức", "Linh4", "01/01/1999", "Gia Lâm", "KHMT", 12, "0123456789",
//				"Ban chủ nhiệm", temp));
		
		
		
//		listClass.add(new LopHoc("02", "C++", listMemberOfClass, listLeader));
//		listMemberVIP.add(new MemberVIP("114", "Thunder", "Sword", "01/01/1999", "Gia Lâm", "KHMT", 12, "0123456789",
//				"Support", class01));
		listMember.add(Doan);
		listMember.add(Doan2);
		System.out.println();
		System.out.println(
				"******************************CHƯƠNG TRÌNH QUẢN LÝ THÀNH VIÊN CLB HIT******************************");
		System.out.println();
		menu();
	}

	public static void menu() {
		int chose;
		do {
			System.out.println("\t\t**********************************************************");
			System.out.println("\t\t=====================MENU CHƯƠNG TRÌNH====================");
			System.out.println("\t\t**\t\t0.Thoát chương trình\t\t\t**");
			System.out.println("\t\t**\t\t1.Quản lý thành viên HIT\t\t**");
			System.out.println("\t\t**\t\t2.Quản lý các lớp học của HIT\t\t**");
			System.out.println("\t\t**********************************************************");
			System.out.println();
			System.out.print("\tNhập lựa chọn của bạn: ");
			chose = sc.nextInt();
			switch (chose) {
			case 0:
				System.out.println("\tChương trình đã thoát!");
				return;
			case 1: {
				menu1();
				break;
			}
			case 2: {
				menu2();
				break;
			}
			default:
				System.out.println("Không hợp lệ, chương trình thoát !");
				return;
			}
		} while (true);
	}

	public static void menu1() {// quản lý thành viên
		System.out.println("==========Chương trình quản lý thành viên HIT===========");
		System.out.println("\t\t0.Back");
		System.out.println("\t\t1.Hiển thị danh sách thành viên");
		System.out.println("\t\t2.Thêm thành viên");
		System.out.println("\t\t3.Sửa thông tin thành viên");
		System.out.println("\t\t4.Xóa thành viên");
		System.out.println("\t\t5.Tìm kiếm thành viên");
		int chose;
		do {
			System.out.print("\tNhập lựa chọn của bạn: ");
			chose = sc.nextInt();
			switch (chose) {
			case 0:
				System.out.println("\tChương trình đã quay lại");
				return;
			case 1: {// Chưa xong
				System.out.println("\t======Hiển thị danh sách thành viên======");
				showListMember();
				break;
			}
			case 2: {// Xong
				System.out.println("\t\t2.Thêm thành viên");
				addMember();
				break;
			}
			case 3: {// Chưa xong - cho cập nhật từng thông tin
				System.out.println("\t\t3.Sửa thông tin thành viên");
				System.out.print("Nhập mã thành viên cần sửa: ");
				String code = sc.nextLine();
				updateMember(code);
				break;
			}
			case 4: {// Xong
				System.out.println("\t\t4.Xóa thành viên");
				System.out.print("Nhập mã thành viên cần xóa: ");
				String code = sc.nextLine();
				removeMember(code);
				break;
			}
			case 5: {// Chưa xong- cho search theo code, position
				System.out.println("\t\t5.Tìm kiếm thành viên");
				System.out.print("Nhập mã thành viên cần tìm kiếm: ");
				String code = sc.nextLine();
				searchMember(code);
				break;
			}
			default:
				System.out.println("Không hợp lệ, chương trình thoát !");
				return;
			}
		} while (true);
	}

	public static void menu2() {// quản lý lớp học
		System.out.println("==============Chương trình quản lý các lớp học của HIT=============");
		System.out.println("\t\t0.Back");
		System.out.println("\t\t1.Hiển thị danh sách lớp học");
		System.out.println("\t\t2.Thêm lớp học");
		System.out.println("\t\t3.Sửa thông tin lớp học");
		System.out.println("\t\t4.Xóa lớp học");
		System.out.println("\t\t5.Tìm kiếm lớp học");
		int chose;
		do {
			System.out.print("\tNhập lựa chọn của bạn: ");
			chose = sc.nextInt();
			switch (chose) {
			case 0:
				System.out.println("\tChương trình đã quay lại");
				return;
			case 1: {// Chưa xong
				System.out.println("\t======Hiển thị danh sách lớp học======");
				showListClass();
				break;
			}
			case 2: {// Chưa xong
				System.out.println("\t\t2.Thêm lớp học");
				addClass();
				break;
			}
			case 3: {// Chưa xong - cho cập nhật từng thông tin
				System.out.println("\t\t3.Sửa thông tin lớp học");
				System.out.print("Nhập mã lớp cần sửa: ");
				String code = sc.nextLine();
				updateClass(code);
				break;
			}
			case 4: {// Chưa xong
				System.out.println("\t\t4.Xóa lớp học");
				System.out.print("Nhập mã lớp cần xóa: ");
				String code = sc.nextLine();
				removeClass(code);
				break;
			}
			case 5: {// Chưa xong- cho search theo code, tên, leader
				System.out.println("\t\t5.Tìm kiếm lớp học");
				System.out.print("Nhập mã lớp cần tìm kiếm: ");
				String code = sc.nextLine();
				searchClass(code);
				break;
			}
			default:
				System.out.println("Không hợp lệ, chương trình thoát !");
				return;
			}
		} while (true);
	}

	// list member
	public static void addMember() {// Thêm 1 thành viên vào CLB

		System.out.print("\tNhập mã thành viên: ");
		sc.nextLine();
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
		String position = null;
		do {
			System.out.print("\tNhập chức vụ(trong CLB): ");
			position = sc.nextLine();
			if (position.compareToIgnoreCase("Leader") != 0 && position.compareToIgnoreCase("Support") != 0
					&& position.compareToIgnoreCase("Normal") != 0
					&& position.compareToIgnoreCase("Ban quản trị") != 0
					&& position.compareToIgnoreCase("Ban chủ nhiệm") != 0)
				System.out.println(
						"Phải nhập 1 trong những vị trí sau: Leader, Support, Normal, Ban quản trị, Ban chủ nhiệm !");
		} while (position.compareToIgnoreCase("Leader") != 0 && position.compareToIgnoreCase("Support") != 0
				&& position.compareToIgnoreCase("Normal") != 0 && position.compareToIgnoreCase("Ban quản trị") != 0
				&& position.compareToIgnoreCase("Ban chủ nhiệm") != 0);
		// postiton = Leader, Support, Normal, Ban quản trị, Ban chủ nhiệm

		if (position.compareTo("Leader") == 0) {// là leader => add các lớp mà leader đó đứng lớp
			/* * Thêm leader*/
			System.out.println(
					"\t======Nhập các lớp mà leader " + firstName + " " + lastName + " đứng lớp =======");
			int size;
			do { // Nhập số lớp mà leader đứng lớp
				System.out.print("Nhập số lượng lớp " + firstName + " " + lastName + " leader:");
				size = sc.nextInt();
				if (size > listClass.size()) {
					System.out.println("Hiện tại HIT chỉ có " + listClass.size()
							+ " lớp, mời bạn nhập số lớp <= " + listClass.size());
				} else {
					if (size <= 0)
						System.out.println("Số lớp không thể <= 0,mời bạn nhập lại số lớp");
				}
			} while (size > listClass.size() || size <= 0);

			System.out.println("Nhập lần lượt các mã lớp");
			int index = 0;
			ArrayList<String> listclass = new ArrayList<String>(); // danh sách các lớp mà leader đứng lớp
			ArrayList<String> listClassName = new ArrayList<String>();
			String codeClass;
			sc.nextLine();
			for (int i = 0; i < size; i++) {// lần lượt nhập các mã lớp đến khi thỏa mãn đủ size mã lớp thì
											// add
				do {
					System.out.print("Lớp thứ " + (i + 1) + " : ");
					codeClass = sc.nextLine();
					index = indexofClass(codeClass);
					if (index == -1) {
						System.out.println(
								"Mã lớp này không có trong danh sách lớp của HIT, mời bạn nhập lại");
					}
				} while (index == -1);
				// sau khi có size mã lớp đã đúng: => add size mã lớp này vào listclass
				// của leader
				listclass.add(codeClass);
				listClassName.add(getClassNameByCode(codeClass));
			}
			MemberVIP leader = new MemberVIP(memberCode, firstName, lastName, birth, address, major, K, phone, position,
					listClassName);
			listMemberVIP.add(leader);
			for (int i = 0; i < listclass.size(); i++) {// duyệt lại mảng listclass để add leader vào từng lớp
														// trong listClass
				index = indexofClass(listclass.get(i)); // vị trí của mã lớp đấy trong mảng listClass
				// tiến hành add vào listClass
				listClass.get(index).getListLeader().add(leader);
			}
			listclass.clear();// tạo mới listclass để dùng lại
			listClassName.clear();//tạo mới listClassName để dùng lại
			System.out.println("Thêm thành công leader");
			/* * END Thêm leader*/
		} else if (position.compareTo("Support") == 0) {// là support => add các lớp mà support đó support
			System.out.println(
					"\t======Nhập các lớp mà support " + firstName + " " + lastName + " support =======");
			int size;
			do { // Nhập số lớp mà leader đứng lớp
				System.out.print("Nhập số lượng lớp " + firstName + " " + lastName + " support:");
				size = sc.nextInt();
				if (size > listClass.size()) {
					System.out.println("Hiện tại HIT chỉ có " + listClass.size()
							+ " lớp, mời bạn nhập số lớp <= " + listClass.size());
				} else {
					if (size <= 0)
						System.out.println("Số lớp không thể <= 0,mời bạn nhập lại số lớp");
				}
			} while (size > listClass.size() || size <= 0);

			System.out.println("Nhập lần lượt các mã lớp");
			int index = 0;
			ArrayList<String> listclass = new ArrayList<String>(); // danh sách các lớp mà leader đứng lớp
			ArrayList<String> listClassName = new ArrayList<String>();
			String codeClass;
			sc.nextLine();
			for (int i = 0; i < size; i++) {// lần lượt nhập các mã lớp đến khi thỏa mãn đủ size mã lớp thì
											// add
				do {
					System.out.print("Lớp thứ " + (i + 1) + " : ");
					codeClass = sc.nextLine();
					index = indexofClass(codeClass);
					if (index == -1) {
						System.out.println(
								"Mã lớp này không có trong danh sách lớp của HIT, mời bạn nhập lại");
					}
				} while (index == -1);
				// sau khi có size mã lớp đã đúng: => add size mã lớp này vào listclass
				// của leader
				listclass.add(codeClass);
				listClassName.add(getClassNameByCode(codeClass));
			}
			MemberVIP leader = new MemberVIP(memberCode, firstName, lastName, birth, address, major, K, phone, position,
					listClassName);
			listMemberVIP.add(leader);
			for (int i = 0; i < listclass.size(); i++) {// duyệt lại mảng listclass để add leader vào từng lớp
														// trong listClass
				index = indexofClass(listclass.get(i)); // vị trí của mã lớp đấy trong mảng listClass
				// tiến hành add vào listClass
				listClass.get(index).getListLeader().add(leader);
			}
			listclass.clear();// tạo mới listclass để dùng lại
			listClassName.clear();//tạo mới listClassName để dùng lại
			System.out.println("Thêm thành công support");
			/* * END Thêm support*/
		} else if (position.compareTo("Normal") == 0) {// là thành viên bình thường => nhập vào danh sách lớp
														// mà thành viên này học
			int count;
			do {
				System.out.print("\tNhập số lượng lớp của CLB mà thành viên này đang tham gia: ");
				count = sc.nextInt();
				if (count < 0) {
					System.out.println("Số lớp >=0 và <= " + listClass.size());
				} else if (count > listClass.size()) {
					System.out.println("Hiện tại HIT chỉ có " + listClass.size()
							+ " lớp, mời bạn nhập số lớp <= " + listClass.size());
				}
			} while (count < 0 || count > listClass.size());
			// count: số lớp mà thành viên tham gia
			int index = 0;
			ArrayList<String> listclass = new ArrayList<String>(); // danh sách các lớp mà thành viên học
			ArrayList<String> listClassName = new ArrayList<String>();
			String codeClass = null;
			ArrayList<Mark> listmark = new ArrayList<Mark>();
			int dayAbsent = 0;
			for (int i = 0; i < count; i++) {// lần lượt nhập các mã lớp đến khi thỏa mãn đủ size mã lớp
												// thì add
				do {
					System.out.print("Lớp thứ " + (i + 1) + " : ");
					sc.nextLine();
					codeClass = sc.nextLine();
					index = indexofClass(codeClass);
					if (index == -1) {
						System.out.println(
								"Mã lớp này không có trong danh sách lớp của HIT, mời bạn nhập lại");
					}
				} while (index == -1);
				// sau khi có mã lớp đã đúng: => add mã lớp này vào listclass
				listclass.add(codeClass);
				listClassName.add(getClassNameByCode(codeClass));
				// và nhập thêm số ngày nghỉ ở lớp này
//				do {
//					System.out.print("\tNhập số ngày vắng: ");
//					dayAbsent = sc.nextInt();
//					if (dayAbsent < 0)
//						System.out.println("Số ngày nghỉ phải >=0, mời nhập lại!");
//				} while (dayAbsent < 0);
				// nhập điểm của môn học này
				double mark;
				do {
					System.out.print("\tNhập điểm môn " + getClassNameByCode(codeClass) + " : ");
					mark = sc.nextDouble();
					if (mark < 0 || mark > 10)
						System.out.println("Điểm phải nằm trong khoảng từ 0 đến 10");
				} while (mark < 0 || mark > 10);
				listmark.add(new Mark(codeClass, mark));
			}
			// Duyệt lại listclass để add các thành viên này vào trong listClass
			Member normal = new Member(codeClass, firstName, lastName, birth, address, major, K, phone, position,
					listClassName, listmark, dayAbsent);
			for (int i = 0; i < listclass.size(); i++) {
				index = indexofClass(listclass.get(i));
				// add member vào trong lớp mà thành viên này học ở trong listClass
				listClass.get(index).getListMember().add(normal);
			}
			listclass.clear();
			listClassName.clear();
			listMember.add(normal);
			System.out.println("Thêm thành công thành viên vào danh sách CLB");
		} else if (position.compareTo("Ban quản trị") == 0 || position.compareTo("Ban chủ nhiệm") == 0) {
			// Ban quản trị, Ban chủ nhiệm => add vào ArrayList MemberVIP
			listMemberVIP.add(
					new MemberVIP(memberCode, firstName, lastName, birth, address, major, K, phone, position, null));
		}
	}

	public static void removeMember(String memberCode) {// Xóa 1 thành viên trong CLB
		int index1 = indexofListMember(memberCode);
		int index2 = indexofListMemberVIP(memberCode);
		if (index1 == -1 && index2 == -1) {
			System.out.println("\tMã thành viên này không có trong HIT, thoát hàm removeMember()");
			return;
		}
		if (index1 >= 0)
			listMember.remove(index1);
		else if (index2 >= 0)
			listMemberVIP.remove(index2);
		System.out.println("===========Bạn đã xóa thành công===========");
	}

	public static void showListMember() {// Hiển thị danh sách thành viên
		System.out.println(">>>>>>>>>>>>>>Danh sách thành viên theo chức vụ<<<<<<<<<<<<<<");
		showListMemberByPosition();
		System.out.println();
		System.out.println("\tMenu hiển thị");
		System.out.println("\t0.Back");
		System.out.println("\t1.Hiển thị danh sách theo từng lớp");
		System.out.println("\t2.Hiển thị danh sách theo khóa");
		int chose;
		do {
			System.out.print("\t\tNhập lựa chọn: ");
			chose = sc.nextInt();
			switch (chose) {
				case 0:System.out.println("\tThoát hiển thị!");return;
				
			}
		} while (true);
	}
	public static void showListMemberByPosition() {
		sortMember();//Sắp xếp
		System.out.println("\tBan chủ nhiệm: ");
		for (int i = 0; i < listMemberVIP.size(); i++) {
			String x = listMemberVIP.get(i).getPosition();
			if (x.compareToIgnoreCase("Ban chủ nhiệm")==0) {
				listMemberVIP.get(i).ShowInfor();
			}
		}
		System.out.println("\tBan quản trị: ");
		for (int i = 0; i < listMemberVIP.size(); i++) {
			String x = listMemberVIP.get(i).getPosition();
			if (x.compareToIgnoreCase("Ban quản trị")==0) {
				listMemberVIP.get(i).ShowInfor();
			}
		}
		System.out.println("\tLeader,support: ");
		for (int i = 0; i < listMemberVIP.size(); i++) {
			String x = listMemberVIP.get(i).getPosition();
			if (x.compareToIgnoreCase("Leader")==0) {
				listMemberVIP.get(i).ShowInfor();
			}
		}
		for (int i = 0; i < listMemberVIP.size(); i++) {
			String x = listMemberVIP.get(i).getPosition();
			if (x.compareToIgnoreCase("Support")==0) {
				listMemberVIP.get(i).ShowInfor();
			}
		}
		System.out.println("\tThành viên thường: ");
		for (int i = 0; i < listMember.size(); i++) {
			String x = listMember.get(i).getPosition();
			if (x.compareToIgnoreCase("Normal")==0) {
				listMember.get(i).ShowInfor();
			}
		}
	}
	public static void updateMember(String memberCode) {// Cập nhật danh sách thành viên
	}

	public static void searchMember(String memberCode) {// tìm kiếm thành viên
	}

	// Sắp xếp danh sách thành viên theo alphab
	public static void sortMember() {
		for (int i = 0; i < listMember.size(); i++) {
			for (int j = i + 1; j < listMember.size(); j++) {
				if (listMember.get(i).getLastName().compareToIgnoreCase(listMember.get(j).getLastName()) > 0) {
					Member tg = listMember.get(i);
					listMember.set(i, listMember.get(j));
					listMember.set(j, tg);
				}
			}
		}
		for (int i = 0; i < listMemberVIP.size(); i++) {
			for (int j = i + 1; j < listMemberVIP.size(); j++) {
				if (listMemberVIP.get(i).getLastName().compareToIgnoreCase(listMemberVIP.get(j).getLastName()) > 0) {
					MemberVIP tg = listMemberVIP.get(i);
					listMemberVIP.set(i, listMemberVIP.get(j));
					listMemberVIP.set(j, tg);
				}
			}
		}
	}

	// end sort
	public static int indexofClass(String codeClass) {// vị trí của mã lớp trong danh sách lớp
		for (int i = 0; i < listClass.size(); i++) {
			if (codeClass.compareToIgnoreCase(listClass.get(i).getCodeClass()) == 0) {
				return i;
			}
		}
		return -1;

	}

	public static int indexofListMember(String memberCode) {// vị trí của mã lớp trong danh sách thành viên normal
		for (int i = 0; i < listMember.size(); i++) {
			if (memberCode.compareTo(listMember.get(i).getMemberCode()) == 0)
				return i;
		}
		return -1;
	}

	public static int indexofListMemberVIP(String memberCode) {// vị trí của mã lớp trong danh sách thành viên VIP
		for (int i = 0; i < listMemberVIP.size(); i++) {
			if (memberCode.compareTo(listMemberVIP.get(i).getMemberCode()) == 0)
				return i;
		}
		return -1;
	}

	public static String getClassNameByCode(String codeClass) {// Lấy tên lớp học bằng mã lơp
		int index = -1;
		for (int i = 0; i < listClass.size(); i++) {
			if (codeClass.compareToIgnoreCase(listClass.get(i).getCodeClass()) == 0) {
				index = i;
			}
		}
		if (index == -1)
			return null;
		return listClass.get(index).getNameClass();
	}
	// end member

	// ****** CLASS *****
	public static void showListClass() {
	}

	public static void addClass() {
	}

	public static void updateClass(String memberCode) {
	}

	public static void removeClass(String memberCode) {
	}

	public static void searchClass(String memberCode) {
	}
	// ****** end CLASS ******
}
