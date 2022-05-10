package example;

public class BubbleSortTest {
	public static void main(String[] args) {
		int[] ary = { 31, 5, 9, 12, 16, 22, 1, 14, 6, 18 };
	

		System.out.println("## 정렬 전");
		print(ary);
		
		sort(ary);
		
		
		System.out.println("## 정렬 후");
		print(ary);
	}

	public static void print(int[] ary) {
		for (int i = 0; i < ary.length; ++i) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();

	}

	public static void sort(int[] ary) {
		int temp;

		
		
		
		for (int i = 0; i < ary.length - 1; ++i) { // 전체 제어.마지막까지 돌아라.1부터 10까지 회차
			for (int j = 0; j < ary.length - (i + 1); ++j) { 
				//끝에값이 제일 커지게 정렬되니까 그거 빼고 9까지, 8까지,7까지 
				if (ary[j] > ary[j + 1]) { //왼쪽 값이 더 크다면 오른쪽 값이랑 바꿔준다. 인접숫자 비교
					temp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = temp;
				}
			}

		}
	}
}
