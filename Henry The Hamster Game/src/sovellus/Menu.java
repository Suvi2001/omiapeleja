package sovellus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private static final File File = null;
	private JPanel contentPane;
	private JLabel tausta;
	protected static JButton nappi1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	
	private static CharacterCustomization charactercustomization = new CharacterCustomization();
	private JLabel hamsterikuva;
	protected static JButton nuotti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Henry The Hamster - Sick In Bed");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 550);
		contentPane = new JPanel();
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/siemen.PNG"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nuotti = new JButton("");
		nuotti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music.playMusic();
			}
		});
		nuotti.setIcon(new ImageIcon(new ImageIcon("src/img/nuottikuva.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
		nuotti.setBounds(650, 13, 44, 37);
		contentPane.add(nuotti);
		
		hamsterikuva = new JLabel("");
		hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-happy.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
		hamsterikuva.setBounds(185, 39, 464, 342);
	    contentPane.add(hamsterikuva);
		
		lblNewLabel_1 = new JLabel("Henry The Hamster - Sick in bed");
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(185, 0, 438, 46);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton_1 = new JButton("End game");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_1.isEnabled()) {
					System.exit(0);
				}
			}
		});
	
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(283, 447, 207, 25);
		contentPane.add(btnNewButton_1);
		
		nappi1 = new JButton("Start!");
		nappi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (nappi1.isEnabled()) {
					Menu.this.dispose();
					//Game.alkuArvot();
					//myJlabel.setImage();
					charactercustomization.setVisible(true);
					//Dateprint.printDate();
					//JOptionPane.showMessageDialog(null, "Henry the hamster is sick! Take care of him until he feels better.");
				}
			}
		});
	
		nappi1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nappi1.setBounds(283, 394, 207, 25);
		contentPane.add(nappi1);
		
		tausta = new JLabel("");
		tausta.setBackground(SystemColor.info);
		tausta.setOpaque(true);
		tausta.setBounds(0,0, 753, 503);
		contentPane.add(tausta);
	}
}
