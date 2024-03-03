package Project;

public class seoul extends confirmedInfor{

	public seoul(String area) {
		super(area);
	}
	Integer obj1 = new Integer(182558); // Wrapper 객체 박싱
	Integer obj2 = new Integer(1340);

	int confirmedCases = obj1.intValue(); // Wrapper 객체 언박싱
	int deaths = obj2.intValue();
	@Override
	public void information() {
		System.out.println("서울의 코로나19 발생동향");
		System.out.println("서울의 코로나19 누적 확진자 수 : " + confirmedCases
				+ "명");
		System.out.println("서울의 코로나19로 인한 사망자 수 : " + deaths
				 + "명");
	}
	
}
