import java.util.Scanner;


public class Example2 {

	public static void main(String[] args) {
	int start, end, i=0;
		Scanner keyin = new Scanner(System.in);
		
		System.out.println("���۰��� �Է� : ");
		start = keyin.nextInt();
		
		System.out.println("������ �Է� : ");
		end = keyin.nextInt();
		
		//������ �Ǻ�
     
		if (start > end) {
			System.out.println("error) ���۰��� �������� �۰ų� ������ �Է����ּ���!!");
		    return; // ��ȯ, �����ϴ�. �����Ұ� �����ϱ� ���̻� �������� ���� ������� �� 
		   
		}
		
	 while(start <= end)   // ���۰�~ ����
		 System.out.println(start + " ");
		
			++start;
			 //System.out.println(start + " ");
		} 
	
}

	


