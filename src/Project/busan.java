package Project;

public class busan extends confirmedInfor{

	public busan(String area) {
		super(area);
	}
	
	public int confirmedCases = 18912;
	public int deaths = 201;
			
	@Override
	public void information() {
		System.out.println("�λ��� �ڷγ�19 �߻�����");
		System.out.println("�λ��� �ڷγ�19 ���� Ȯ���� �� : " + confirmedCases
				+ "��");
		System.out.println("�λ��� �ڷγ�19�� ���� ����� �� : " + deaths
				 + "��");
	}
}	