/*
 [����_1] �ݺ����� �̿��ؼ� ���ĺ� �빮��'A~z'���� �ڵ尪�� ��µǵ��� ���α׷���
 <������>
 A : 65
 B : 66
 C : 67
 ...
 a 97
 b 98
 z : ?
 
 
 [����_2 �ݺ����� �̿��ؼ� �ڵ尪 1~127���� ��µǵ��� ���α׷��� �Ͻÿ�]
 ���ٿ� �ڵ� 5���� ����ϰ� �ٹٲ�.
 println.(i%5==0) 
 
 1 : x    2 : x 5 :x 
 6 : x
 
 
 */
/*public class ForTest1 {    �������� 1 

	public static void main(String[] args) {
		for(char ch = 'A'; ch <= 'z'; ++ch)
			
			System.out.println(ch + " : " + (int)ch);   // ĳ���͸� ���������� �����ַ��� �տ� int
	
	}

}
* [����_2 �ݺ����� �̿��ؼ� �ڵ尪 1~127���� ��µǵ��� ���α׷��� �Ͻÿ�]
 ���ٿ� �ڵ� 5���� ����ϰ� �ٹٲ�.
 println.(i%5==0) 
 
 1 : x    2 : x 5 :x 
 6 : x
 
*
*
*
*/

public class ForTest1 {

public static void main(String[] args) { ///// �� ��ħǥ, ���� �ڿ� ��ȣ!!!!!
		for (int i = 1; i <= 127; ++i) {
			System.out.printf("%3d : %c", i, i); // %f(�Ǽ�) %s(���ڿ�) %d(10������) %c(����)
			if (i % 5 == 0)
				System.out.println();
		}
	
}
}
