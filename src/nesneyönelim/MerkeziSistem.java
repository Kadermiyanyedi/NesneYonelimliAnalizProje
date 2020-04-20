package nesneyönelim;

public class MerkeziSistem {
	private int temp=0;
	
	Eyleyici ey = new Eyleyici();
	EyleyiciModül eym = new EyleyiciModül(ey);
	SıcaklıkAlgılayıcı sa = new SıcaklıkAlgılayıcı();
	
	public int SıcaklıkGetir() {
		if(temp == 0)
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
