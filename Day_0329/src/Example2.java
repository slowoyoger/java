import java.util.Scanner;


public class Example2 {

	public static void main(String[] args) {
	int start, end, i=0;
		Scanner keyin = new Scanner(System.in);
		
		System.out.println("시작값을 입력 : ");
		start = keyin.nextInt();
		
		System.out.println("끝값을 입력 : ");
		end = keyin.nextInt();
		
		//조건을 판별
     
		if (start > end) {
			System.out.println("error) 시작값은 끝값보다 작거나 같도록 입력해주세요!!");
		    return; // 반환, 복귀하다. 복귀할거 없으니까 더이상 진행하지 말고 끝내라는 말 
		   
		}
		
	 while(start <= end)   // 시작값~ 끝값
		 System.out.println(start + " ");
		
			++start;
			 //System.out.println(start + " ");
		} 
	
}

	


