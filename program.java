package Odev;

import java.util.Scanner;

public class program 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Birinci Kenarı Giriniz:");
		double a=scan.nextDouble();
		System.out.print("İkinci Kenarı Giriniz:");
		double b=scan.nextDouble();
		Hesap islemler = new Hesap();
		ucgenHesapla ucgen = new ucgenHesapla();
		System.out.println(" ");

		System.out.println("ÜÇGEN HESAPLAMA");
		ucgen.degerAta(a,b);
		System.out.println("Çevre:"+ ucgen.Cevre());
		System.out.println("Alan:"+ ucgen.Alan());
		System.out.println("Üçgenin Hipotenüsü:"+ ucgen.Hipotenus());	
	}
}
