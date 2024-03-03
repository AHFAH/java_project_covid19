package Project;

public class MyClass implements vaccinInfor, socialDistancing{ // 다중 인터페이스

	public void printDistance() {
		System.out.println("현재 거리두기 단계는 '단계적 일상회복 3단계'에 해당합니다.");
	}
	public void vaccin() { // 오버로딩
		System.out.println("진행 중인 백신 접종 : 3차 접종");
	}

	public void vaccin(String s) { // 오버로딩
		System.out.println(s + " : 29.8%");
	}
}
