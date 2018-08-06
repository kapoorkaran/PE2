package com.stackroute.pe2;


public class Palin_1 {
	public String palin(int num) {
	     int p = num; 
	     int rev = 0; 
	     int rem;

	     while (p != 0) {
	         rem = p % 10;
	         rev = rev * 10 + rem;
	         p = p / 10;
	     }
	     if (num == rev) {
	         return "true";
	     }
	     return "false";
	 }

}

