package sovellus;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.SystemColor;

public class MainGame extends CharacterCustomization {

	protected static final File File = null;
	private JPanel contentPane;
	private JLabel tausta;
	protected static JLabel hamsterikuva;
	protected static JProgressBar hunger_progressBar;
	private JLabel lblNewLabel;
	protected static JProgressBar mood_progressBar;
	private JLabel lblMood;
	private JLabel lblHygiene;
	private JLabel lblFever;
	protected static JProgressBar hygiene_progressBar;
	protected static JProgressBar fever_progressBar;
	private JButton ruokaNappi;
	private JButton silitysNappi;
	private JButton suihkuNappi;
	private JButton juoksuNappi;
	protected static JButton nuotti;
	private static GameOver gameOver = new GameOver();
	private static AlternativeEnding alternativeending = new AlternativeEnding();

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
		setTitle("Henry The Hamster - Sick in bed");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 550);
		contentPane = new JPanel();
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/siemen.PNG"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		juoksuNappi = new JButton("");
		juoksuNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.hamsteriLeikkii();
				myJlabel.setImage();
				End.peliValmis();
				if (fever_progressBar.getValue() <= 5) {
					MainGame.this.setVisible(false);
					gameOver.setVisible(true);
				}
				if (mood_progressBar.getValue() <= 3) {
					Dateprint.printDate1();
					MainGame.this.setVisible(false);
					alternativeending.setVisible(true);
				}
			}
		});
		juoksuNappi.setIcon(new ImageIcon(MainGame.class.getResource("/img/hamsteri-pyora.PNG")));
		juoksuNappi.setBounds(575, 258, 130, 122);
		contentPane.add(juoksuNappi);

		suihkuNappi = new JButton("");
		suihkuNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.hamsteriPeseytyy();
				myJlabel.setImage();
				End.peliValmis();
				if (fever_progressBar.getValue() <= 5) {
					MainGame.this.setVisible(false);
					gameOver.setVisible(true);
				}
				if (mood_progressBar.getValue() <= 3) {
					Dateprint.printDate1();
					MainGame.this.setVisible(false);
					alternativeending.setVisible(true);
				}
			}
		});
		suihkuNappi.setIcon(new ImageIcon(MainGame.class.getResource("/img/suihku-kuva.png")));
		suihkuNappi.setBounds(575, 89, 130, 130);
		contentPane.add(suihkuNappi);

		silitysNappi = new JButton("");
		silitysNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.hamsteriaSilitetaan();
				myJlabel.setImage();
				End.peliValmis();
				if (fever_progressBar.getValue() <= 5) {
					MainGame.this.setVisible(false);
					gameOver.setVisible(true);
				}
				if (mood_progressBar.getValue() <= 3) {
					Dateprint.printDate1();
					MainGame.this.setVisible(false);
					alternativeending.setVisible(true);
				}
			}
		});
		silitysNappi.setIcon(new ImageIcon(MainGame.class.getResource("/img/kasi-sydan1.PNG")));
		silitysNappi.setBounds(12, 258, 121, 122);
		contentPane.add(silitysNappi);

		ruokaNappi = new JButton("");
		ruokaNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.hamsteriSyo();
				myJlabel.setImage();
				End.peliValmis();
				if (fever_progressBar.getValue() <= 5) {
					MainGame.this.setVisible(false);
					gameOver.setVisible(true);
				}
				if (mood_progressBar.getValue() <= 3) {
					Dateprint.printDate1();
					MainGame.this.setVisible(false);
					alternativeending.setVisible(true);
				}
			}
		});
		ruokaNappi.setIcon(new ImageIcon(MainGame.class.getResource("/img/hamsteri-ruoka.png")));
		ruokaNappi.setBounds(12, 89, 121, 137);
		contentPane.add(ruokaNappi);

		fever_progressBar = new JProgressBar();
		fever_progressBar.setMaximum(100);
		fever_progressBar.setForeground(Color.red);
		fever_progressBar.setBounds(476, 454, 205, 24);
		contentPane.add(fever_progressBar);

		hygiene_progressBar = new JProgressBar();
		hygiene_progressBar.setMaximum(100);
		hygiene_progressBar.setForeground(Color.blue);
		hygiene_progressBar.setBounds(476, 417, 205, 24);
		contentPane.add(hygiene_progressBar);

		lblFever = new JLabel("Fever:");
		lblFever.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFever.setBounds(385, 454, 94, 24);
		contentPane.add(lblFever);

		lblHygiene = new JLabel("Hygiene:");
		lblHygiene.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHygiene.setBounds(385, 417, 94, 24);
		contentPane.add(lblHygiene);

		nuotti = new JButton("");
		nuotti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music.playMusic();
			}
		});
		nuotti.setIcon(new ImageIcon(
				new ImageIcon("src/img/nuottikuva.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
		nuotti.setBounds(650, 13, 44, 37);
		contentPane.add(nuotti);

		mood_progressBar = new JProgressBar();
		mood_progressBar.setMaximum(100);
		mood_progressBar.setForeground(Color.orange);
		mood_progressBar.setBounds(127, 454, 205, 24);
		contentPane.add(mood_progressBar);

		lblMood = new JLabel("Mood:");
		lblMood.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMood.setBounds(46, 454, 94, 24);
		contentPane.add(lblMood);

		lblNewLabel = new JLabel("Hunger:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(46, 417, 94, 24);
		contentPane.add(lblNewLabel);

		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(46, 417, 94, 24);
		contentPane.add(lblNewLabel);

		hunger_progressBar = new JProgressBar();
		hunger_progressBar.setMaximum(100);
		hunger_progressBar.setForeground(Color.black);
		hunger_progressBar.setBounds(127, 417, 205, 24);
		contentPane.add(hunger_progressBar);

		hamsterikuva = new JLabel("");
		// hamsterikuva.setIcon(new ImageIcon(
		// new ImageIcon("src/img/hamster-sad.jpg").getImage().getScaledInstance(400,
		// 400, Image.SCALE_DEFAULT)));
		// hamsterikuva.setIcon(new ImageIcon("src/img/hamster-sad.jpg", "Kuva"));
		// hamsterikuva.repaint();
		myJlabel.setImage();
		hamsterikuva.setBounds(155, 30, 408, 370);
		contentPane.add(hamsterikuva);

		tausta = new JLabel("");
		tausta.setBounds(0, 0, 733, 503);
		tausta.setBackground(SystemColor.info);
		tausta.setOpaque(true);
		contentPane.add(tausta);
		setContentPane(contentPane);
	}
}