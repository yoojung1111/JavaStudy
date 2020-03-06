package baseBallGame;

import java.util.Scanner;

public class BaseballUI {

	private Baseball baseball;
	private Scanner sc;
	
	public BaseballUI(){}
	
	public void beginUI()
	{
		int inputNum = 0;
		boolean result;
		baseball = new Baseball();
		sc = new Scanner(System.in);
		System.out.println("���� �߱� ������ �����մϴ�.");
		
		while(true)
		{
			System.out.println("���ڸ� �Է��ϼ���.");
			inputNum = sc.nextInt();
			result = baseball.attackNum(inputNum);
			if(result == true)
			{
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
		sc.close();
	}
	
}
