package baseBallGame;

import java.util.Random;

public class Baseball {
	
	private final int MAX = 3;
	private int rndNum, sCnt, bCnt, startNum, endNum;
	private int[] rndArr = new int[MAX];
	private int[] inputArr = new int[MAX];
	private Random random = new Random();
	
	public Baseball()
	{
		setRange();
		makeNum();
	}
	
	public void setRange()
	{
		startNum=1;
		for(int i=1;i<MAX;i++)
			startNum*=10;
		endNum=startNum*10-1;
	}
	public boolean rangeChk(int num)
	{
		if(num<startNum || num>endNum)
		{
			return false;
		}
		return true;
	}
	public void makeNum()
	{
		while(true)
		{
			rndNum=random.nextInt(endNum-startNum+1)+startNum;
			makeArr(rndNum,rndArr);
			if(chkNum(rndArr))
			{
				return;
			}
		}
	}
	public void makeArr(int rndNum, int[] rndArr)
	{
		int divisor=1;
		for(int i=1;i<MAX;i++)
			divisor*=10;
		for(int i=0;i<MAX;i++)
		{
			rndArr[i]=rndNum/divisor;
			rndNum %= divisor;
			divisor/=10;
		}
	}
	public boolean chkNum(int[] rndArr)
	{
		for(int i=0;i<rndArr.length-1;i++)
			for(int j=i+1;j<rndArr.length;j++)
			{
				if(rndArr[i]==rndArr[j])
				{
					return false;
				}
			}
		return true;
	}
	public boolean attackNum(int num)
	{
		boolean result;
		result = rangeChk(num);
		if(result==false)
		{
			printCurrentState(result);
		}
		else
		{
			makeArr(num, inputArr);
			result = chkNum(inputArr);
			if(result==false)
			{
				printCurrentState(result);
			}
			else
			{
				chkGame(rndArr, inputArr);
				printCurrentState(result);
			}
		}
		if(sCnt==MAX) return true;
		else return false;
	}
	public void chkGame(int[] rndArr, int[] inputArr)
	{
		int sCnt=0, bCnt=0;
		for(int i=0;i<rndArr.length;i++)
		{
			for(int j=0;j<inputArr.length;j++)
			{
				if(rndArr[i]==inputArr[j])
				{
					if(i==j)sCnt++;
					else bCnt++;
				}
			}
		}
		this.bCnt=bCnt;
		this.sCnt=sCnt;
	}
	public void printCurrentState(boolean result)
	{
		if(result)
		{
			if(sCnt==MAX) System.out.println("Home Run!!");
			else if(sCnt==0 && bCnt==0) System.out.println("Out!");
			else System.out.println(sCnt +"Strike " + bCnt + "Ball");
		}
		else System.out.println("유효한 숫자가 아닙니다.");
	}
	
}