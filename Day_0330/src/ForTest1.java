/*
 [연습_1] 반복문을 이용해서 알파벳 대문자'A~z'까지 코드값이 출력되도록 프로그래밍
 <실행결과>
 A : 65
 B : 66
 C : 67
 ...
 a 97
 b 98
 z : ?
 
 
 [연습_2 반복문을 이용해서 코드값 1~127까지 출력되도록 프로그래밍 하시오]
 한줄에 코드 5개씩 출력하고 줄바꿈.
 println.(i%5==0) 
 
 1 : x    2 : x 5 :x 
 6 : x
 
 
 */
/*public class ForTest1 {    연습문제 1 

	public static void main(String[] args) {
		for(char ch = 'A'; ch <= 'z'; ++ch)
			
			System.out.println(ch + " : " + (int)ch);   // 캐릭터를 정수값으로 보여주려면 앞에 int
	
	}

}
* [연습_2 반복문을 이용해서 코드값 1~127까지 출력되도록 프로그래밍 하시오]
 한줄에 코드 5개씩 출력하고 줄바꿈.
 println.(i%5==0) 
 
 1 : x    2 : x 5 :x 
 6 : x
 
*
*
*
*/

public class ForTest1 {

public static void main(String[] args) { ///// ★ 마침표, 포문 뒤에 괄호!!!!!
		for (int i = 1; i <= 127; ++i) {
			System.out.printf("%3d : %c", i, i); // %f(실수) %s(문자열) %d(10진정수) %c(문자)
			if (i % 5 == 0)
				System.out.println();
		}
	
}
}
