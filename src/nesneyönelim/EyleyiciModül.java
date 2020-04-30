package nesneyönelim;

public class EyleyiciModül implements Observer {
	
	private int temp;
	
	public int SogutucuAc(int t) {
		System.out.println("Soğutucu Çalıştırılıyor");
		temp = t-4;
		return temp;
	}
	
	public void SogutucuKapa(int temp) {
		System.out.println("Soğutucu Kapatılıyor");
	}

}
