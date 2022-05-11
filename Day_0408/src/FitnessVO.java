

public class FitnessVO {
	private String usrid;
	private String usrname;
	private double height;
	private double weight;
	private double bmi;
	private String result;

//�⺻������
	public FitnessVO() {
	}
//�����ε� ������ (���Ÿ� �� ������ �ʴ� ����)
	public FitnessVO(String usrid, String usrname, 
					 double height, double weight) {
		this.usrid=usrid; //���⼭ �ʱ�ȭ ��
		this.usrname = usrname;
		this.height = height;
		this.weight = weight;
		
		calcBmi(); //�̰Ŵ� ���⼭ �ܺΰ� �޴´�� ����� ���� �����ϱ� ���⼭
	
	}// ���� �ȿ����� ����� �����̺�
	private void calcBmi() {   //����� �ִ� �޼ҵ�. ���̿� �ȿ� ����� �ִ� �޼ҵ嵵 �´�.
		double tmp; //m�� ȯ���� �ӽú���
		tmp = this.height * 0.01;
		this.bmi = this.weight / (tmp*tmp);
		
		setResult();
	}

	public double getBmi() {
		return this.bmi;
	}
	//bmi�� ���� ��������� �ܺο��� �� ������ �ϳ��� ������ �ʿ䰡 ����.! ���������� �ٲ� �� ������ �����̺�.
	private void setResult() {
		if(bmi >= 35) {
			result = "����";
		} else if(bmi >= 30) {
			result = "�ߵ���";
		} else if (bmi >= 25) {
			result = "�浵��";
		} else if (bmi >= 23) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";
		} else {
			result = "��ü��";
		}
		
	}
	
	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public String getUsrid() {
		return this.usrid;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public String getUsrname() {
		return this.usrname;
	}
	//setter�� ���� �����ϴ� ����!
	public void setHeight(double height) {//�ܺο���, setting �ϰڴ�. Ű��! �Է°��� �ٲ��!
		 								  //==>Ű�� �����Կ� ���� bmi�� �ٲ�ϱ� ���� ȣ��!
		this.height = height;
		calcBmi();
	}

	public double getHeight() {
		return this.height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
		calcBmi();
	}

	public double getWeight() {
		return this.weight;
	}
	// ����� ������ ȭ�鿡 ����ϴ� �޼ҵ�
	public void output() {
		System.out.println(usrid + " : " + usrname + "��, " + 
						   height+"cm" + weight+ "kg, BMI=" + bmi + ", ���=" + result);
		
	}

	
	
}
