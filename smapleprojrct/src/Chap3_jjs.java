import java.util.Scanner;

public class Chap3_jjs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ����
		int firstNum, secondNum;
		int sum;
		
		Scanner scan = new Scanner(System.in);
		

		//1.�� �� �Է��ϱ�
		System.out.print("ù��° ��: ");
		firstNum = scan.nextInt();
		System.out.print("�ι�° ��: ");
		secondNum = scan.nextInt();
		
		//2. �հ賻�� (C=A+B)
		sum= firstNum + secondNum;
		
		//3. �հ� ����ϱ�
		System.out.println("�հ�: "+sum);
		
		
	}

}
