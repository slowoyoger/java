package net.scit.vo;

// ���� ����. /�����ε������� xx

public class FitnessVO {
	private String usrid;
	private String usrname;
	private double height;
	private double weight;
	private double BMI;
	private double result;

//�⺻������
	public FitnessVO() {
	}
//�����ε� ������
	// ����x

//���Ͱ��� //bmi����� ��! �ٽú���~!
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
