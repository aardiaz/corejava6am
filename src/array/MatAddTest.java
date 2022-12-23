package array;

public class MatAddTest {
	
	public static void main(String[] args) {
		
		int mat1[][] = { {40,70},{99,88} };
		int mat2[][] = { {10,77}, {30,80} };
		
		int mat3[][] = new int[2][2];
		
		//addition
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
			
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(mat3[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
	}

}
