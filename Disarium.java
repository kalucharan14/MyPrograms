package com.Program1;
import java.util.Scanner;
public class Disarium {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	boolean b=diserion(a);
	System.out.println(b);
}
 static boolean diserion(int a) {
	 int sum=0,c=count(a),temp=a;
	while(a>0) {
		int r=a%10;
		sum=sum+pow(r,c);
		c--;
		a=a/10;
	}
	return temp==sum;
}
  static int pow(int r, int c) {
	int m=1;
	while(c>0) {
		m=m*r;
		c--;
	}
	return m;
}
static int count(int a) {
	 int count=0;
	while(a>0) {
		int r=a%10;
		count++;
		a=a/10;
	}
	return count;
}
}
