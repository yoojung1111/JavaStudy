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
		System.out.println("숫자 야구 게임을 시작합니다.");
		
		while(true)
		{
			System.out.println("숫자를 입력하세요.");
			inputNum = sc.nextInt();
			result = baseball.attackNum(inputNum);
			if(result == true)
			{
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
	
}
