class CalcCakeSum {
	public static void main(String[] args) {
		String cakeName = "";
		int count = 0;
		int totalAmount = 0;
		double paymentAmount = 0;
		double TAX = 1.08;
		int DISCOUNT_AMOUNT = 1000;
		double DISCOUNT = 0.80;
		for (int x = 0; x < args.length; x += 2) {
			cakeName = args[x];
			count = Integer.parseInt(args[x+1]);
			switch(cakeName) {
				case "ショートケーキ":
					totalAmount += 320 * count;
					break;
				case "モンブラン":
					totalAmount += 350 * count;
					break;
				case "チョコレートケーキ":
					totalAmount += 370 * count;
					break;
				case "いちごのタルト":
					totalAmount += 400 * count;
					break;
				case "チーズケーキ":
					totalAmount += 300 * count;
					break;
			}
		}
		paymentAmount = Math.floor(totalAmount * TAX);
		if (paymentAmount >= DISCOUNT_AMOUNT) {
			paymentAmount = Math.floor(paymentAmount * DISCOUNT);
		}
		System.out.println("合計金額は" + (int)paymentAmount + "円です。");
	}
}