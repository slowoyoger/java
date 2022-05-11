
public class FitnessMain {

	public static void main(String[] args) {
		int count = 0; // 지금 회원인지 몇명인지 알수있다

		FitnessVO[] member = new FitnessVO[5]; // 방 5개 관리하는 방을 만든다!

		/*
		 * 이게 먼저였는데 간단하게 7라인으로 바꿈 FitnessVO vo = new FitnessVO("1", "홍길동", 175, 66);
		 * 피트니스브이오를 만들어서 vo에서 참조하고 있는거. 객체만들기. 한명이 들어오려고 준비중이다. member[0] = vo; //한명이
		 * 가입했다
		 */

		
		
		// 가입시키기
		// --처음이 회원수가 0이니까 count도 0! 0부터 시작!!
		
		member[count++] = new FitnessVO("1", "홍길동", 175, 66);
		// 홍길동들을 먼저 대입하고 count++ 나중에 1을 플러스 한다. count++는 연산자 순위 맨 마직이니까! 대입을 먼저한다.

		member[count] = new FitnessVO("2", "김민주", 167, 34);
		++count;

		member[count] = new FitnessVO("3", "전우치", 199, 65);
		++count;

		member[count] = new FitnessVO("4", "임꺽정", 174, 23);
		++count;

		member[count] = new FitnessVO("5", "저팔계", 122, 45);
		++count;

		/*
		 * System.out.println("회원수 : " + count); //가입한 사람 수 //member.length = 가입가능한 회원수
		 * // member[0].output();// member[0]번 자리의 출력을 알고싶다. //
		 * System.out.println(member[0].getHeight()); //0번 자리 사람의 키만 보고싶다.
		 */

		// 모든 회원 전체 출력
		for (int i = 0; i < count; ++i) { // 가입한 회원 카운트까지 세겠다! length로 하면 오류
			member[i].output();
		}

		// 회원 검색
		String id = "5"; // 내가 찾으려는 사람 key
		int no = -1; // 3번방의 위치값을 찾는다. 절대 존재하지 않는 방번호인 음수로 초기화

		for (int i = 0; i < count; ++i) { // i= 위치값 찾으려고 도는 놈
			if (member[i].getUsrid().equals(id)) { // 같으면
				no = i; // 찾은 방 번호 no
				break; // 찾으면 끝난다
			}

		}

		System.out.println("\n ## 검색한 회원정보");
		if (no == -1) // -1이랑 같으면 회원이 없는거
			System.out.println("회원이 없습니다");
		else // -1이 아니고 같은게 있으면 그게 찾은거니까
			member[no].output();
		
	System.out.println();
	
		// 회원 탈퇴
		id = "2"; // 탈퇴할 회원 id
		no = -1;

		for (int i = 0; i < count; ++i) { // 선형구조는 항상 검색부터 한다!! 어느 위치에 있나부터
			if (member[i].getUsrid().equals(id)) { // 위치값을 알아 냄
				no = i;
				break;
			}
		}
		// 회원정보 앞으로 당기기

		for (int i = no; i < count - 1; ++i) { // count-1= 전체회원수-1 //이 줄이 어려웠음
			member[i] = member[i + 1];
		}

		count--;
		//member[count] = null; 

		for (int i = 0; i < count; ++i) {
			if (member[i] != null) {
				member[i].output();
			}
		}

		// 수정
		id = "2";
		no = -1;
		double height = 181;
		double weight = 72;

		// 데이터 찾기
		for (int i = 0; i < count; ++i) {
			if (member[i].getUsrid().equals(id)) {
				no = i;
				break;
			}
		}
		// 수정
		if (no != -1) {
			member[no].setHeight(height); //member[no]방에다가 새 값을 넣는다
			member[no].setWeight(weight);

		}
		System.out.println("\n ## 수정된 회원정보");
		for (int i = 0; i < count; ++i) {
			member[i].output();
		}

	}
}
