package com.Program1;

import java.util.Scanner;

public class TwoSortArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter th size of the first array");
	int a=sc.nextInt();
	System.out.println("enter the size of second array");
	int b=sc.nextInt();
	int ar[]=new int[a];
	int br[]=new int[b];
	System.out.println("enter the first array elements");
	for(int i=0;i<a;i++) {
		ar[i]=sc.nextInt();
	}
	System.out.println("enter the second array elements");
	for(int i=0;i<b;i++) {
		br[i]=sc.nextInt();
	}
	int cr[]=new int[ar.length+br.length];
	int i=0,k=0,j=0;
	while(i<ar.length&&j<br.length) {
		if(ar[i]<br[j]) {
			cr[k++]=ar[i++];	
		}
		else
			cr[k++]=br[j++];
	}
	while(i<ar.length) {
		cr[k++]=ar[i++];
	}
	while(j<br.length) {
		cr[k++]=br[j++];
	}
	for(int l=0;l<cr.length;l++) {
		System.out.print(cr[l]+" ");
	}
	
}
}
