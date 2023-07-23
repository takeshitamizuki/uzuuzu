class Jihan2 {
	public static void main(String[] args) {
		int[] money = {
				Integer.parseInt(args[0]),
				Integer.parseInt(args[1]),
				Integer.parseInt(args[2]),
				Integer.parseInt(args[3]),
				Integer.parseInt(args[4]),
				Integer.parseInt(args[5]),
				Integer.parseInt(args[6])
		};
		int buyAmount = Integer.parseInt(args[7]);
		int inputAmount = 0;
		int change = 0;
		for (int x = 0; x < money.length; x++) {
			if (money[x] == 1) {
				System.out.println("警告：1円玉は使えません");
			} else if (money[x] == 5) {
				System.out.println("警告：5円玉は使えません");
			} else if (money[x] == 777) {
				System.out.println("警告：777は硬貨として適切な値ではありません");
			} else {
				inputAmount += money[x];
			}
		}
		change = inputAmount - buyAmount;
		System.out.println(change + "円のお釣りです。ありがとうございました。");
	}
}