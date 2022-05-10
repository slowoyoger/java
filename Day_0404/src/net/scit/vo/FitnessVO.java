package net.scit.vo;

// 세터 게터. /오버로딩생성자 xx

public class FitnessVO {
	private String usrid;
	private String usrname;
	private double height;
	private double weight;
	private double BMI;
	private double result;

//기본생성자
	public FitnessVO() {
	}
//오버로딩 생성자
	// 아직x

//세터게터 //bmi만드는 법! 다시보기~!
	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public String getUsrid(String usrid) {
		return usrid;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public String getUsrname(String usrname) {
		return usrname;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight(double height) {
		return height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight(double weight) {
		return weight;
	}
}
