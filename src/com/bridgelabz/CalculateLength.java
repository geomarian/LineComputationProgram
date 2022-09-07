package com.bridgelabz;
/**
 * 
 */

/**
 * @author ASUS
 *
 */
public class CalculateLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x1 = 6;
		int y1 = 9;
		int x2 = 10;
		int y2 = 12;
		double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("length of the line one is: " + length1);

     
		int a1 = 8;
		int b1 = 6;
		int a2 = 7;
		int b2 = 78;
		double length2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		System.out.println("length of line two is: "+length2);
		

	}
}
	