package capgemini.com;

import java.util.Scanner;

public class Work {

	public int fact(int m) {
		
		int f=1;
		for(int i =1;i<=m;i++) {
			f=f*i;
		}
		return f;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Work w = new Work();
		System.out.println("Enter Number:");
		int num = scan.nextInt();
		int k = w.fact(num);
		System.out.println("Factorial is");
		System.out.println(k);
		
	}
}
