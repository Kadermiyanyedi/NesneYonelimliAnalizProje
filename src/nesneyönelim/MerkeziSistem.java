package nesneyönelim;

public class MerkeziSistem {
	
	private int temp=0;
	
	Eyleyici ey = new Eyleyici();
	EyleyiciModül eym = new EyleyiciModül();
	SıcaklıkAlgılayıcı sa = new SıcaklıkAlgılayıcı();
	
	public MerkeziSistem() {
		ey.registerObserver(eym);
	}
	public int SıcaklıkGetir() {
		temp = sa.ReadTemperature();
		return temp;
	}
	
	public void SogutucuAc() {
		this.temp = ey.sogutucuAc(temp);
		sa.TemperatureUpdate(temp);
		
	}
	
	public void SogutucuKapa() {
		ey.sogutucuKapa(temp);	
	}
}
