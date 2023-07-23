
public class Ex2_03_1_Referee {
	private final String GU = "グー";
	private final String CHOKI = "チョキ";
	private final String PA = "パー";

	private String name;

	Ex2_03_1_Referee(String nm) {
		this.name = nm;
	}

	public void startJanken() {
		messageReferee("じゃんけん・・・ぽん！！！！！");
	}

	public void check(Ex2_03_1_Player p) {
		if((p.getHandStatus()).equals(GU)) {
			messageReferee(p.getName() + "さんの手はグーでした！");
		} else if((p.getHandStatus()).equals(CHOKI)) {
			messageReferee(p.getName() + "さんの手はチョキでした！");
		} else if((p.getHandStatus()).equals(PA)) {
			messageReferee(p.getName() + "さんの手はパーでした！");
		} else {
			System.out.println("[ERROR]ジャンケンの判定が不正です。");
		}
	}

	public void judgeJanken(Ex2_03_1_Player p1, Ex2_03_1_Player p2) {
		messageReferee("結果は・・・");
		if((p1.getHandStatus().equals(p2.getHandStatus()))) {
			messageReferee("あいこ！勝負つかず！");
		} else if((p1.getHandStatus().equals(GU) && p2.getHandStatus().equals(CHOKI))
		           || (p1.getHandStatus().equals(CHOKI) && p2.getHandStatus().equals(PA))
		           || (p1.getHandStatus().equals(PA) && p2.getHandStatus().equals(GU))
				)
		{
			messageReferee(p1.getName() + "さんの勝利！");
		} else if(     (p2.getHandStatus().equals(GU) && p1.getHandStatus().equals(CHOKI))
		           || (p2.getHandStatus().equals(CHOKI) && p1.getHandStatus().equals(PA))
		           || (p2.getHandStatus().equals(PA) && p1.getHandStatus().equals(GU))
				)
		{
			messageReferee(p2.getName() + "さんの勝利！");
		} else {
			System.out.println("[ERROR]ジャンケンの判定が不正です。");
		}
	}

	public void messageReferee(String msg) {
		System.out.println( this.name + "「" + msg + "」");
	}

	public String getName() {
		return this.name ;
	}
}
