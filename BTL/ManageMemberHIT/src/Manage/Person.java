package Manage;

public class Person {
	private String memberCode;
	private String firstName;
	private String lastName;
	private String birth;
	private String address;
	private String major;
	private int K;
	private String phone;
	private String position;
	
	public Person() {
		super();
		this.memberCode = null;
		this.firstName = null;
		this.lastName = null;
		this.birth = null;
		this.address = null;
		this.major = null;
		this.K = 0;
		this.phone = null;
		this.position = null;
	}
	
	public Person(String code, String firstName, String lastName, String birth, String address, String major, int k,
			String phone, String position) {
		super();
		this.memberCode = code;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birth = birth;
		this.address = address;
		this.major = major;
		K = k;
		this.phone = phone;
		this.position = position;
	}
	

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getK() {
		return K;
	}
	public void setK(int k) {
		K = k;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Person [memberCode=" + memberCode + ", firstName=" + firstName + ", lastName=" + lastName + ", birth="
				+ birth + ", address=" + address + ", major=" + major + ", K=" + K + ", phone=" + phone + ", position="
				+ position + "]";
	}
	
}
