

public class FitnessVO {
	private String usrid;
	private String usrname;
	private double height;
	private double weight;
	private double bmi;
	private String result;

//기본생성자
	public FitnessVO() {
	}
//오버로딩 생성자 (모든거를 다 받지는 않는 예시)
	public FitnessVO(String usrid, String usrname, 
					 double height, double weight) {
		this.usrid=usrid; //여기서 초기화 됨
		this.usrname = usrname;
		this.height = height;
		this.weight = weight;
		
		calcBmi(); //이거는 여기서 외부값 받는대로 계산이 딱딱 나오니까 여기서
	
	}// 여기 안에서만 돌라고 프라이빗
	private void calcBmi() {   //기능이 있는 메소드. 브이오 안에 기능이 있는 메소드도 온다.
		double tmp; //m로 환산한 임시변수
		tmp = this.height * 0.01;
		this.bmi = this.weight / (tmp*tmp);
		
		setResult();
	}

	public double getBmi() {
		return this.bmi;
	}
	//bmi에 대한 결과값으로 외부에서 이 데이터 하나만 접근할 필요가 없다.! 임의적으로 바꿀 수 없도록 프라이빗.
	private void setResult() {
		if(bmi >= 35) {
			result = "고도비만";
		} else if(bmi >= 30) {
			result = "중도비만";
		} else if (bmi >= 25) {
			result = "경도비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		} else {
			result = "저체중";
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
	//setter는 값을 수정하는 역할!
	public void setHeight(double height) {//외부에서, setting 하겠다. 키를! 입력값이 바뀐다!
		 								  //==>키랑 몸무게에 따라 bmi가 바뀌니까 계산식 호출!
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
	// 멤버의 정보를 화면에 출력하는 메소드
	public void output() {
		System.out.println(usrid + " : " + usrname + "님, " + 
						   height+"cm" + weight+ "kg, BMI=" + bmi + ", 결과=" + result);
		
	}

	
	
}
