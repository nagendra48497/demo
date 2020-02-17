package capgemini.com;

import java.util.Scanner;

public class Test {
 
	
	public boolean findPalindrome(String name) {
		
		boolean k;
		StringBuffer sbr = new StringBuffer(name);
		String s = sbr.reverse().toString();
		if(name.equals(s)){
			k= true;
		}
		else {
			k=false;
		}
		
		return k;
	}
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		Test w = new Test();
		System.out.println("Enter String to check whether it is palindrome or not:");
		String name = scan.next();
		
		boolean b = w.findPalindrome(name);
		System.out.println(b);
		
	}
}
