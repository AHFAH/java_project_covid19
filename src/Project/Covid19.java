package Project;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Covid19 {

	public static void main(String[] args) {
		socialDistancing sD = new MyClass();
		vaccinInfor vI = new MyClass();
		Thread thread = new ImageThread();
		Runnable img2 = new ImageThread2();
		Thread thread2 = new Thread(img2);

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int select;
		String region;
		
		System.out.print("�Ÿ��α�, ��� ������ �˰� �ʹٸ� 1��, �ڷγ�19 Ȯ�� ��Ȳ�� �˰� ������ 2���� �����ϼ��� : ");
		while(true) {
			try { // ����ó��
				select = sc1.nextInt();
				break;
			}
			catch(InputMismatchException ime) {
				sc1 = new Scanner(System.in);
				System.out.println("�߸��� �Է��Դϴ�. ������ �Է��ϼ���.");
				System.out.print("�Ÿ��α�, ��� ������ �˰� �ʹٸ� 1��, �ڷγ�19 Ȯ�� ��Ȳ�� �˰� ������ 2���� �����ϼ��� : ");
			}
		}
		
		
		if(select == 1) {
			sD.printDistance();
			vI.vaccin();
			vI.vaccin("������");
			thread2.start();
		}
		else if(select == 2) {
			System.out.print("����, ���, ��õ, �뱸, �λ� �� �ڷγ�19 Ȯ���� ��Ȳ�� �˰� ���� ������ �Է��ϼ��� : ");
			region = sc.next();
			
			confirmedCase cC = new confirmedCase(region);
			thread.start();
			
			switch(region) {
				case "����":
					cC.confirmedCases = new seoul(region);
					cC.run();
					break;
				case "���":
					cC.confirmedCases = new gyeonggi(region);
					cC.run();
					break;
				case "��õ":
					cC.confirmedCases = new incheon(region);
					cC.run();
					break;
				case "�뱸":
					cC.confirmedCases = new daegu(region);
					cC.run();
					break;				
				case "�λ�":
					cC.confirmedCases = new busan(region);
					cC.run();
					break;				
			}
		}
	}	
}
