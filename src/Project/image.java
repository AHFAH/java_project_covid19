package Project;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class image {

	void main(String[] args) {

			JFrame frame = new JFrame("모든 지역의 코로나19 누적 확진자 수");
			frame.setSize(1000, 550);
				
			frame.setLayout(new FlowLayout());
				
			ImageIcon icon = new ImageIcon("C:\\JavaStudy\\Webprogramming_project\\confirmedCases.PNG");
			Image im = icon.getImage();
			Image im2 = im.getScaledInstance(900, 500, Image.SCALE_SMOOTH);
			ImageIcon icon2 = new ImageIcon(im2);
			
			JLabel img = new JLabel(icon2);
			frame.add(img);
			frame.setLocation(300, 300);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
