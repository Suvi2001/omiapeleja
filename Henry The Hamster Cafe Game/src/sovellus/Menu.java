package sovellus;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JLabel tausta;
	private JLabel kahvilakuva;
	private JButton nappi1;
	private JButton nappi2;
	private JLabel otsikko;
	private JLabel lblNewLabel;
	
	private static MainGame maingame = new MainGame();
	private JButton nuottikuva;

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
		setTitle("Henry The Hamster - Caf\u00E9 Mania");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/siemen.PNG"));
		setBounds(100, 100, 900, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nappi2 = new JButton("Exit game");
		nappi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		nuottikuva = new JButton("");
		nuottikuva.setIcon(new ImageIcon(new ImageIcon("img/nuottikuva.png").getImage().getScaledInstance(50, 45, Image.SCALE_DEFAULT)));
		nuottikuva.setBounds(807, 23, 50, 45);
		contentPane.add(nuottikuva);
		
		lblNewLabel = new JLabel("Henry's");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(47, 79, 79));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(251, 171, 120, 45);
		contentPane.add(lblNewLabel);
		
		otsikko = new JLabel("Henry The Hamster - Caf\u00E9 Mania");
		otsikko.setBackground(new Color(169, 169, 169));
		otsikko.setOpaque(true);
		otsikko.setFont(new Font("Poor Richard", Font.PLAIN, 35));
		otsikko.setHorizontalAlignment(SwingConstants.CENTER);
		otsikko.setBounds(95, 23, 700, 45);
		contentPane.add(otsikko);
		nappi2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nappi2.setBounds(332, 551, 227, 25);
		contentPane.add(nappi2);
		
		nappi1 = new JButton("Start!");
		nappi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nappi1.isEnabled()) {
					Menu.this.dispose();
					MainGame.labeli.setIcon(new ImageIcon(new ImageIcon("img/kissaselin.png").getImage()
							.getScaledInstance(160, 160, Image.SCALE_DEFAULT)));
					MainGame.labeli2.setIcon(new ImageIcon(new ImageIcon("img/ajatuskuplajee.png").getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT)));
					MainGame.labeli3.setIcon(new ImageIcon(new ImageIcon("img/kaaretorttu.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT)));
					TimerTask task = new TimerTask() {
				        public void run() {
				        	JOptionPane.showMessageDialog(null, "Level up!");
				        }
				    };
				    Timer timer = new Timer("Timer");
				    
				    long delay = 30000L;
				    timer.schedule(task, delay);
					maingame.setVisible(true);
					//Dateprint.printDate();
					//JOptionPane.showMessageDialog(null, "Henry the hamster is sick! Take care of him until he feels better.");
				}
			}
		});
		nappi1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nappi1.setBounds(332, 494, 227, 25);
		contentPane.add(nappi1);
		
		kahvilakuva = new JLabel("");
		kahvilakuva.setIcon(new ImageIcon(new ImageIcon("img/ulkokuva.png").getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT)));
		kahvilakuva.setBounds(95, 63, 704, 400);
		contentPane.add(kahvilakuva);
		
		tausta = new JLabel("");
		tausta.setBackground(new Color(255, 228, 225));
		tausta.setOpaque(true);
		tausta.setBounds(0, 0, 882, 603);
		contentPane.add(tausta);
	}
}
