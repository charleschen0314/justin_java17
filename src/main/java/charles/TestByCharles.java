package charles;

import java.math.BigDecimal;

public class TestByCharles {

	public static void main(String[] args) {
		BigDecimal four = new BigDecimal("4");
		BigDecimal three = new BigDecimal("3");
		BigDecimal two = new BigDecimal("2");
		
		System.out.println(four.compareTo(three));
		
		int count = 8;
		int m =8;
		int sum = 85;
		for(int i=0;i<count;i++) {
			System.out.println(i+"="+(sum *= m));
		}
		

	}

}
