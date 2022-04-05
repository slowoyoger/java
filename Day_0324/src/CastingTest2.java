
public class CastingTest2 {

	public static void main(String[] args) {
		char ch = 'A';
		ch = (char)(ch + 1); 
		
		System.out.println(ch);
		System.out.println(ch+1); //연산하면 무조건 정수형, 
		                          //문자열로 바꾸려면 무조건 캐스팅해야함
		
	}

}
