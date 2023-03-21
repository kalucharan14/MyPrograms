package com.Program1;
import java.util.Scanner;
public class ZigZag {
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
	int k=0,i=0;
	while(i<ar.length&&i<br.length) {
		cr[k]=ar[i];
		k++;
		cr[k]=br[i];
		k++;
		i++;
	}
	while(i<ar.length) {
		cr[k]=ar[i];
		k++;
		i++;
	}
	while(i<br.length) {
		cr[k]=br[i];
		k++;
		i++;
	}
	for(int j=0;j<cr.length;j++) {
		System.out.print(cr[j]+" ");
	}
}
}
