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
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class HenryDead extends Dateprint {

	private JPanel contentPane;
	private JLabel tausta;
	private JLabel hamsterikuva;
	private JButton nappi1;
	private JLabel lblNewLabel;
	private JLabel lblHenryTheHamster;
	private JLabel lblNewLabel_1;
	String filename1 = "src\\sovellus\\files\\date.txt";
	private JTextPane alkupvm;
	private JTextPane loppupvm;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public HenryDead() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {

				try {
					Scanner sc = new Scanner(new File(filename1));
					String str = "";
					while (sc.hasNext()) {
						str = str + sc.nextLine() + "\n";
					}
					alkupvm.setText(str);
					loppupvm.setText((Files.readAllLines(Paths.get(filename1)).get(2)));
				} catch (Exception exp) {

				}
			}
		});

		setTitle("R.I.P. Henry The Hamster!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/kalloikoni.PNG"));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		nappi1 = new JButton("Exit");
		nappi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (nappi1.isEnabled()) {
					System.exit(0);
				}
			}
		});

		loppupvm = new JTextPane();
		loppupvm.setEditable(false);
		loppupvm.setBounds(285, 291, 185, 22);
		contentPane.add(loppupvm);

		alkupvm = new JTextPane();
		alkupvm.setEditable(false);
		alkupvm.setBounds(285, 231, 185, 22);
		contentPane.add(alkupvm);

		lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(339, 262, 56, 16);
		contentPane.add(lblNewLabel_1);

		lblHenryTheHamster = new JLabel("Henry The Hamster");
		lblHenryTheHamster.setHorizontalAlignment(SwingConstants.CENTER);
		lblHenryTheHamster.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblHenryTheHamster.setBounds(258, 156, 235, 38);
		contentPane.add(lblHenryTheHamster);

		lblNewLabel = new JLabel("R.I.P.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(315, 89, 122, 38);
		contentPane.add(lblNewLabel);
		nappi1.setFont(new Font("Tahoma", Font.BOLD, 18));
		nappi1.setBounds(271, 453, 192, 25);
		contentPane.add(nappi1);

		hamsterikuva = new JLabel("");
		hamsterikuva.setHorizontalAlignment(SwingConstants.CENTER);
		hamsterikuva.setIcon(new ImageIcon(
				new ImageIcon("src/img/gravephoto.jpg").getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT)));
		hamsterikuva.setBounds(57, 13, 625, 408);
		contentPane.add(hamsterikuva);

		tausta = new JLabel("");
		tausta.setBackground(Color.BLACK);
		tausta.setOpaque(true);
		tausta.setBounds(0, 0, 733, 503);
		contentPane.add(tausta);
	}
}
