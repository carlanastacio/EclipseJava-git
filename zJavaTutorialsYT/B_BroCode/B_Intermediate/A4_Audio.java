package B_Intermediate;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class A4_Audio {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		Scanner scan = new Scanner(System.in);
		
		File file = new File("pop.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		String response = "";
		
		while(!response.equals("q")) {
		System.out.println("P for Play, Q for Quit, R for Reset, S for Stop");
		System.out.print("Enter your choice: ");
		response = scan.next().toLowerCase();
		
			switch(response) {
			
			case "p": clip.start(); break;
			case "q": clip.close(); break;
			case "r": clip.setFramePosition(0); break;
			case "s": clip.close(); break;
			
			default: System.out.println("\nInvalid input! Choose the letters mentioned above!\n");
			}
		}
		System.out.println("Bye!");
		scan.close();
	}

}

/*
package B_Intermediate;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class A4_Audio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		File file = new File("pop.wav");
		if (!file.exists()) {
			System.out.println("Audio file not found: " + file.getPath());
			scan.close();
			return;
		}

		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);

			String response = "";

			while (!response.equals("q")) {
				System.out.println("P for Play, Q for Quit, R for Reset, S for Stop");
				System.out.print("Enter your choice: ");
				response = scan.next().toLowerCase();

				switch (response) {
					case "p":
						if (clip.getMicrosecondPosition() == clip.getMicrosecondLength()) {
							clip.setFramePosition(0); // Reset if at the end
						}
						clip.start();
						break;
					case "q":
						clip.close();
						break;
					case "r":
						clip.setFramePosition(0);
						break;
					case "s":
						clip.stop();
						break;
					default:
						System.out.println("\nInvalid input! Choose the letters mentioned above!\n");
				}
			}

			System.out.println("Bye!");
			scan.close();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			System.out.println("Error playing audio: " + e.getMessage());
		}
	}
}
*/
