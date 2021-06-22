package tw.brad.java;

import java.util.Arrays;

public class PokerV3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int nums = 52;
		int[] poker = new int[nums];
		for (int i=0; i<poker.length; i++) poker[i]=i;
		
		for (int i=nums-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			
			// poker[rand] <=> poker[i];
			int temp = poker[i];
			poker[i] = poker[rand];
			poker[rand] = temp;
		}
		
//		for (int v : poker) {
//			System.out.println(v);
//		}
//		System.out.println("---");
//		System.out.println(System.currentTimeMillis()-start);
//		System.out.println("---");

		// ---------------------------------
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		String[] suits = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 "
							,"8 ","9 ","10","J ","Q ","K "};
		for (int[] player : players) {
			Arrays.sort(player);
			for (int card : player) {
				System.out.print(suits[card/13] + values[card%13] + " ");
			}
			System.out.println();
		}
		
		
	}

}
