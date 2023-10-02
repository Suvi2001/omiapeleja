package sovellus;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class myJlabel extends Catalog {
    protected static void setMoney() {
    	if (kaaretorttubutton.isEnabled()) {
    		int luku1, luku2 = 3, vastaus;
			try {
				luku1 = Integer.parseInt(kolikkomaara.getText());

				vastaus = luku1 + luku2;
				kolikkomaara.setText(Integer.toString(vastaus));
		
			} catch (Exception args0) {
				System.out.println("yo1");
			}
    }}
    
    protected static void setMoney2() {
    	if (cupcakebutton.isEnabled()) {
    		int luku1, luku2 = 5, vastaus;
			try {
				luku1 = Integer.parseInt(kolikkomaara.getText());

				vastaus = luku1 + luku2;
				kolikkomaara.setText(Integer.toString(vastaus));

			} catch (Exception args0) {
				System.out.println("yo2");
			}
    	}
    }
    
    protected static void setMoney3() {
    	if (pannacottabutton.isEnabled()) {
    		int luku1, luku2 = 8, vastaus;
			try {
				luku1 = Integer.parseInt(kolikkomaara.getText());

				vastaus = luku1 + luku2;
				kolikkomaara.setText(Integer.toString(vastaus));

			} catch (Exception args0) {
				System.out.println("yo2");
			}
    	}
    }
    
    protected static void setMoney4() {
    	if (kaaretorttubutton2.isEnabled()) {
    		int luku1, luku2 = 10, vastaus;
			try {
				luku1 = Integer.parseInt(kolikkomaara.getText());

				vastaus = luku1 + luku2;
				kolikkomaara.setText(Integer.toString(vastaus));

			} catch (Exception args0) {
				System.out.println("yo3");
			}
    	}
    }
    
    protected static void getMoney() {
    	if (ostosbutton.isEnabled()) {
    	int luku1;
		try {
			luku1 = Integer.parseInt(kolikkomaara.getText());

			kolikkomaara1.setText(Integer.toString(luku1));

		} catch (Exception args0) {
			System.out.println("yo3");
		}
    }}
    protected static void setImage1() {
    	if (kaaretorttubutton.isEnabled()) {
    		try {
    			labeli.setIcon(new ImageIcon(new ImageIcon("img/kissaselin.png").getImage()
						.getScaledInstance(160, 160, Image.SCALE_DEFAULT)));
				//hamsterikuva.setOpaque(true);
				labeli.repaint();
				labeli.setVisible(true);
    	} catch (Exception args0) {
    		System.out.println("Vika tuli");
    	}
    }}
    
    protected static void setImage2() {
    	if (cupcakebutton.isEnabled()) {
    		try {
    			labeli.setIcon(new ImageIcon(new ImageIcon("img/catphoto.png").getImage()
						.getScaledInstance(160, 160, Image.SCALE_DEFAULT)));
				labeli.repaint();
				labeli.setVisible(true);
    	} catch (Exception args0) {
    		System.out.println("Vika tuli");
    	}
    }}
    	protected static void buttonCheck() {
    		ostonappi1.setEnabled(true);
    		int luku3, luku4 = 50, vastaus;
    		try {
				luku3 = Integer.parseInt(kolikkomaara1.getText());
            if (luku3 >=luku4) {
				vastaus = luku3 - luku4;
				kolikkomaara1.setText(Integer.toString(vastaus));
				kolikkomaara.setText(Integer.toString(vastaus));
				pannacottabutton.setVisible(true);
				nappilabel.setVisible(true);
				JOptionPane.showMessageDialog(null,"New item added to the menu!");
    		} else {
    			JOptionPane.showMessageDialog(null,"You can't afford this item right now!");
    		}
    			} catch (Exception args0) {
    		
				JOptionPane.showMessageDialog(null,"Vituiks meni!");
			} 
		
      }
    	protected static void buttonCheck2() {
    		ostonappi1.setEnabled(true);
    		int luku3, luku4 = 100, vastaus;
    		try {
				luku3 = Integer.parseInt(kolikkomaara1.getText());
            if (luku3 >=luku4) {
				vastaus = luku3 - luku4;
				kolikkomaara1.setText(Integer.toString(vastaus));
				kolikkomaara.setText(Integer.toString(vastaus));
				kaaretorttubutton2.setVisible(true);
				nappilabel2.setVisible(true);
				JOptionPane.showMessageDialog(null,"New item added to the menu!");
    		} else {
    			JOptionPane.showMessageDialog(null,"You can't afford this item right now!");
    		}
    			} catch (Exception args0) {
    		
				JOptionPane.showMessageDialog(null,"Vituiks meni!");
			} 
		
      }
}
