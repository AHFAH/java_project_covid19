package Project;

public class seoul extends confirmedInfor{

	public seoul(String area) {
		super(area);
	}
	Integer obj1 = new Integer(182558); // Wrapper ��ü �ڽ�
	Integer obj2 = new Integer(1340);

	int confirmedCases = obj1.intValue(); // Wrapper ��ü ��ڽ�
	int deaths = obj2.intValue();
	@Override
	public void information() {
		System.out.println("������ �ڷγ�19 �߻�����");
		System.out.println("������ �ڷγ�19 ���� Ȯ���� �� : " + confirmedCases
				+ "��");
		System.out.println("������ �ڷγ�19�� ���� ����� �� : " + deaths
				 + "��");
	}
	
}
