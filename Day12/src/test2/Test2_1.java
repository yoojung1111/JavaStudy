package test2;

public class Test2_1 {

	public static void addOneDArr(int[] arr, int add)
	{
		for(int i=0;i<arr.length; i++)
			arr[i] += add;
	}

	public static void addTwoDArr(int[][] arr, int add)
	{
		for(int i=0;i<arr.length; i++)
		{
			addOneDArr(arr[i], add);
		}
	}
	
	public static void main(String[] args) {

		int[][] array = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		addTwoDArr(array, 2);
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
