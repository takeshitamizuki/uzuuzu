import java.math.BigDecimal;
import java.math.RoundingMode;

/*-< 演習：Ex1_15_1 >---------------------------------
BigDecimalの扱いについてAPIドキュメントなどで調べながら
以下の結果が表示されるプログラムを作ってみましょう！
----------------------------------------------------*/

class Ex1_15_1{
	public static void main (String[] args) {
		
		//(1) 0.2 * 83 - 10.6
		BigDecimal decimal1 = new BigDecimal("0.2");
		BigDecimal decimal2 = new BigDecimal("83");
		BigDecimal decimal3 = new BigDecimal("-10.6");
		BigDecimal answer1 = (decimal1.multiply(decimal2)).add(decimal3);
		System.out.println(answer1);
		
		
		
		
		
		//(2) 0.2 * 83 - 10.6 / 3　※小数第4位までで表示（小数第5位以下は四捨五入）
		//<補足>
		// BigDecimalによる割り算は丸めの指定が必要です！
		// XXX ÷ YYYをして小数第2位で表示（小数第3位以下は切り捨て）
		// XXX.divide(YYY, 2, RoundingMode.DOWN);
		BigDecimal decimal4 = new BigDecimal("0.2");
		BigDecimal decimal5 = new BigDecimal("83");
		BigDecimal decimal6 = new BigDecimal("-10.6");
		BigDecimal decimal7 = new BigDecimal("3");
		BigDecimal answer2 = (decimal7.multiply(decimal5)).add(decimal6.divide(decimal7, 4, RoundingMode.HALF_UP));
		System.out.println(answer2);
	}
}
