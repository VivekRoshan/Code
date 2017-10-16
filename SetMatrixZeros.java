package bloomberg.practice;

public class SetMatrixZeros {

	public int[][] setZeroes(int[][] arr)
	{
		boolean rowFlag = false;
		boolean colFlag = false;
		for (int i = 0; i < arr.length; i++) {
				if(arr[i][0] == 0)
				{
					colFlag = true;
					break;
				}
					
		}
		for (int i = 0; i < arr[0].length; i++) {
			if(arr[0][i] == 0)
			{
				rowFlag = true;
				break;
			}
	}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				if(arr[i][j] == 0)
				{
					arr[i][0] = 0;
					arr[0][j] = 0;
 				}
			}
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				if(arr[i][0] == 0 || arr[0][j] == 0)
					arr[i][j] = 0;
			}
		}
		
		if(rowFlag)
		{
			for (int i = 0; i < arr[0].length; i++) {
				arr[0][i] = 0;
			}
		}
		if(colFlag)
		{
			for (int j = 0; j < arr.length; j++) {
				arr[j][0] = 0;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetMatrixZeros matrixZeros = new SetMatrixZeros();
		int [][] aarr =matrixZeros.setZeroes(new int[][]{{0}});
		for (int i = 0; i < aarr.length; i++) {
			for (int j = 0; j < aarr[0].length; j++) {
				System.out.println(aarr[i][j]);
			}
		}
	}

}
