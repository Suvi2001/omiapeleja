package sovellus;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class myJlabel extends MainGame {
	protected static void setImage() {

	// img = new addPhoto();
	// No need to add the image to the frame again, just refresh
	// hamsterikuva.repaint();
	// hamsterikuva = new hamsterikuva(new ImageIcon(img)); 
			if (mood_progressBar.getValue() <= 49 && viiksinappi.isEnabled()) {
				//myJlabelTwo.setImagetwo();
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-sad-moustache.jpg").getImage()
						.getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
				//hamsterikuva.setOpaque(true);
				hamsterikuva.repaint();
				hamsterikuva.setVisible(true);
			}
			else if (mood_progressBar.getValue() >=50 && viiksinappi.isEnabled()) {
				//myJlabelTwo.setImagetwo();
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-neutral-moustache.jpg").getImage()
						.getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
				//hamsterikuva.setOpaque(true);
				hamsterikuva.repaint();
				hamsterikuva.setVisible(true);
			}
			else if (mood_progressBar.getValue() <= 49 && monokkelinappi.isEnabled()) {
				//myJlabelTwo.setImagetwo();
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-sad-monocle.jpg").getImage()
						.getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
				//hamsterikuva.setOpaque(true);
				hamsterikuva.repaint();
				hamsterikuva.setVisible(true);
			}
			else if (mood_progressBar.getValue() >= 50 && monokkelinappi.isEnabled()) {
				//myJlabelTwo.setImagetwo();
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-neutral-monocle.jpg").getImage()
						.getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
				//hamsterikuva.setOpaque(true);
				hamsterikuva.repaint();
				hamsterikuva.setVisible(true);
			}
			else if (mood_progressBar.getValue() <= 49 && rusettinappi.isEnabled()) {
				//myJlabelTwo.setImagetwo();
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-sad-bow.jpg").getImage()
						.getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
				//hamsterikuva.setOpaque(true);
				hamsterikuva.repaint();
				hamsterikuva.setVisible(true);
			}
			else if (mood_progressBar.getValue() >= 50 && rusettinappi.isEnabled()) {
				//myJlabelTwo.setImagetwo();
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-neutral-bow.jpg").getImage()
						.getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
				//hamsterikuva.setOpaque(true);
				hamsterikuva.repaint();
				hamsterikuva.setVisible(true);
			}
			else if (mood_progressBar.getValue() <= 49) {
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-sad.jpg").getImage()
						.getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
				//hamsterikuva.setOpaque(true);
				hamsterikuva.repaint();
				hamsterikuva.setVisible(true);
			}
			else {
				//myJlabelTwo.setImagetwo();
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-neutral.jpg").getImage()
						.getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
				//hamsterikuva.setOpaque(true);
				hamsterikuva.repaint();
				hamsterikuva.setVisible(true);
			}
	 }
};