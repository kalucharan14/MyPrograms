package com.Program1;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	boolean b=palindrome(a);
	System.out.println(b);
}

 static boolean palindrome(int a) {
	 int rev=0,temp=a;
	do {
		int d=a%10;
		rev=rev*10+d;
		a=a/10;
	}while(a!=0);
	System.out.println(rev);
	return temp==rev;
}
}
