package sovellus;

import java.util.Random;

class Game extends LoveTester {
	static void generateNumber() {
	Random random= new Random();
	
    int randomNumber;
    
    randomNumber = random.nextInt(101);
    lblNewLabel_3.setText(Integer.toString(randomNumber));
    
    if (randomNumber <= 10) {
    	lblNewLabel_5.setText("You can do better..");
    }
    if (randomNumber >= 11 && randomNumber <= 40) {
    	lblNewLabel_5.setText("Getting there!");
    }
    if (randomNumber >= 41 && randomNumber <= 60) {
    	lblNewLabel_5.setText("They like you!");
    }
    if (randomNumber >= 61 && randomNumber <= 80) {
    	lblNewLabel_5.setText("Time for a date!");
    }
    if (randomNumber >= 81 && randomNumber <= 99) {
    	lblNewLabel_5.setText("It might be love!");
    }
    if (randomNumber == 100) {
    	lblNewLabel_5.setText("Perfect match!");
    }
}}
