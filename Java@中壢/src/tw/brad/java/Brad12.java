package tw.brad.java;

public class Brad12 {

	public static void main(String[] args) {
		int row = 5;
		int col = 3;
		int start = 0;
		
		for (int k=0; k<row; k++) {
			for (int j=1; j<=9; j++) {
				for (int i=start; i< start + col; i++) {
					int newi = i + k * col;
					int r = newi * j;
					System.out.print(String.format("%d x %d = %d\t", newi, j, r));
				}
				System.out.println();
			}
			System.out.println("---");
		}
		
	}

}
