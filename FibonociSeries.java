package com.Program1;
import java.util.Scanner;
public class FibonociSeries {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the range");
	int n=sc.nextInt();
	int f=0,s=1,t=0;
	System.out.print(f+" ");
	System.out.print(s+" ");
	while(t<n) {
		t=f+s;
		System.out.print(t+" ");
		f=s;
		s=t;
	}
}
}
