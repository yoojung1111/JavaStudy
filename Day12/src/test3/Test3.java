package test3;

import java.util.Scanner;

public class Test3 {

			public static int minValue(int[] arr)
		{
			int min = arr[0];
			for(int i : arr)
				if(min>i) min = i;
			return min;
		}
		public static int maxValue(int[] arr)
		{
			int max = arr[0];
			for(int i : arr)
				if(max<i) max = i;
			return max;
		}

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int[] arr = new int[5];

			System.out.println("���� " + arr.length + "���� �Է��ϼ���.");
			for(int i=0;i<arr.length;i++)
				arr[i] = sc.nextInt();

			System.out.println("���� ���� ���� " + minValue(arr));
			System.out.println("���� ū ���� " + maxValue(arr));
		}
	}

