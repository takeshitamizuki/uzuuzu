
class Ex2_02_2_Player {
	final String GU = "グー";
	final String CHOKI = "チョキ";
	final String PA = "パー";

	String name;
	String handStatus;

	Ex2_02_2_Player(String nm) {
		this.name = nm;
	}

	void makeHandStatus() {
		int randomHand = 1 + (int)(Math.random() * 3.0);
		switch(randomHand){
			case 1:
				this.handStatus = GU;
				break;
			
			case 2:
				this.handStatus = CHOKI;
				break;
			
			case 3:
				this.handStatus = PA;
				break;
		}
	}
}
