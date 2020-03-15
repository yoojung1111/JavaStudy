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

			System.out.println("숫자 " + arr.length + "개를 입력하세요.");
			for(int i=0;i<arr.length;i++)
				arr[i] = sc.nextInt();

			System.out.println("가장 작은 수는 " + minValue(arr));
			System.out.println("가장 큰 수는 " + maxValue(arr));
		}
	}

