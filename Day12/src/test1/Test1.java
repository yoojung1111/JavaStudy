package test1;

import java.util.Scanner;

public class Test1 {

	public static int minNum(int[] arr)
	{
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i]) min=arr[i];
		}
		return min;
	}
	public static int maxNum(int[] arr)
	{
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i]) max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		
		int[] array=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 수를 입력하세요.");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("최소값: "+minNum(array));
		System.out.println("최대값: "+maxNum(array));
	}
}
