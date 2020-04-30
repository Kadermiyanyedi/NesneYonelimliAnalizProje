package nesneyönelim;
import java.util.Random;
public class SıcaklıkAlgılayıcı implements Temperature{
	private int temp;
	public int ReadTemperature() {
		Random rand = new Random();
		temp = rand.nextInt(30)+20;
		return temp;
	}
}
