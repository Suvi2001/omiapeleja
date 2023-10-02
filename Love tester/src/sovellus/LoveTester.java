package sovellus;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//String filename = "depositphotos_11986716-stock-illustration-vector-heart-symbol.jpg";

public class LoveTester extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	public static JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;	
	public static JLabel lblNewLabel_5;
	private JLabel lblNewLabel_sydan;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoveTester frame = new LoveTester();
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
	public LoveTester() {
		setTitle("Love Tester - The Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\depositphotos_11986716-stock-illustration-vector-heart-symbol.jpg"));
		contentPane.setLayout(null);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Rockwell Nova", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(360, 315, 2100, 32);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setFont(new Font("Rockwell Nova", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(449, 131, 38, 32);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Rockwell Nova", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(400, 131, 38, 32);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_sydan = new JLabel("");
		lblNewLabel_sydan.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_sydan.setBounds(226, 13, 393, 284);
		lblNewLabel_sydan.setIcon(new ImageIcon(new ImageIcon("img\\simple-red-heart.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
		contentPane.add(lblNewLabel_sydan);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(226, 13, 479, 289);
		lblNewLabel_sydan.setIcon(new ImageIcon(new ImageIcon("img\\simple-red-heart.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_2 = new JLabel("Enter his/her/their name:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Rockwell Nova", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(490, 343, 262, 40);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("Enter your name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Rockwell Nova", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(139, 343, 191, 40);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Play!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				     if (textField_1.getText().equals("") || textField.getText().equals("")) {
								JOptionPane.showMessageDialog(null, "Write a name!!", "Error",
										JOptionPane.ERROR_MESSAGE);
							} else {
						 Game.generateNumber();
				    	 lblNewLabel_4.setVisible(true);
				    	 btnNewButton.setEnabled(false);
				     }
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Write a name!!", "Error",
						JOptionPane.ERROR_MESSAGE);
		}}});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(340, 451, 175, 32);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(545, 388, 160, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(157, 388, 160, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(5, 5, 802, 513);
		lblNewLabel.setBackground(new Color(255, 182, 193));
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
	
	}
}
