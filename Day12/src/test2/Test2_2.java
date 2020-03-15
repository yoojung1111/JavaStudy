package test2;

public class Test2_2 {

	public static int[][] changeArr(int[][] array)
	{
		int tmp[]=array[2];
		for(int i=1;i>=0;i--)
		{
			array[i+1]=array[i];
		}
		array[0]=tmp;
		return array;
	}
	
	public static void main(String[] args) {

		int[][] array = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		changeArr(array);
		
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