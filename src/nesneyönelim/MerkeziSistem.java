package nesneyönelim;

public class MerkeziSistem {
	private int temp;
	
	Eyleyici ey = new Eyleyici();
	EyleyiciModül eym = new EyleyiciModül(ey);
	SıcaklıkAlgılayıcı sa = new SıcaklıkAlgılayıcı();
	
	public int SıcaklıkGetir() {
		temp = sa.getTemperature();
		return temp;
	}
	
	public void SogutucuAc() {
		temp = ey.sogutucuAc(temp);
	}
	
	public void SogutucuKapa() {
		ey.sogutucuKapa(temp);	
	}
}
