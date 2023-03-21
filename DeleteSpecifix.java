package com.Program1;

import java.util.Scanner;

public class DeleteSpecifix {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array");
int n=sc.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++) {
	ar[i]=sc.nextInt();
}
int br[]=new int[n-1];
System.out.println("enter the position");
int pos=sc.nextInt();
for(int i=0;i<n-1;i++) {
	if(i<pos)
		br[i]=ar[i];
	else
		br[i]=ar[i+1];
}
for(int i=0;i<br.length;i++) {
	System.out.print(br[i]+" ");
}
}
}
