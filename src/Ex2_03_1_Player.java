
public class Ex2_03_1_Player {
	private final String GU = "グー";
	private final String CHOKI = "チョキ";
	private final String PA = "パー";

	private String name;
	private String handStatus;

	public Ex2_03_1_Player(String nm) {
		this.name = nm;
	}

	public void makeHandStatus() {
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

	public String getName(){
		return this.name ;
	}

	public String getHandStatus(){
		return this.handStatus ;
	}
}
