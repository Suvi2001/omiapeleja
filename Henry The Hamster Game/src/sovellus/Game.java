package sovellus;

import java.util.Random;
import javax.swing.JFrame;

class Game extends MainGame {
	public static Random random= new Random();
	protected static void alkuArvot() {
		int startmood = 20; int startfever = 99; int starthygiene = 20; int starthunger = 100;
		hunger_progressBar.setValue(starthunger);
		hygiene_progressBar.setValue(starthygiene);
		fever_progressBar.setValue(startfever);
		mood_progressBar.setValue(startmood);
	}
	protected static void hamsteriPeseytyy() {
		hygiene_progressBar.setValue(100);
		
		int randomNumber = random.nextInt(99);
		mood_progressBar.setValue(randomNumber);
	}
	
    protected static void hamsteriLeikkii() {
    	hygiene_progressBar.setValue(20);
    	mood_progressBar.setValue(90);

    	int randomNumber = random.nextInt(99);
		hunger_progressBar.setValue(randomNumber);
		fever_progressBar.setValue(randomNumber);
    }
    protected static void hamsteriaSilitetaan() {
    	int randomNumber = random.nextInt(99);
		mood_progressBar.setValue(randomNumber);
		fever_progressBar.setValue(randomNumber);
    }
    protected static void hamsteriSyo() {
    	hunger_progressBar.setValue(0);
    }
 }