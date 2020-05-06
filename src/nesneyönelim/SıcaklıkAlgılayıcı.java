package nesneyönelim;
import java.util.Random;
public class SıcaklıkAlgılayıcı implements Temperature{
	private int temp;
	public SıcaklıkAlgılayıcı() {
		Random rand = new Random();
		this.temp = rand.nextInt(30)+20;

	}
	public int ReadTemperature() {
		return temp;
	}
	public void TemperatureUpdate(int t) {
		this.temp = t;
	}
}
