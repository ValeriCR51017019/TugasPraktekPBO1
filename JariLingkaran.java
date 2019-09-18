/**
 * @(#)JariLingkaran.java
 *
 *
 * @author 
 * @version 1.00 2019/9/17
 */

import java.util.Scanner;
	public class JariLingkaran {

		public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			double luaslingkaran, jarijari;
			System.out.println("Luas Lingkaran");
			System.out.print("inputkan jari-jari: ");
			jarijari=input.nextInt();
			System.out.println();
		
		luaslingkaran=3.14*jarijari*jarijari;
		System.out.println("luas Lingkaran adalah: "+luaslingkaran);
	}
}