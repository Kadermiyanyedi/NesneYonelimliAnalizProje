package nesneyönelim;
import java.sql.*;
import java.util.Scanner;
public class Arayüz {
	
	public static boolean kullanicigonder(String user, String pass, UserKontrol control) {
		int deger = control.UserControl(user);
		if(deger>=0) {
			return control.PassControl(pass, deger);
		}
		else
			return false;
	}
	
	public static void Islem(MerkeziSistem ms) {
		Scanner sc = new Scanner(System.in);
		int secim;
		do {
		System.out.println("\nLütfen yapmak istediginiz islemi seciniz: \n1-Sicaklik Göster "
				+ "\n2-Sogutucu Ac\n3-Sogutucu Kapa\n4-Cikis");
		
		secim = sc.nextInt();
		sc.nextLine();
		
		switch(secim) {
		case 1: 
			System.out.println("Ortam sıcaklığı: "+ms.SıcaklıkGetir());
			break;
		case 2:
			ms.SogutucuAc();
			break;
		case 3:
			ms.SogutucuKapa();
			break;
			
		}
		
	  }while(secim != 4);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UserKontrol control = new UserKontrol();
		control.DatabaseUsers();
		MerkeziSistem ms = new MerkeziSistem();
		int sayac = 0;
		boolean temp = false;
		while(sayac<3) {
			
			System.out.println("Username: ");
			String user = sc.next();
			System.out.println("Password: ");
			String pass = sc.next();
			
			if(kullanicigonder(user,pass,control)) {
				temp = true;
				break;
			}
			sayac++;	
		}
		if(temp)
			Islem(ms);
		else
			System.out.println("Giriş hakkınız dolmuştur");
		
	}
}
