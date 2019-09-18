/**
 * @(#)Suhu.java
 *
 *
 * @author 
 * @version 1.00 2019/9/17
 */

import java.util.Scanner;
public class Suhu {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		double celsius, fahrenheit;
		int pil;
		
			System.out.println("Daftar Pilihan");
			System.out.println("1.Celsius ke Fahrenheit");
			System.out.println("2.Fahrenheit ke Celsius");
			System.out.print("Masukkan pilihan: ");
			
			pil=input.nextInt();
			System.out.println();
			
			switch(pil){
			
				case 1:{
				
					System.out.println("Celsius ke Fahrenheit");
					System.out.print("Inputkan Celsius: ");
					celsius=input.nextInt();
					fahrenheit=(celsius*9/5)+32;
					System.out.print("Hasil konversi: "+fahrenheit+" Fahrenheit");
					System.out.println();
				
				break;
				}
				case 2:{
					System.out.println("Fahrenheit ke Celsius");
					System.out.print("Inputkan Fahrenheit: ");
					fahrenheit=input.nextInt();
					celsius=(fahrenheit-32)*5/9;
					System.out.print("Hasil konversi: "+celsius+" Celsius");
					System.out.println();
				
				break;
				}		
		}		
	}	
}