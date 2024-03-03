package Project;

public class busan extends confirmedInfor{

	public busan(String area) {
		super(area);
	}
	
	public int confirmedCases = 18912;
	public int deaths = 201;
			
	@Override
	public void information() {
		System.out.println("부산의 코로나19 발생동향");
		System.out.println("부산의 코로나19 누적 확진자 수 : " + confirmedCases
				+ "명");
		System.out.println("부산의 코로나19로 인한 사망자 수 : " + deaths
				 + "명");
	}
}	