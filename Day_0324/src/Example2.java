/*

//12345초는 몇 초일까요?? 
 * 몫 = 분, 나머지 = 초
 * 12345초는  분 초입니다.
*/

public class Example2 {

	public static void main(String[] args) {
		int second = 12345;
		int minute = second / 60;

		int remainsecond = second % 60;

		int hour = minute / 60;
		int remainminute = minute % 60;

		System.out.println(second + "초는" + hour + "시간" + remainminute + "분" + remainsecond + "초입니다");

	}

}
