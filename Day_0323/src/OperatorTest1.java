
public class OperatorTest1 {
	
	public static void main(String[] args) {
			// ������ ����, �ʱ�ȭ
			// 181.5, 72.9
		
			double height = 181.5; // ���� : cm
			double weight = 72.9; // ���� : kg
			double bmi;
			int bird = 2;
			int hoarse = 4;
			int ta = 8;
			int animal;
		
			
			
			//cm �� m�� ȯ���Ͻÿ�
			height = height * 0.01;
			bmi = weight / (height * height);
			
			// ������2�� 3 ��4�� 2 Ÿ��ƫ��8�� 4 ��?
			animal = bird * 3 + hoarse * 2 + ta * 4;
			
			
			//���
			System.out.println(height);
			System.out.println(weight);
			System.out.println(bmi);
			System.out.println(animal);
	}
}
