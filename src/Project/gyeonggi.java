package Project;

public class gyeonggi extends confirmedInfor{

	public gyeonggi(String area) {
		super(area);
	}
	
	public int confirmedCases = 154318;
	public int deaths = 1413;
			
	@Override
	public void information() {
		System.out.println("��⵵�� �ڷγ�19 �߻�����");
		System.out.println("��⵵�� �ڷγ�19 ���� Ȯ���� �� : " + confirmedCases
				+ "��");
		System.out.println("��⵵�� �ڷγ�19�� ���� ����� �� : " + deaths
				 + "��");
	}
	
}