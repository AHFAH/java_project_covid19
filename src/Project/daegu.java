package Project;

public class daegu extends confirmedInfor{

	public daegu(String area) {
		super(area);
	}
	
	public int confirmedCases = 20397;
	public int deaths = 334;
			
	@Override
	public void information() {
		System.out.println("�뱸�� �ڷγ�19 �߻�����");
		System.out.println("�뱸�� �ڷγ�19 ���� Ȯ���� �� : " + confirmedCases
				+ "��");
		System.out.println("�뱸�� �ڷγ�19�� ���� ����� �� : " + deaths
				 + "��");
	}
	
}