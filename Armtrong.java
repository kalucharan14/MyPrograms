package com.Program1;
import java.util.Scanner;
public class Armtrong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	boolean b=armstrong(a);
	System.out.println(b);
	if(b) 
		System.out.println(a+" is armstrong number");
	
	else
		System.out.println(a+" is not armstrong number");
}

static boolean armstrong(int x) {
	int c=count(x),sum=0,temp=x;
	while(x>0) {
		int r=x%10;
		sum=sum+pow(r,c);
		x=x/10;
	}
	return temp==sum;
	
}

  static int pow(int r, int c) {
	int pow=1;
	while(c>0) {
		pow=pow*r;
		c--;
	}
	return pow;
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
