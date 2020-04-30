package nesneyönelim;

public class MerkeziSistem {
	
	private int temp=0;
	
	Eyleyici ey = new Eyleyici();
	EyleyiciModül eym = new EyleyiciModül();
	SıcaklıkAlgılayıcı sa = new SıcaklıkAlgılayıcı();
	
	public void MerkeziSistem() {
		ey.registerObserver(eym);
	}
	public int SıcaklıkGetir() {
		if(temp == 0)
			temp = sa.ReadTemperature();
		return temp;
	}
	
	public void SogutucuAc() {
		temp = ey.sogutucuAc(temp);
	}
	
	public void SogutucuKapa() {
		ey.sogutucuKapa(temp);	
	}
}
