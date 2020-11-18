
public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      int[][] matrix   =
	      {
	         { 20, 15, 6, 19, 18 }, { 4, 46, 24, 17, 18 },
	         { 12, 50, 23, 16, 31 }
	      };
	      
	      
	         for (int row = 0; row < matrix.length; row++)
	         {
	            for (int col = 0; col < matrix[row].length; col++)
	            {
	               System.out.printf("%7d", matrix[row][col]);
	            }

	            System.out.println();
	         }
	      
	      

	}

}
