package Project;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class image2 {

	void main(String[] args) {

			JFrame frame = new JFrame("¹é½Å Á¢Á¾·ü");
			frame.setSize(550, 700);
				
			frame.setLayout(new FlowLayout());
				
			ImageIcon icon = new ImageIcon("C:\\JavaStudy\\Webprogramming_project\\vaccin.jpeg");
			Image im = icon.getImage();
			Image im2 = im.getScaledInstance(500, 700, Image.SCALE_SMOOTH);
			ImageIcon icon2 = new ImageIcon(im2);
			
			JLabel img = new JLabel(icon2);
			frame.add(img);
			frame.setLocation(300, 300);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
