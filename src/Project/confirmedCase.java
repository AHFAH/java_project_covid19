package Project;


public class confirmedCase {

	String region;
	public confirmedCase(String region) {
		this.region = region;
	}
	confirmedInfor confirmedCases = new confirmedInfor(region);
	
	public void run() {
		confirmedCases.information();
	}

	
}