package nesneyönelim;
import java.sql.*;
import java.util.Scanner;
public class Arayüz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserKontrol control = new UserKontrol();
		control.DatabaseUsers();
		MerkeziSistem ms = new MerkeziSistem();
		boolean temp;
		while(true) {
			System.out.println("Username: ");
			String user = sc.next();
			System.out.println("Password: ");
			String pass = sc.next();
			temp = control.Control(user, pass);
			if(temp == true)
				break;
		}
		int secim;
		do {
		System.out.println("Lütfen yapmak istediginiz islemi seciniz: \n1-Sicaklik Göster "
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


}
