package tw.brad.java;

public class PokerV2 {

	public static void main(String[] args) {
		// 起始時間
		// 洗牌
		boolean isRepeat;
		int rand;
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++) {
			
			do {
				rand = (int)(Math.random()*52);	// 0 - 51
				
				// 檢查機制
				isRepeat = false;
				for (int j=0; j<i; j++) {
					if (poker[j] == rand) {
						// 重複了
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);
			
			poker[i] = rand;
			System.out.println(poker[i]);
			
		}
		// 結束時間
		// 結束 - 起始 => 執行
		
		// 發牌
		// 攤牌 -> 理牌
	}

}
