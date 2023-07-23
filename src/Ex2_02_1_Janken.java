

public class Ex2_02_1_Janken {
	public static void main( String[] args ) {
		final String GU = "グー";
		final String CHOKI = "チョキ";
		final String PA = "パー";

		String player1 = args[0];
		String player2 = args[1];
		
		Ex2_02_1_Player p1 = new Ex2_02_1_Player(player1);
		Ex2_02_1_Player p2 = new Ex2_02_1_Player(player2);
		
		System.out.println( "じゃんけん・・・ぽん！！！！！" );
		
		p1.makeHandStatus();
		p2.makeHandStatus();
		
		System.out.println( p1.name + "さんの手 : " + p1.handStatus );
		System.out.println( p2.name + "さんの手 : " + p2.handStatus );
		
		System.out.println( "結果は・・・" );
		
		if ( (p1.handStatus).equals( p2.handStatus ) ){
			System.out.println("あいこ！勝負つかず！");	
		} else if (     (p1.handStatus.equals(GU) && p2.handStatus.equals(CHOKI))
		           || (p1.handStatus.equals(CHOKI) && p2.handStatus.equals(PA))
		           || (p1.handStatus.equals(PA) && p2.handStatus.equals(GU))  
				) 
		{	
			System.out.println(p1.name + "さんの勝利！");
		} else if (     (p2.handStatus.equals(GU) && p1.handStatus.equals(CHOKI))
		           || (p2.handStatus.equals(CHOKI) && p1.handStatus.equals(PA))
		           || (p2.handStatus.equals(PA) && p1.handStatus.equals(GU))
				) {

			System.out.println(p2.name + "さんの勝利！");

		} else {
			System.out.println("[ERROR]ジャンケンの判定が不正です。");
		}
	}
}
