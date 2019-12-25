package Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
	private String codeClass;
	private String nameClass;
	private ArrayList<Member> listMemberOfClass = new ArrayList<Member>(); // Danh sách học sinh trong lớp đó
	private ArrayList<MemberVIP> listLeader = new ArrayList<MemberVIP>(); // danh sách leader + support
	Scanner sc = new Scanner(System.in);

	public LopHoc() {
		super();
		this.codeClass = null;
		this.nameClass = null;
		this.listMemberOfClass.clear();
		this.listLeader.clear();
	}

	public LopHoc(String codeClass, String nameClass, ArrayList<Member> listMemberOfClass,
			ArrayList<MemberVIP> listLeader) {
		super();
		this.codeClass = codeClass;
		this.nameClass = nameClass;
		this.listMemberOfClass = listMemberOfClass;
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
		return listMemberOfClass;
	}

	public void setListMember(ArrayList<Member> listMember) {
		this.listMemberOfClass = listMember;
	}

	public ArrayList<MemberVIP> getListLeader() {
		return listLeader;
	}

	public void setListLeader(ArrayList<MemberVIP> listLeader) {
		this.listLeader = listLeader;
	}

	// Show thông tin của lớp học
	public void showInfoClass() {
		System.out.println("Leader của lớp " + this.nameClass + " : ");
		for (MemberVIP x : listLeader) {
			System.out.println(x.getFirstName() + " " + x.getLastName() + "\n");
		}
		System.out.println("Danh sách thành viên của lớp:");
		for (Member x : listMemberOfClass) {// Duyệt danh sách của lớp
			for (int i = 0; i < x.getListClass().size(); i++) {// Duyệt danh sách lớp mà sinh viên đang theo học phòng
																// trường hợp 1 sinh viên học 2 lớp
				if (x.getListClass().get(i).compareToIgnoreCase(this.nameClass) == 0) {//
					x.ShowInfor();
					System.out.println("Điểm: ");
					for (int j = 0; j < x.getListMark().size(); j++) {
						if (x.getListMark().get(j).getCodeClass() == this.codeClass) {
							System.out.print(x.getListMark().get(j).getMark() + " ");
						}
					}
				}
			}
		}
	}

	// Tìm vị trí của sinh viên trong lớp
	int IndexOfMember(ArrayList<Member> list, String MemberCode) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMemberCode().compareTo(MemberCode) == 0) {
				return i;
			}
		}
		return -1;
	}

	// Tìm vị trí của leader or sp trong danh sách list
	int IndexOfMemberVIP(ArrayList<MemberVIP> list, String MemberCode) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMemberCode().compareTo(MemberCode) == 0) {
				return i;
			}
		}
		return -1;
	}

	// Thêm 1 sinh viên vào lớp
	public void addStudent(Member A) {
		if (IndexOfMember(listMemberOfClass, A.getMemberCode()) == -1) {
			this.listMemberOfClass.add(A);
			A.getListClass().add(this.nameClass);// Thêm vào tên danh sách lớp mà sv đang theo học
			System.out.println("Thêm thành công!");
		} else {
			System.out.println("Sinh viên này đã có trong danh sách!");
		}
	}

	// Sửa thông tin của 1 sinh viên
	public void updateStudent(String code) {
		int index = IndexOfMember(listMemberOfClass, code);
		if (index == -1) {
			System.out.println("Người này không có trong danh sách!");
		} else {
			int choice;
			// Sửa từng thông tin
			do {
				System.out.println("-----------Sửa thông tin của các thành viên trong lớp học---------");
				System.out.println("0.Back");
				System.out.println("1.Sửa họ và tên");
				System.out.println("2.Sửa ngày sinh");
				System.out.println("3.Sửa địa chỉ");
				System.out.println("4.Sửa ngành học");
				System.out.println("5.Sửa khóa");
				System.out.println("6.Sửa số đt");
				System.out.println("7.Sửa chức vụ");
				System.out.println("8.Sửa số ngày vắng");
				System.out.println("Your choice: ");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					sc.nextLine();
					System.out.println("Nhập họ mới: ");
					listMemberOfClass.get(index).setFirstName(sc.nextLine());
					System.out.println("Nhập tên mới: ");
					listMemberOfClass.get(index).setLastName(sc.nextLine());
					System.out.println("Sửa họ tên thành công!");
					break;
				case 2:
					sc.nextLine();
					System.out.println("Nhập ngày sinh mới: ");
					listMemberOfClass.get(index).setBirth(sc.nextLine());
					System.out.println("Sửa ngày sinh thành công!");
					break;
				case 3:
					sc.nextLine();
					System.out.println("Nhập địa chỉ mới");
					listMemberOfClass.get(index).setAddress(sc.nextLine());
					break;
				case 4:
					sc.nextLine();
					System.out.println("Nhập ngành mới: ");
					listMemberOfClass.get(index).setMajor(sc.nextLine());
					System.out.println("Sửa ngành thành công!");
					break;
				case 5:
					System.out.println("Nhập khóa mới: ");
					listMemberOfClass.get(index).setK(sc.nextInt());
					System.out.println("Sửa khóa thành công!");
					break;
				case 6:
					sc.nextLine();
					System.out.println("Nhập số điện thoại mới: ");
					listMemberOfClass.get(index).setPhone(sc.nextLine());
					System.out.println("Sửa số điện thoại thành công!");
					break;
				case 7:
					sc.nextLine();
					System.out.println("Nhập ngành mới: ");
					listMemberOfClass.get(index).setMajor(sc.nextLine());
					System.out.println("Sửa ngành thành công!");
					break;
				case 8:
					sc.nextLine();
					System.out.println("Nhập số ngày vắng: ");
					listMemberOfClass.get(index).setDayAbsent(sc.nextInt());
					System.out.println("Sửa thành công!");
				default:
					System.out.println("Lựa chọn không hợp lệ!");
				}
			} while (choice != 0);
		}
	}

	// Xóa 1 sinh viên khỏi lớp bằng mã sv
	public void removeStudent(String code) {
		int index = IndexOfMember(listMemberOfClass, code);
		if (index == -1) {
			System.out.println("Không có sinh viên này trong danh sách");
		} else {
			listMemberOfClass.remove(index);
		}
	}

	// sắp xếp theo tên
	public void sortMemberOfClassByName() {
		for (int i = 0; i < listMemberOfClass.size(); i++) {
			for (int j = i + 1; j < listMemberOfClass.size(); j++) {
				if (listMemberOfClass.get(i).getLastName()
						.compareToIgnoreCase(listMemberOfClass.get(j).getLastName()) > 0) {
					Member tg = listMemberOfClass.get(i);
					listMemberOfClass.set(i, listMemberOfClass.get(j));
					listMemberOfClass.set(j, tg);
				}
			}
		}
	}

	// Sắp xếp theo khóa
	public void sortMemberOfClassByK() {
		for (int i = 0; i < listMemberOfClass.size(); i++) {
			for (int j = i + 1; j < listMemberOfClass.size(); j++) {
				if (listMemberOfClass.get(i).getK() > listMemberOfClass.get(j).getK()) {
					Member tg = listMemberOfClass.get(i);
					listMemberOfClass.set(i, listMemberOfClass.get(j));
					listMemberOfClass.set(j, tg);
				}
			}
		}
	}

	//Điểm trung bình của 1 thành viên
	public double AvgMarkOfMember(Member A) {
		int count = 0;
		double sum = 0;
		for (int i = 0; i < A.getListMark().size(); i++) {
			if (A.getListMark().get(i).getCodeClass() == this.codeClass) {
				sum += A.getListMark().get(i).getMark();
				count++;
			}
		}
		return sum / count;
	}

	//sắp xếp thành viên trong lớp theo điểm trung bình
	public void sortMemberOfClassByAvgMark() {
		for (int i = 0; i < listMemberOfClass.size(); i++) {
			for (int j = i + 1; j < listMemberOfClass.size(); j++) {
				if (AvgMarkOfMember(listMemberOfClass.get(i)) < AvgMarkOfMember(listMemberOfClass.get(j))) {
					Member tg = listMemberOfClass.get(i);
					listMemberOfClass.set(i, listMemberOfClass.get(j));
					listMemberOfClass.set(j, tg);
				}
			}
		}
	}

	// sắp xếp thành viên trong lớp theo yêu cầu
	public void sortStudent() {
		int choice;
		do {
			System.out.println("--------------Sắp xếp theo yêu cầu-------------");
			System.out.println("0.Quay lại");
			System.out.println("1.Theo tên");
			System.out.println("2.Khóa");
			System.out.println("3.Điểm trung bình");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				sortMemberOfClassByName();
				break;
			case 2:
				sortMemberOfClassByK();
				break;
			case 3:
				sortMemberOfClassByAvgMark();
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ");
			}
		} while (choice != 0);
	}

	//tìm kiếm thành viên trong lớp bằng mã 
	public void searchStudentByCode(String code) {
		int index = IndexOfMember(listMemberOfClass, code);
		if (index == -1) {
			System.out.println("Sinh viên này không có trong danh sách");
		} else {
			listMemberOfClass.get(index).ShowInfor();
		}
	}
	//tìm kiếm thành viên trong lớp bằng mã 
	public void searchStudentByName(String name) {
		for (int i = 0; i < listMemberOfClass.size(); i++) {
			if (listMemberOfClass.get(i).getLastName().compareToIgnoreCase(name) == 0) {
				listMemberOfClass.get(i).ShowInfor();
			}
		}
	}

}
