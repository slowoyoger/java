
public class Gugudan {

	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; ++dan) {

			for (int i = 1; i <= 9; ++i) {
				// System.out.println(dan + '*' + i + '=' + dan * i);
				//System.out.printf("%d * %d = %d%n", dan, i, (dan * i)); //이수식을 못만들겠네 ㅠ
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
		}

	}
}
