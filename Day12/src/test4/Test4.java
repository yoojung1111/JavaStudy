package test4;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args)
	{
		String str1, str2, str3, str4, str5;

		Scanner sc = new Scanner(System.in);

		System.out.println("���ڿ� �ϳ��� �Է��Ͻÿ�.(����)");
		str1 = sc.nextLine();
		System.out.println("���ڿ��� ������ " + str1.length());

		System.out.println("ù��° ���ڿ��� �Է��Ͻÿ�.(���ڿ� ��ġ��)");
		str2 = sc.nextLine();
		System.out.println("�ι�° ���ڿ��� �Է��Ͻÿ�.(���ڿ� ��ġ��)");
		str3 = sc.nextLine();

		System.out.println("���ڿ� ��ģ ����� " + str2.concat(str3));

		System.out.println("���ڿ��� �Է��Ͻÿ�.(�ҹ��ڷ� �ٲٱ�)");
		str4 = sc.nextLine();
		System.out.println("���ڿ��� �ҹ��ڷ� �ٲٸ� " + str4.toLowerCase());

		System.out.println("���ڿ��� �Է��Ͻÿ�.(�빮�ڷ� �ٲٱ�)");
		str5 = sc.nextLine();
		System.out.println("���ڿ��� �ҹ��ڷ� �ٲٸ� " + str5.toUpperCase());		
	}
}