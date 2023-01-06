import java.math.*;

public class Decimals{
	public static void main(String[] args) {
		double x = 1.05;
		double y = 2.55;
		double z = x+y;
		System.out.println(z);
		// The output will be 3.5999999999999996
		// We can use BigDecimal for these type of calculations

		BigDecimal d1 = new BigDecimal(Double.toString(x));
		BigDecimal d2 = new BigDecimal(Double.toString(y));

		double sum = d1.add(d2).doubleValue();
		System.out.println(sum);
		// The output will be 3.6

	}
}