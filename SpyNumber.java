package com.Program1;

import java.util.Scanner;

public class SpyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int mult=1,sum=0;
	while(n!=0) {
		int r=n%10;
		mult=mult*r;
		sum=sum+r;
		n=n/10;
	}
	if(sum==mult)
		System.out.println(temp+" is spy number");
	else
		System.out.println(temp+" is not spy number");
		
}
}
