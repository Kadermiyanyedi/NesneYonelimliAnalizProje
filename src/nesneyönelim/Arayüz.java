package nesneyönelim;
import java.util.Scanner;
public class Arayüz {
	
	public static boolean kullanicigonder(String user, String pass, UserKontrol control) {
		if(control.UserControl(user)>=0 && control.PassControl(pass,control.UserControl(user))) {
			return true;
		}
		else
			return false;
	}
	
	public static void Islem(MerkeziSistem m) {
		
		Scanner sc = new Scanner(System.in);
		int secim;
		do {
		System.out.println("\nLütfen yapmak istediginiz islemi seciniz: \n1-Sicaklik Göster "
				+ "\n2-Sogutucu Ac\n3-Sogutucu Kapa\n4-Cikis");
		
		secim = sc.nextInt();
		sc.nextLine();
		
		switch(secim) {
		case 1: 
			System.out.println("Ortam sıcaklığı: "+m.SıcaklıkGetir());
			break;
		case 2:
			m.SogutucuAc();
			break;
		case 3:
			m.SogutucuKapa();
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
			System.out.println("Your right of entry has expired");
		
	}
}
