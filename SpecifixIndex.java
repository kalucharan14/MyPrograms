package com.Program1;
import java.util.Scanner;
public class SpecifixIndex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++) {
		ar[i]=sc.nextInt();
	}
	System.out.println("enter the element to insert");
	int ele=sc.nextInt();
	System.out.println("which position");
	int pos=sc.nextInt();
	int br[]=new int[ar.length+1];
	br[pos]=ele;
	for(int i=0;i<ar.length;i++) {
		if(i<pos)
			br[i]=ar[i];
		else
			br[i+1]=ar[i];
	}
	for(int i=0;i<ar.length+1;i++) {
		System.out.print(br[i]+" ");
	}
}
}
