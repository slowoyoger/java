
public class OperatorTest1 {
	
	public static void main(String[] args) {
			// 변수를 선언, 초기화
			// 181.5, 72.9
		
			double height = 181.5; // 단위 : cm
			double weight = 72.9; // 단위 : kg
			double bmi;
			int bird = 2;
			int hoarse = 4;
			int ta = 8;
			int animal;
		
			
			
			//cm 를 m로 환산하시오
			height = height * 0.01;
			bmi = weight / (height * height);
			
			// 독수리2개 3 말4개 2 타란튤라8개 4 총?
			animal = bird * 3 + hoarse * 2 + ta * 4;
			
			
			//출력
			System.out.println(height);
			System.out.println(weight);
			System.out.println(bmi);
			System.out.println(animal);
	}
}
