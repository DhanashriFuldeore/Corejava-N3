package org.tnsif.decisionmaking;

import java.util.Scanner;

public class Nastedifelse {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int age =sc.nextInt();
		 int weight=sc.nextInt();
		 if(age>12) {
			       if(weight>=40) {
			         if(weight<120) {
			        	             System.out.println("eligibl");
			                         }
			         else {
			        	        System.out.println("add extra ropes");
			              }
		 } else { 
			        	    System.out.println("not eligible");
			        	    
			         }
	}else { 
			        	   System.out.println("not eligible");
			         }
		    
		 }
	}

