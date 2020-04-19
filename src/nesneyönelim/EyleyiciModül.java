package nesneyönelim;

public class EyleyiciModül implements Observer {
	private int temp;
	private Eyleyici eyleyici;
	public EyleyiciModül(Eyleyici eyleyici) {
		this.eyleyici = eyleyici;
		eyleyici.registerObserver(this);
	}
	public int SogutucuAc(int t) {
		System.out.println("Soğutucu Çalıştırılıyor");
		temp = t-5;
		return temp;
	}
	public void SogutucuKapa(int temp) {
		System.out.println("Soğutucu Kapatılıyor");
	}

}
