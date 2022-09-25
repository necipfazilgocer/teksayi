package dortkat;
import java.util.Scanner;
public class dortkkat {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sayi,toplam=0;
	
		
		
		do {
			System.out.println("Bir sayı giriniz");
			sayi=scanner.nextInt();
			if(sayi%4==0)
			{
				toplam+=sayi;
				
			}
		}
		
		
		
		while(sayi%2==0);
		System.out.println("4ün katı olan sayıların toplamı: "+toplam);
	}

}
