package org.scanner;

import java.util.Scanner;

public class Stest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the emp age:");
		int nextInt = scanner.nextInt();
		System.out.println("your emp age:"+nextInt);
		
		System.out.println("enter your ph no");
		long nextLong = scanner.nextLong();
		System.out.println("your ph no is:"+nextLong);
		
		System.out.println("enter your nick name");
		String next = scanner.next();
		System.out.println("your nick name is:"+next);
		
		System.out.println("enter your name");
		scanner.nextLine();
		String nextLine1 = scanner.nextLine();
		System.out.println("your name is :"+nextLine1);
		
//		nextint();
//		nextlong();
//		nextbytes();
//		nextshort();
//		nextfloat();
//		nextboolean();
//		nextdouble();
//		nextlong();
//		next();
//		nextline();
		
	}

}
