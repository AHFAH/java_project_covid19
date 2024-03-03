package Project;

public class daegu extends confirmedInfor{

	public daegu(String area) {
		super(area);
	}
	
	public int confirmedCases = 20397;
	public int deaths = 334;
			
	@Override
	public void information() {
		System.out.println("대구의 코로나19 발생동향");
		System.out.println("대구의 코로나19 누적 확진자 수 : " + confirmedCases
				+ "명");
		System.out.println("대구의 코로나19로 인한 사망자 수 : " + deaths
				 + "명");
	}
	
}