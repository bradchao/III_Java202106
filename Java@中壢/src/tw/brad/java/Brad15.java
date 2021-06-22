package tw.brad.java;

public class Brad15 {

	public static void main(String[] args) {
		int[] p = new int[7];	// p[0]=0, ... p[6]=0
		
		for (int i=0; i<10000000; i++) {
			int point = (int)(Math.random()*9)+1;
			if (point>=1 && point <= 9) {
				p[ point>6 ? point-3 : point ]++;
			}else{
				p[0]++;
			}
		}
		
		if (p[0] == 0) {
			String format = "%d點出現%d次";
			for (int i=1; i<p.length; i++) {
				System.out.println(String.format(format, i, p[i]));
			}
		}else {
			System.out.println("ERR!" + p[0]);
		}
		
		
	}

}
