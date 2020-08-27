import java.math.BigInteger;

public class SelfPowers {

	public static void main(String[] args) {
		
		BigInteger sum = BigInteger.ZERO;
		BigInteger max = BigInteger.valueOf(1000);
		for (BigInteger i = BigInteger.ONE; i.intValue() <= max.intValue(); i = i.add(BigInteger.ONE)) {
			
			BigInteger product = i.pow(i.intValue());
			sum = sum.add(product);
			
			System.out.println(i.toString() + "^" + i.toString() + " = " + product.toString());
		}
		
		System.out.println(sum.toString());
	}
	

}
