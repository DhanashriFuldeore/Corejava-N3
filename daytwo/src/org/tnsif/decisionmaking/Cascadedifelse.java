package org.tnsif.decisionmaking;
import java.util.Scanner;
public class Cascadedifelse {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	 if(a>b && a>c) {
		 System.out.println("A is grater");
	 }
	 else if(b>a && b>c) {
		 System.out.println("B is grater");
	 }
	 else {
		 System.out.println("C is grater");
	 }
	 
}
}
