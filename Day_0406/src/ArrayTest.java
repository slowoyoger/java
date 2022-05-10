
public class ArrayTest {
	//프로그램의 실행도중 배열의 크기를 수정 할 수 없다.
	public static void main(String[] args) { //args의 길이는 0!
		System.out.println("args의 길이" + args.length);
		//배열 = 동일한 데이터 타입으로 여러개 선언해서 사용할 때
	int a= 10;
	int[] ary = new int[10]; //10이면 0~9까지니까 방 10개다!! 4바이트*10개 = 40바이트
	//System.out.println(ary.length);
	
	int [] ary1 = new int[] {1,2,3,4,5};
	
	//선언과 동시에 초기화
	int[] ary11 = new int[] {1,2,3,4,5}; //방이 다섯개! 4바이트 * 5개 = 20바이트
	int[] ary2 = {11,22,33,44,55}; //방이 다섯개! 
	
	double[] dary1 = new double[5]; //8바이트 *  5 = 40바이트
	
	String name = "홍길동";
	String[] sary = new String[5];
	String[] sary2 = {"홍" + "임" + "최"+"김"+ "박"};
	
	
	
	/*
	 * ary[0] = 10; // 0은 필요없으니까 0을 10으로 한다 ary[1] = 20;
	 * 
	 * for(int i=0; i<ary.length; ++i) 
	 * length ary[i] = i*10; 
	 * for(int i=0; i<ary.length; ++i)
	 * 
	 * System.out.println(ary[i]);
	 * 
	 * 
	 * System.out.println(ary[0]); System.out.println(ary[9]);
	 * 
	 * 
	 * 
	 * int[] iary; iary = new int[5];
	 */
	
	
	}

}
