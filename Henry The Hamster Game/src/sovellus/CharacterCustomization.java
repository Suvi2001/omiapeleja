package sovellus;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class CharacterCustomization extends JFrame {

	private JPanel contentPane;
	private JLabel tausta;
	protected static JLabel hamsterikuva;
	private JLabel lblNewLabel_1;
	private JLabel tausta1;
	private JLabel tausta2;
	private JButton nappi1;
	private JButton nappi2;
	private static MainGame maingame = new MainGame();
	private JButton nuotti;
	protected static JButton rusettinappi;
	private JButton infonappi;
	protected static JButton monokkelinappi;
	protected static JButton viiksinappi;
	private JButton viiksinappi_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharacterCustomization frame = new CharacterCustomization();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CharacterCustomization() {
		setTitle("Henry The Hamster - Sick in Bed");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 550);
		contentPane = new JPanel();
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/siemen.PNG"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rusettinappi = new JButton("");
		rusettinappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-neutral-bow.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
				
			}
		});
		
		infonappi = new JButton("i");
		infonappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You can customize Henry here. Confirm the customization & play the game by pressing the green check button, "
						+ "undress him from the red X-button. Have fun!");
			}
		});
		
		monokkelinappi = new JButton("");
		monokkelinappi.setIcon(new ImageIcon(CharacterCustomization.class.getResource("/img/monocle-icon.jpg")));
		monokkelinappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-neutral-monocle.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
			}
		});
		
		viiksinappi_1 = new JButton("");
		viiksinappi_1.setBounds(614, 266, 97, 89);
		contentPane.add(viiksinappi_1);
		
		viiksinappi = new JButton("");
		viiksinappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-neutral-moustache.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
			}
		});
		viiksinappi.setIcon(new ImageIcon(CharacterCustomization.class.getResource("/img/moustache-icon.jpg")));
		viiksinappi.setIcon(new ImageIcon(
				new ImageIcon("src/img/moustache-icon.jpg").getImage().getScaledInstance(100, 85, Image.SCALE_DEFAULT)));
		viiksinappi.setBounds(615, 77, 97, 89);
		contentPane.add(viiksinappi);
		
		monokkelinappi.setIcon(new ImageIcon(
				new ImageIcon("src/img/monocle-icon.jpg").getImage().getScaledInstance(100, 85, Image.SCALE_DEFAULT)));
		monokkelinappi.setBounds(23, 266, 97, 89);
		contentPane.add(monokkelinappi);
		
		infonappi.setFont(new Font("Times New Roman", Font.BOLD, 35));
		infonappi.setBounds(667, 13, 44, 37);
		contentPane.add(infonappi);
		rusettinappi.setIcon(new ImageIcon(
				new ImageIcon("src/img/bow.jpg").getImage().getScaledInstance(100, 85, Image.SCALE_DEFAULT)));
		rusettinappi.setBounds(23, 77, 97, 89);
		contentPane.add(rusettinappi);
		
		nuotti = new JButton("");
		nuotti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Music.playMusic();
			}
		});
		nuotti.setIcon(new ImageIcon(new ImageIcon("src/img/nuottikuva.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
		nuotti.setBounds(611, 13, 44, 37);
		contentPane.add(nuotti);
		
		nappi2 = new JButton("");
		nappi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-neutral.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
			}
		});
		nappi2.setIcon(new ImageIcon(
				new ImageIcon("src/img/xphoto.png").getImage().getScaledInstance(90, 75, Image.SCALE_DEFAULT)));
		nappi2.setBounds(154, 420, 90, 78);
		contentPane.add(nappi2);
		
		nappi1 = new JButton("");
		nappi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (nappi1.isEnabled()) {
					CharacterCustomization.this.dispose();
					Game.alkuArvot();
					//myJlabel.setImage();
					TimerTask task = new TimerTask() {
				        public void run() {
				        	JOptionPane.showMessageDialog(null, "Time's up, game over!");
				        	System.exit(0);
				        }
				    };
				    Timer timer = new Timer("Timer");
				    
				    long delay = 1000000L;
				    timer.schedule(task, delay);
					maingame.setVisible(true);
					Dateprint.printDate();
					JOptionPane.showMessageDialog(null, "Henry the hamster is sick! Take care of him until he feels better.");
				}
			}
		});
		nappi1.setIcon(new ImageIcon(
				new ImageIcon("src/img/checkmark.png").getImage().getScaledInstance(90, 75, Image.SCALE_DEFAULT)));
		nappi1.setBounds(489, 420, 90, 78);
		contentPane.add(nappi1);
		
		tausta2 = new JLabel("");
		tausta2.setOpaque(true);
		tausta2.setBackground(new Color(245, 222, 179));
		tausta2.setBounds(0, 0, 142, 503);
		contentPane.add(tausta2);
		
		tausta1 = new JLabel("");
		tausta1.setBackground(new Color(245, 222, 179));
		tausta1.setOpaque(true);
		tausta1.setBounds(591, 0, 142, 503);
		contentPane.add(tausta1);
		
		lblNewLabel_1 = new JLabel("Customize Henry the Hamster!");
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(154, 0, 425, 52);
		contentPane.add(lblNewLabel_1);
		
		hamsterikuva = new JLabel("");
		hamsterikuva.setBounds(164, 47, 408, 370);
		hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-neutral.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
		contentPane.add(hamsterikuva);
		
		tausta = new JLabel("");
		tausta.setBackground(SystemColor.info);
		tausta.setOpaque(true);
		tausta.setBounds(0, 0, 733, 503);
		contentPane.add(tausta);
	}
}
