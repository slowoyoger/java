
public class ForTest1 {

	public static void main(String[] args) {
      
		for(int i=1;i<=10;i+=2) { //i가 12가 되면 for loop에서 벗어난다.
    	   System.out.print(i + " ");//System.out.println(i);
       }
       System.out.println ("");//지역변수 = 있는 지역 괄호 안에서만 사용 가능한 변수. 여기다가 i 넣으면 에러남 
	}

}

//0 2 4 6 8 10