
public class Ex2_03_1_Janken {
	public static void main(String[] args) {
		String player1 = args[0];
		String player2 = args[1];
		String referee = args[2];

		Ex2_03_1_Player p1 = new Ex2_03_1_Player(player1);
		Ex2_03_1_Player p2 = new Ex2_03_1_Player(player2);
		Ex2_03_1_Referee ref = new Ex2_03_1_Referee(referee);

		ref.startJanken();
		p1.makeHandStatus();
		p2.makeHandStatus();

		ref.check(p1);
		ref.check(p2);

		ref.judgeJanken(p1,p2);
	}
}
