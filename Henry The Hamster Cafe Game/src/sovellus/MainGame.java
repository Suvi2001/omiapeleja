package sovellus;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.Timer;
import java.util.TimerTask;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MainGame extends JFrame {

	private JPanel contentPane;
	private JLabel tausta;
	private JLabel kahvilakuva;
	private JLabel kolikkokuva;
	private JLabel lblNewLabel_1;
	private JLabel clock;
	protected static JButton cupcakebutton;
	protected static JLabel labeli;
	protected static JButton kaaretorttubutton;
	protected static JButton ostosbutton;
	protected static JLabel labeli2;
	protected static JLabel labeli3;
	private JButton nuottikuva;
	protected static Catalog catalog = new Catalog();
	protected static JTextField kolikkomaara;
	protected static JButton pannacottabutton;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	protected static JLabel nappilabel;
	protected static JButton kaaretorttubutton2;
	protected static JLabel nappilabel2;
	protected static JLabel label4;
	protected static JLabel labeli5;
	protected static JLabel labeli6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGame frame = new MainGame();
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
	public MainGame() {
		setTitle("Henry The Hamster - Cafe Mania");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/siemen.PNG"));
		setBounds(100, 100, 900, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pannacottabutton = new JButton("");
		pannacottabutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myJlabel.setMoney3();
				
			}
		});
		pannacottabutton.setBackground(new Color(51, 51, 0));
		pannacottabutton.setIcon(new ImageIcon(new ImageIcon("img/pannacotta.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		pannacottabutton.setBounds(478, 68, 56, 51);
		pannacottabutton.setVisible(false);
		
		nappilabel = new JLabel("7$");
		nappilabel.setHorizontalAlignment(SwingConstants.CENTER);
		nappilabel.setForeground(Color.WHITE);
		nappilabel.setVisible(false);
		
		nappilabel2 = new JLabel("10$");
		nappilabel2.setHorizontalAlignment(SwingConstants.CENTER);
		nappilabel2.setForeground(Color.WHITE);
		nappilabel2.setVisible(false);
		
		labeli6 = new JLabel("");
		labeli6.setBounds(192, 68, 89, 86);
		contentPane.add(labeli6);
		
		labeli5 = new JLabel("");
		//labeli5.setIcon(new ImageIcon(new ImageIcon("img/ajatuskuplajee.png").getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT)));
		labeli5.setBounds(134, 35, 195, 168);
		contentPane.add(labeli5);
		
		label4 = new JLabel("");
		label4.setBounds(78, 215, 178, 194);
		contentPane.add(label4);
		nappilabel2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 17));
		nappilabel2.setBounds(341, 196, 56, 16);
		contentPane.add(nappilabel2);
		
		kaaretorttubutton2 = new JButton("");
		kaaretorttubutton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myJlabel.setMoney4();
			}
		});
		kaaretorttubutton2.setVisible(false);
		kaaretorttubutton2.setIcon(new ImageIcon(new ImageIcon("img/pinkkikaaretorttu.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT)));
		kaaretorttubutton2.setBackground(new Color(47, 79, 79));
		kaaretorttubutton2.setBounds(341, 143, 56, 51);
		contentPane.add(kaaretorttubutton2);
		nappilabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 17));
		nappilabel.setBounds(478, 121, 56, 16);
		contentPane.add(nappilabel);
		
		lblNewLabel_3 = new JLabel("3$");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Viner Hand ITC", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(410, 121, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("5$");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(341, 121, 56, 16);
		contentPane.add(lblNewLabel_2);
		contentPane.add(pannacottabutton);
		
		kolikkomaara = new JTextField();
		kolikkomaara.setText("0");
		kolikkomaara.setFont(new Font("Sitka Subheading", Font.PLAIN, 39));
		kolikkomaara.setEditable(false);
		kolikkomaara.setBounds(727, 547, 89, 43);
		contentPane.add(kolikkomaara);
		kolikkomaara.setColumns(10);
		
		labeli3 = new JLabel("");
		//labeli3.setIcon(new ImageIcon(new ImageIcon("img/kaaretorttu.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT)));
		labeli3.setBounds(742, 80, 89, 86);
		contentPane.add(labeli3);
		
		labeli2 = new JLabel("");
		//labeli2.setIcon(new ImageIcon(new ImageIcon("img/ajatuskuplajee.png").getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT)));
		labeli2.setBounds(687, 68, 195, 168);
		contentPane.add(labeli2);
		
		ostosbutton = new JButton("");
		ostosbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ostosbutton.isEnabled()) {
					myJlabel.getMoney();
					catalog.setVisible(true);
					//Dateprint.printDate();
					//JOptionPane.showMessageDialog(null, "Henry the hamster is sick! Take care of him until he feels better.");
				}
			}
		});
		ostosbutton.setBackground(new Color(47, 79, 79));
		ostosbutton.setIcon(new ImageIcon(new ImageIcon("img/shoppingcart.png").getImage().getScaledInstance(61, 56, Image.SCALE_DEFAULT)));
		ostosbutton.setBounds(37, 547, 63, 56);
		contentPane.add(ostosbutton);
		
		kaaretorttubutton = new JButton("");
		kaaretorttubutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myJlabel.setMoney();
				labeli2.setIcon(new ImageIcon(new ImageIcon("img/ajatuskuplajee.png").getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT)));
				labeli3.setIcon(new ImageIcon(new ImageIcon("img/cupcake.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT)));
				labeli.setIcon(new ImageIcon(new ImageIcon("img/kissaselin.png").getImage()
						.getScaledInstance(160, 160, Image.SCALE_DEFAULT)));
				//myJlabel.setImage2();
				Notifier.scheduler();
				
			}
		});
		kaaretorttubutton.setBackground(new Color(51, 51, 0));
		kaaretorttubutton.setBounds(410, 68, 56, 51);
		kaaretorttubutton.setIcon(new ImageIcon(new ImageIcon("img/kaaretorttu.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT)));
		contentPane.add(kaaretorttubutton);
		
		nuottikuva = new JButton("");
		nuottikuva.setIcon(new ImageIcon(new ImageIcon("img/nuottikuva.png").getImage().getScaledInstance(50, 45, Image.SCALE_DEFAULT)));
		nuottikuva.setBounds(807, 23, 50, 45);
		contentPane.add(nuottikuva);
		
		labeli = new JLabel("");
		//labeli.setIcon(new ImageIcon(new ImageIcon("img/catphoto.png").getImage().getScaledInstance(140, 160, Image.SCALE_DEFAULT)));
		labeli.setBounds(670, 235, 128, 157);
		contentPane.add(labeli);
		
		cupcakebutton = new JButton("");
		cupcakebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myJlabel.setMoney2();
				//myJlabel.setImage2();
				labeli.setIcon(new ImageIcon(new ImageIcon("img/catphoto.png").getImage().getScaledInstance(140, 160, Image.SCALE_DEFAULT)));
			    labeli3.setIcon(new ImageIcon(new ImageIcon("img/kaaretorttu.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT)));
				Notifier.scheduler();
				//labeli.setIcon(new ImageIcon(new ImageIcon("img/catphoto.png").getImage()
						//.getScaledInstance(160, 160, Image.SCALE_DEFAULT)));
			}
		});
		cupcakebutton.setBackground(new Color(47, 79, 79));
		cupcakebutton.setIcon(new ImageIcon(new ImageIcon("img/cupcake.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT)));
		cupcakebutton.setBounds(341, 68, 56, 51);
		contentPane.add(cupcakebutton);
		
		clock = new JLabel("");
		clock.setFont(new Font("Sitka Subheading", Font.PLAIN, 42));
		clock.setBounds(311, 547, 128, 43);
		contentPane.add(clock);
		
		lblNewLabel_1 = new JLabel("x");
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 35));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(812, 559, 41, 31);
		contentPane.add(lblNewLabel_1);
		
		kolikkokuva = new JLabel("");
		kolikkokuva.setIcon(new ImageIcon(new ImageIcon("img/coin.jpg").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
		kolikkokuva.setBounds(658, 547, 69, 56);
		contentPane.add(kolikkokuva);
		
		kahvilakuva = new JLabel("");
		kahvilakuva.setIcon(new ImageIcon(new ImageIcon("img/kahvilamuokkaus1.jpg").getImage().getScaledInstance(882, 550, Image.SCALE_DEFAULT)));
		kahvilakuva.setBounds(0, 0, 882, 546);
		contentPane.add(kahvilakuva);
		
		tausta = new JLabel("");
		tausta.setOpaque(true);
		tausta.setBackground(new Color(255, 228, 225));
		tausta.setBounds(0, 0, 882, 603);
		contentPane.add(tausta);
	}
}
