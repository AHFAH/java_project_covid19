package Project;

public class gyeonggi extends confirmedInfor{

	public gyeonggi(String area) {
		super(area);
	}
	
	public int confirmedCases = 154318;
	public int deaths = 1413;
			
	@Override
	public void information() {
		System.out.println("경기도의 코로나19 발생동향");
		System.out.println("경기도의 코로나19 누적 확진자 수 : " + confirmedCases
				+ "명");
		System.out.println("경기도의 코로나19로 인한 사망자 수 : " + deaths
				 + "명");
	}
	
}