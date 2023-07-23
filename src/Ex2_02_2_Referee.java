
public class Ex2_02_2_Referee {
	final String GU = "グー";
	final String CHOKI = "チョキ";
	final String PA = "パー";

	String name;

	Ex2_02_2_Referee(String nm) {
		this.name = nm;
	}

	void startJanken() {
		messageReferee("じゃんけん・・・ぽん！！！！！");
	}

	void check(Ex2_02_2_Player p) {
		if((p.handStatus).equals(GU)) {
			messageReferee(p.name + "さんの手はグーでした！");
		} else if((p.handStatus).equals(CHOKI)) {
			messageReferee(p.name + "さんの手はチョキでした！");
		} else if((p.handStatus).equals(PA)) {
			messageReferee(p.name + "さんの手はパーでした！");
		} else {
			System.out.println("[ERROR]ジャンケンの判定が不正です。");
		}
	}

	void judgeJanken(Ex2_02_2_Player p1, Ex2_02_2_Player p2) {
		messageReferee("結果は・・・");
		if((p1.handStatus).equals(p2.handStatus)) {
			messageReferee("あいこ！勝負つかず！");
		} else if((p1.handStatus.equals(GU) && p2.handStatus.equals(CHOKI))
		           || (p1.handStatus.equals(CHOKI) && p2.handStatus.equals(PA))
		           || (p1.handStatus.equals(PA) && p2.handStatus.equals(GU))
				)
		{
			messageReferee(p1.name + "さんの勝利！");
		} else if(     (p2.handStatus.equals(GU) && p1.handStatus.equals(CHOKI))
		           || (p2.handStatus.equals(CHOKI) && p1.handStatus.equals(PA))
		           || (p2.handStatus.equals(PA) && p1.handStatus.equals(GU))
				)
		{
			messageReferee(p2.name + "さんの勝利！");
		} else {
			System.out.println("[ERROR]ジャンケンの判定が不正です。");
		}
	}

	void messageReferee(String msg) {
		System.out.println( this.name + "「" + msg + "」");
	}
}
