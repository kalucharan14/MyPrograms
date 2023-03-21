package com.Program1;
import java.util.Scanner;
public class PerfectNumber {
    //the number is equal to sum of its divisors
	//is known as perfect number
	//6=1+2+3
	//28=1+2+4+7+14,8128
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	boolean b=perfect(a);
	if(b)
		System.out.println(a+" is a perfect number");
	else
		System.out.println("not perfet number");
}

 static boolean perfect(int x) {
	 int sum=0;
	for(int i=1;i<=x/2;i++) {
		if(x%i==0) {
			sum=sum+i;
		}
	}
	if(sum==x)
		return true;
	else
		return false;
}
}
