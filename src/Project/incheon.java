package Project;

public class incheon extends confirmedInfor{

	public incheon(String area) {
		super(area);
	}
	
	public int confirmedCases = 29097;
	public int deaths = 181;
			
	@Override
	public void information() {
		System.out.println("��õ�� �ڷγ�19 �߻�����");
		System.out.println("��õ�� �ڷγ�19 ���� Ȯ���� �� : " + confirmedCases
				+ "��");
		System.out.println("��õ�� �ڷγ�19�� ���� ����� �� : " + deaths
				 + "��");
	}
	
}
