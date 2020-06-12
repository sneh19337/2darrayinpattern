import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		solution.print2DArray(input);
	}
}
public class solution {
	public static void print2DArray(int input[][]) {
		// Write your code here
        int k=input.length;
        for (int i=0;i<input.length;i++ )
        {
            for(int o=k-1;o>=0;o--)
            {
                for(int j=0;j<input[i].length;j++)
                {
                    System.out.print(input[i][j]+" ");
                }
                System.out.println();
            }
          k--;
        }
    }
}
