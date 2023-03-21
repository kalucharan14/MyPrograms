package com.Program1;
import java.util.Scanner;
public class HappyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	boolean b=happy(a);
	System.out.println(b);
}
static boolean happy(int a) {
	
	while(a>9) {
		int sum=0;
	while(a>0) {
		int r=a%10;
		sum=sum+r*r;
		a=a/10;
	}
	a=sum;
	}
	return a==1||a==7;

}
}
