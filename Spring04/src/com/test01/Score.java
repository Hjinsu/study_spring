package com.test01;


public class Score {
	private int no;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String name;
	private String grade;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = kor + eng + math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = (double)sum / 3.0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {

		switch ((int)avg / 10) {
		case 10:
		case 9:
			this.grade = "A";
			break;
		case 8:
			this.grade = "B";
			break;
		case 7:
			this.grade = "C";
			break;
		case 6:
			this.grade = "D";
			break;
		default:
			this.grade = "F";
			break;
		}

	}
	@Override
	public String toString() {
		return "Score [no=" + no + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg
				+ ", name=" + name + ", grade=" + grade + "]";
	}
}
