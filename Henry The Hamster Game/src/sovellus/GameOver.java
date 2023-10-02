package sovellus;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameOver extends JFrame {

	private JPanel contentPane;
	private JLabel tausta;
	private JLabel otsikko;
	private JLabel hamsterikuva;
	private JButton nappi1;
	private JButton nappi2;
	private static MainGame maingame = new MainGame();
	private JLabel nuotti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOver frame = new GameOver();
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
	public GameOver() {
		setTitle("Henry The Hamster - Sick in Bed");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 550);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/siemen.PNG"));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nappi2 = new JButton("Play again!");
		nappi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nappi2.isEnabled())
					GameOver.this.dispose();
				    Game.alkuArvot();
					maingame.setVisible(true);
			}
		});
		
		nuotti = new JLabel("");
		nuotti.setIcon(new ImageIcon(new ImageIcon("src/img/nuottikuva.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
		nuotti.setBounds(650, 13, 44, 37);
		contentPane.add(nuotti);
		
		nappi2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nappi2.setBounds(302, 445, 183, 25);
		contentPane.add(nappi2);
		
		nappi1 = new JButton("Exit game");
		nappi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (nappi1.isEnabled())
					System.exit(0);
			}
		});
		nappi1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nappi1.setBounds(302, 393, 183, 25);
		contentPane.add(nappi1);
		
		hamsterikuva = new JLabel("");
		hamsterikuva.setIcon(new ImageIcon(new ImageIcon("src/img/hamster-happy.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
		hamsterikuva.setBounds(199, 43, 464, 337);
		contentPane.add(hamsterikuva);
		
		otsikko = new JLabel("Henry The Hamster is cured!!");
		otsikko.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		otsikko.setBounds(225, 4, 438, 46);
		contentPane.add(otsikko);
		
		tausta = new JLabel("");
		tausta.setBackground(SystemColor.info);
		tausta.setOpaque(true);
		tausta.setBounds(0, 0, 752, 503);
		contentPane.add(tausta);
	}
}
