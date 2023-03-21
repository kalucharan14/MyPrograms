package com.Program1;
import java.util.Scanner;
public class StrongNumber {
	//sum of factorial of each digit is eqaul to original number
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	boolean b=strong(a);
	if(b)
		System.out.println(a+" is strong number");
	else
		System.out.println(a+" is not Strong number");
}

 static boolean strong(int a) {
	 int sum=0,temp=a;
while(a>0) {
	int r=a%10;
	sum=sum+fact(r);
	a=a/10;
}
if(temp==sum)
	return true;
else 
	return false;

}

 static int fact(int s) {
	 int fact=1;
	 while(s>0) {
		 fact=fact*s;
		 s--;
	 }
	 return fact;
	
}
}
