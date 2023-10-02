package sovellus;

import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.io.BufferedReader;
import java.io.File;


class Dateprint extends Menu {
	protected static JButton nappi1;
	protected static void printDate() {
			String filename1 = "src\\sovellus\\files\\date.txt";
			try {
				java.util.Date date = new java.util.Date();
				FileWriter fwriter = new FileWriter(filename1, true);
				fwriter.write(date.toString() + "\n");
				fwriter.write("\n");
				fwriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	protected static void printDate1() {
		String filename1 = "src\\sovellus\\files\\date.txt";
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename1, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write("\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}