import java.util.Scanner;

public class Chap3_jjs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언
		int firstNum, secondNum;
		int sum;
		
		Scanner scan = new Scanner(System.in);
		

		//1.두 수 입력하기
		System.out.print("첫번째 수: ");
		firstNum = scan.nextInt();
		System.out.print("두번째 수: ");
		secondNum = scan.nextInt();
		
		//2. 합계내기 (C=A+B)
		sum= firstNum + secondNum;
		
		//3. 합계 출력하기
		System.out.println("합계: "+sum);
		
		
	}

}
