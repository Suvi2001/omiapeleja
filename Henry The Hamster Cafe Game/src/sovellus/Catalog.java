package sovellus;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Catalog extends MainGame {

	private JPanel contentPane;
	private JLabel labeli3;
	protected static JLabel kolikkokuva;
	protected static JLabel lblNewLabel_1;
	private JButton goback;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	protected static JButton ostonappi1;
	private JButton ostonappi2;
	private JButton ostonappi4;
	private JButton ostonappi3;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	protected static JTextField kolikkomaara1;
	private JLabel lblNewLabel_22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Catalog frame = new Catalog();
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
	public Catalog() {
		setTitle("Henry The Hamster - Cafe Mania Official Catalog");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/siemen.PNG"));
		setBounds(100, 100, 900, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		goback = new JButton("Exit");
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Catalog.this.dispose();
			}
		});
		
		lblNewLabel_22 = new JLabel("100$");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblNewLabel_22.setBounds(308, 293, 56, 21);
		contentPane.add(lblNewLabel_22);
		
		kolikkomaara1 = new JTextField();
		kolikkomaara1.setFont(new Font("Sitka Subheading", Font.PLAIN, 39));
		kolikkomaara1.setEditable(false);
		kolikkomaara1.setBounds(727, 547, 89, 43);
		contentPane.add(kolikkomaara1);
		kolikkomaara1.setColumns(10);
	
		
		lblNewLabel_20 = new JLabel("500$");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblNewLabel_20.setBounds(93, 475, 56, 21);
		contentPane.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("1000$");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblNewLabel_21.setBounds(308, 475, 56, 21);
		contentPane.add(lblNewLabel_21);
		
		lblNewLabel_18 = new JLabel("50$");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblNewLabel_18.setBounds(93, 293, 56, 21);
		contentPane.add(lblNewLabel_18);
		
		ostonappi2 = new JButton("Buy");
		ostonappi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myJlabel.buttonCheck2();
				ostonappi2.setEnabled(false);
			}
		});
		ostonappi2.setFont(new Font("Tahoma", Font.BOLD, 15));
		ostonappi2.setBounds(364, 287, 69, 26);
		contentPane.add(ostonappi2);
		
		ostonappi4 = new JButton("Buy");
		ostonappi4.setFont(new Font("Tahoma", Font.BOLD, 15));
		ostonappi4.setBounds(364, 469, 69, 26);
		contentPane.add(ostonappi4);
		
		ostonappi3 = new JButton("Buy");
		ostonappi3.setFont(new Font("Tahoma", Font.BOLD, 15));
		ostonappi3.setBounds(153, 469, 69, 26);
		contentPane.add(ostonappi3);
		
		ostonappi1 = new JButton("Buy");
		ostonappi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myJlabel.buttonCheck();
				label4.setIcon(new ImageIcon(new ImageIcon("img/catphoto.png").getImage().getScaledInstance(140, 160, Image.SCALE_DEFAULT)));
				labeli5.setIcon(new ImageIcon(new ImageIcon("img/ajatuskuplajee.png").getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT)));
				labeli6.setIcon(new ImageIcon(new ImageIcon("img/kaaretorttu.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT)));
				ostonappi1.setEnabled(false);
			}
		});
		ostonappi1.setFont(new Font("Tahoma", Font.BOLD, 15));
		ostonappi1.setBounds(153, 287, 69, 26);
		contentPane.add(ostonappi1);
		
		lblNewLabel_17 = new JLabel("Cost:");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel_17.setBounds(263, 472, 56, 26);
		contentPane.add(lblNewLabel_17);
		
		lblNewLabel_15 = new JLabel("Cost:");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel_15.setBounds(263, 290, 56, 26);
		contentPane.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Cost:");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel_16.setBounds(41, 472, 56, 26);
		contentPane.add(lblNewLabel_16);
		
		lblNewLabel_12 = new JLabel("cake");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(313, 446, 51, 31);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_14 = new JLabel("Cost:");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(41, 290, 56, 26);
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_13 = new JLabel("Raspberry swiss roll");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(263, 262, 177, 26);
		contentPane.add(lblNewLabel_13);
		
		lblNewLabel_11 = new JLabel("Gourmet strawberry");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(263, 428, 177, 31);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_10 = new JLabel("Simple strawberry pie");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(41, 428, 207, 31);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_9 = new JLabel("Pannacotta");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(74, 262, 118, 26);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_8 = new JLabel("it cozy for the customers!");
		lblNewLabel_8.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(510, 103, 320, 43);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_7 = new JLabel("Decorate Henry's Cafe &  make");
		lblNewLabel_7.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		lblNewLabel_7.setBounds(469, 58, 368, 60);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(new ImageIcon("img/cake.png").getImage()
				.getScaledInstance(90, 90, Image.SCALE_DEFAULT)));
		lblNewLabel_6.setBounds(303, 321, 118, 105);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(new ImageIcon("img/pinkkikaaretorttu.png").getImage()
				.getScaledInstance(90, 90, Image.SCALE_DEFAULT)));
		lblNewLabel_5.setBounds(303, 153, 118, 105);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(new ImageIcon("img/strawberrytopcake.png").getImage()
				.getScaledInstance(90, 90, Image.SCALE_DEFAULT)));
		lblNewLabel_4.setBounds(93, 321, 115, 105);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(new ImageIcon("img/pannacotta.png").getImage()
				.getScaledInstance(90, 90, Image.SCALE_DEFAULT)));
		lblNewLabel_3.setBounds(93, 153, 115, 105);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("tasty dishes!");
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(171, 109, 173, 31);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("Earn more money by these new");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		lblNewLabel.setBounds(56, 51, 384, 74);
		contentPane.add(lblNewLabel);
		goback.setFont(new Font("Tahoma", Font.BOLD, 25));
		goback.setBounds(41, 547, 97, 43);
		contentPane.add(goback);
		
		kolikkokuva = new JLabel("");
		kolikkokuva.setIcon(new ImageIcon(new ImageIcon("img/coin.jpg").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
		kolikkokuva.setBounds(658, 547, 69, 56);
		contentPane.add(kolikkokuva);
		
		lblNewLabel_1 = new JLabel("x");
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 35));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(812, 559, 41, 31);
		contentPane.add(lblNewLabel_1);
		
		labeli3 = new JLabel("");
		labeli3.setBounds(0, 0, 882, 603);
		labeli3.setIcon(new ImageIcon(new ImageIcon("img/kirjakuva.png").getImage().getScaledInstance(880, 580, Image.SCALE_DEFAULT)));
		contentPane.add(labeli3);
	}
}
