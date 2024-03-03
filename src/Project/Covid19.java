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
		
		System.out.print("거리두기, 백신 정보를 알고 싶다면 1번, 코로나19 확진 현황을 알고 싶으면 2번을 선택하세요 : ");
		while(true) {
			try { // 예외처리
				select = sc1.nextInt();
				break;
			}
			catch(InputMismatchException ime) {
				sc1 = new Scanner(System.in);
				System.out.println("잘못된 입력입니다. 정수만 입력하세요.");
				System.out.print("거리두기, 백신 정보를 알고 싶다면 1번, 코로나19 확진 현황을 알고 싶으면 2번을 선택하세요 : ");
			}
		}
		
		
		if(select == 1) {
			sD.printDistance();
			vI.vaccin();
			vI.vaccin("접종률");
			thread2.start();
		}
		else if(select == 2) {
			System.out.print("서울, 경기, 인천, 대구, 부산 중 코로나19 확진자 현황을 알고 싶은 지역을 입력하세요 : ");
			region = sc.next();
			
			confirmedCase cC = new confirmedCase(region);
			thread.start();
			
			switch(region) {
				case "서울":
					cC.confirmedCases = new seoul(region);
					cC.run();
					break;
				case "경기":
					cC.confirmedCases = new gyeonggi(region);
					cC.run();
					break;
				case "인천":
					cC.confirmedCases = new incheon(region);
					cC.run();
					break;
				case "대구":
					cC.confirmedCases = new daegu(region);
					cC.run();
					break;				
				case "부산":
					cC.confirmedCases = new busan(region);
					cC.run();
					break;				
			}
		}
	}	
}
