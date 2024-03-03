package Project;

public class ImageThread extends Thread{

	@Override
	public void run() {
		image img = new image();
		img.main(null);
	}
}
