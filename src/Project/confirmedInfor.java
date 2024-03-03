package Project;

public class confirmedInfor {
	
	public String region; // 다섯개 지역 중 하나

	
	public confirmedInfor(String region) {
		this.region = region;
	}
	
	public void information() {
		System.out.println("***의 코로나19 발생동향");
		System.out.println("***의 코로나19 누적 확진자 수 : 0명");
		System.out.println("***의 코로나19로 인한 사망자 수 : 0명");
	}

}
