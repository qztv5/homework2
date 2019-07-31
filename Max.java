package homework2;

public class Max {

	public static void main(String args[]) 
	{
		int[][] maxArray = new int[5][5];
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5;j++)
			{
				maxArray[i][j] = (int)(100*Math.random());
				System.out.println(maxArray[i][j]);
			}
		}
		
		int max = maxArray[0][0];
		int pos1 = 0;
		int pos2 = 0;
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5;j++)
			{
				if(max < maxArray[i][j])
				{
					max = maxArray[i][j];
					pos1 = i;
					pos2 = j;
				}
			}
		}
		
		System.out.println("The max number is: "+max + " at position [" +pos1 + "][" + pos2 + "]");
	}
	
}
