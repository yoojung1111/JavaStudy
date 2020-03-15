package test4;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args)
	{
		String str1, str2, str3, str4, str5;

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열 하나를 입력하시오.(갯수)");
		str1 = sc.nextLine();
		System.out.println("문자열의 갯수는 " + str1.length());

		System.out.println("첫번째 문자열을 입력하시오.(문자열 합치기)");
		str2 = sc.nextLine();
		System.out.println("두번째 문자열을 입력하시오.(문자열 합치기)");
		str3 = sc.nextLine();

		System.out.println("문자열 합친 결과는 " + str2.concat(str3));

		System.out.println("문자열을 입력하시오.(소문자로 바꾸기)");
		str4 = sc.nextLine();
		System.out.println("문자열을 소문자로 바꾸면 " + str4.toLowerCase());

		System.out.println("문자열을 입력하시오.(대문자로 바꾸기)");
		str5 = sc.nextLine();
		System.out.println("문자열을 소문자로 바꾸면 " + str5.toUpperCase());		
	}
}