/* 1~100���� �ݺ��ϴ� ���α׷�
 1 + 2 + 3 + 4 ... 100
 <������>
 ������ : 5050
 */
public class ForTest2 {

	public static void main(String[] args) {
		int total = 0, i;
		
		for(i=1;i<=100;++i){
			
			 //  System.out.println(i + " ");
			  total += i;// for, while, if���� ������ �� �ϳ��ۿ� ���� �� �߰�ȣ {}�����ִ�.
		}
		System.out.println("1~100 ������ : " + total);	   
		
	}

}
