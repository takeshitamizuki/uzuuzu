package churimon;

//検証用クラス
class TestMonster {
	public static void main (String[] args) {
		Monster1 mon1 = new Monster1();
		System.out.println(mon1);
		mon1.levelUp(10);
		System.out.println(mon1);
	}
}