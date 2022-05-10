/* 1~100까지 반복하는 프로그램
 1 + 2 + 3 + 4 ... 100
 <실행결과>
 누적합 : 5050
 */
public class ForTest2 {

	public static void main(String[] args) {
		int total = 0, i;
		
		for(i=1;i<=100;++i){
			
			 //  System.out.println(i + " ");
			  total += i;// for, while, if문은 조건이 딱 하나밖에 없을 때 중괄호 {}뺄수있다.
		}
		System.out.println("1~100 누적합 : " + total);	   
		
	}

}
