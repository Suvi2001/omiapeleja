package sovellus;

import sun.audio.*;
import java.io.*;

public class Music{

  private static AudioStream theStream;

  //  Main method
  public static void main(String[] args){

    try{
      theStream = new AudioStream(new FileInputStream("jaunty-gumption-by-kevin-macleod-from-filmmusic-io.mp3"));
      AudioPlayer.player.start(theStream);
    }
    catch(Exception e){
    	e.printStackTrace();
    	}
  }//end main

public static void playMusic() {
	  try{
	      theStream = new AudioStream(new FileInputStream("/src/audio/jaunty-gumption-by-kevin-macleod-from-filmmusic-io.mp3"));
	      AudioPlayer.player.start(theStream);
	    }
	    catch(Exception e){
	    	//e.printStackTrace();
	    	System.out.println("ERROR");
	    	}
}

}//end AudioTest class
