package tw.brad.java;

public class Brad17 {
	
	public static void main(String[] args) {
		
		int[][] a;
		
		a = new int[4][];
		a[0] = new int[3];
		a[1] = new int[1];
		a[2] = new int[2];
		a[3] = new int[1];
		
		for (int i=0;i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---");
		for (int[] v : a) {
			for (int vv : v) {
				System.out.print(vv + " ");
			}
			System.out.println();
		}
		
	}
	
}
