package Manage;

public class Mark {
	private String codeClass;
	private double mark;
	
	public Mark() {
		super();
		this.codeClass = null;
		this.mark = -1; //không có điểm
	}
	public Mark(String codeClass, double mark) {
		super();
		this.codeClass = codeClass;
		this.mark = mark;
	}
	public String getCodeClass() {
		return codeClass;
	}
	public void setCodeClass(String codeClass) {
		this.codeClass = codeClass;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
}
