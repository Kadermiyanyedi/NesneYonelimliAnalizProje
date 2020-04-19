package nesneyönelim;

public class Arayüz {

	public static void main(String[] args) {
		MerkeziSistem ms = new MerkeziSistem();
		System.out.println(ms.SıcaklıkGetir());
		ms.SogutucuAc();
		System.out.println(ms.SıcaklıkGetir());
		ms.SogutucuAc();
		System.out.println(ms.SıcaklıkGetir());
		ms.SogutucuKapa();
		System.out.println(ms.SıcaklıkGetir());

	}

}
