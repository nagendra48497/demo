package capgemini.com;

import java.time.LocalDate;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date d = new Date();
		Date d1 = new Date(9999999l);
		LocalDate d2 = LocalDate.now();
		System.out.println(d2.minusMonths(1));
		System.out.println(d);
		
	}
}
