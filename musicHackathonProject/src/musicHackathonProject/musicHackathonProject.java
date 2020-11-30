package musicHackathonProject;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class musicHackathonProject {

	public static void main(String[] args) {

		//Pitch
		String[] path = {	System.getProperty("user.home")+  "/Documents/Perfect_Pitch/wavnotes/c3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes/c-3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes/d3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes/d-3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes/e3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes/f3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes/f-3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes/g3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes/g-3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes/a3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes1/a-3.wav",
							System.getProperty("user.home") + "/Documents/Perfect_Pitch/wavnotes/b3.wav"};
		
		//Chords
		String[] path2 = {	System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/C.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/CS.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/D.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/DS.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/E.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/F.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/FS.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/G.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/GS.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/A.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/AS.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Major/B.wav",
		
		System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/Cm.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/CSm.wav",System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/Dm.wav",System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/DSm.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/Em.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/Fm.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/FSm.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/Gm.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/GSm.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/Am.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/ASm.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Minor/Bm.wav", 

		
		System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/C7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/CS7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/D7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/DS7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/E7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/F7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/FS7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/G7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/GS7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/A7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/AS7.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/Dom7/B7.wav", 

		
		System.getProperty("user.home")   + "/Documents/Perfect_Pitch/dim/co.wav",  System.getProperty("user.home") + "/Documents/Perfect_Pitch/dim/cso.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/dim/do.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/dim/dSo.wav",System.getProperty("user.home") + "/Documents/Perfect_Pitch/dim/eo.wav",System.getProperty("user.home") + "/Documents/Perfect_Pitch/dim/fo.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/dim/fSo.wav", System.getProperty("user.home")    + "/Documents/Perfect_Pitch/dim/go.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/dim/gSo.wav", System.getProperty("user.home")    + "/Documents/Perfect_Pitch/dim/ao.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/dim/aSo.wav", System.getProperty("user.home")    + "/Documents/Perfect_Pitch/dim/bo.wav",  

		
		System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/C+.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/CS+.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/D+.wav",System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/DS+.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/E+.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/F+.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/FS+.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/G+.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/GS+.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/A+.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/AS+.wav", System.getProperty("user.home") + "/Documents/Perfect_Pitch/aug/B+.wav"
				};
		
		//Chords
		String[] cM = { "C major", "B sharp major", "B# major" };
		String[] cSM = { "C# major", "Db major", "c sharp major", "d flat major" };
		String[] dM = { "D major" };
		String[] dSM = { "D# major", "D sharp major", "Eb major", "E flat major" };
		String[] eM = { "E major", "F flat major", "Fb major" };
		String[] fM = { "F major", "E sharp major", "E# major" };
		String[] fSM = { "F# major", "F sharp major", "G flat major", "Gb major" };
		String[] gM = { "G major" };
		String[] gSM = { "G# major", "G Sharp major", "Ab major", "A flat major" };
		String[] aM = { "A major" };
		String[] aSM = { "A# major", "A sharp major", "Bb major", "B flat major" };
		String[] bM = { "B major", "c flat major", "Cb major" };
		
		String[] cm = { "C minor", "B sharp minor", "B# minor" };
		String[] cSm = { "C# minor", "Db minor", "c sharp minor", "d flat minor" };
		String[] dm = { "D minor" };
		String[] dSm = { "D# minor", "D sharp minor", "Eb minor", "E flat minor" };
		String[] em = { "E minor", "F flat minor", "Fb minor" };
		String[] fm = { "F minor", "E sharp minor", "E# minor" };
		String[] fSm = { "F# minor", "F sharp minor", "G flat minor", "Gb minor" };
		String[] gm = { "G minor" };
		String[] gSm = { "G# minor", "G Sharp minor", "Ab minor", "A flat minor" };
		String[] am = { "A minor" };
		String[] aSm = { "A# minor", "A sharp minor", "Bb minor", "B flat minor" };
		String[] bm = { "B minor", "c flat minor", "Cb minor" };
		
		String[] c7 = { "C Dominant 7th", "B sharp Dominant 7th", "B# Dominant 7th" };
		String[] cS7 = { "C# Dominant 7th", "Db Dominant 7th", "c sharp Dominant 7th", "d flat Dominant 7th" };
		String[] d7 = { "D Dominant 7th" };
		String[] dS7 = { "D# Dominant 7th", "D sharp Dominant 7th", "Eb Dominant 7th", "E flat Dominant 7th" };
		String[] e7 = { "E Dominant 7th", "F flat Dominant 7th", "Fb Dominant 7th" };
		String[] f7 = { "F Dominant 7th", "E sharp Dominant 7th", "E# Dominant 7th" };
		String[] fS7 = { "F# Dominant 7th", "F sharp Dominant 7th", "G flat Dominant 7th", "Gb Dominant 7th" };
		String[] g7 = { "G Dominant 7th" };
		String[] gS7 = { "G# Dominant 7th", "G Sharp Dominant 7th", "Ab Dominant 7th", "A flat Dominant 7th" };
		String[] a7 = { "A Dominant 7th" };
		String[] aS7 = { "A# Dominant 7th", "A sharp Dominant 7th", "Bb Dominant 7th", "B flat Dominant 7th" };
		String[] b7 = { "B Dominant 7th", "c flat Dominant 7th", "Cb Dominant 7th" };
		
		String[] c0 = { "C Diminished", "B sharp Diminished", "B# Diminished" };
		String[] cS0 = { "C# Diminished", "Db Diminished", "c sharp Diminished", "d flat Diminished" };
		String[] d0 = { "D Diminished" };
		String[] dS0 = { "D# Diminished", "D sharp Diminished", "Eb Diminished", "E flat Diminished" };
		String[] e0 = { "E Diminished", "F flat Diminished", "Fb Diminished" };
		String[] f0 = { "F Diminished", "E sharp Diminished", "E# Diminished" };
		String[] fS0 = { "F# Diminished", "F sharp Diminished", "G flat Diminished", "Gb Diminished" };
		String[] g0 = { "G Diminished" };
		String[] gS0 = { "G# Diminished", "G Sharp Diminished", "Ab Diminished", "A flat Diminished" };
		String[] a0 = { "A Diminished" };
		String[] aS0 = { "A# Diminished", "A sharp Diminished", "Bb Diminished", "B flat Diminished" };
		String[] b0 = { "B Diminished", "c flat Diminished", "Cb Diminished" };
		
		String[] cA = { "C Augmented", "B sharp Augmented", "B# Augmented" };
		String[] cSA = { "C# Augmented", "Db Augmented", "c sharp Augmented", "d flat Augmented" };
		String[] dA = { "D Augmented" };
		String[] dSA = { "D# Augmented", "D sharp Augmented", "Eb Augmented", "E flat Augmented" };
		String[] eA = { "E Augmented", "F flat Augmented", "Fb Augmented" };
		String[] fA = { "F Augmented", "E sharp Augmented", "E# Augmented" };
		String[] fSA = { "F# Augmented", "F sharp Augmented", "G flat Augmented", "Gb Augmented" };
		String[] gA = { "G Augmented" };
		String[] gSA = { "G# Augmented", "G Sharp Augmented", "Ab Augmented", "A flat Augmented" };
		String[] aA = { "A Augmented" };
		String[] aSA = { "A# Augmented", "A sharp Augmented", "Bb Augmented", "B flat Augmented" };
		String[] bA = { "B Augmented", "c flat Augmented", "Cb Augmented" };
		
		
		

		// musicObject.playMusic(path);

		// soundArray[] notes = {c, cS, d, dS, e, f, fS, g, gS, a, aS, b};

		//Pitch
		String[] c = { "C", "B sharp", "B#" };
		String[] cS = { "C#", "Db", "c sharp", "d flat" };
		String[] d = { "D" };
		String[] dS = { "D#", "D sharp", "Eb", "E flat" };
		String[] e = { "E", "F flat", "Fb" };
		String[] f = { "F", "E sharp", "E#" };
		String[] fS = { "F#", "F sharp", "G flat", "Gb" };
		String[] g = { "G" };
		String[] gS = { "G#", "G Sharp", "Ab", "A flat" };
		String[] a = { "A" };
		String[] aS = { "A#", "A sharp", "Bb", "B flat" };
		String[] b = { "B", "c flat", "Cb" };

		Object[] buttons = { "Play Sound", "OK", "Quit" };
		Object[] start = { "Pitch", "Chords", "Quit" };

		Scanner input = new Scanner(System.in);

		Random rand = new Random();

		int rounds;

		int restart;

		int q;

		String answer = "";
		
		JPanel panel2 = new JPanel();
		panel2.add(new JLabel("What would you like to be tested on?"));
		
		int p = JOptionPane.showOptionDialog(null, panel2, "Perfect Pitch", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, start, null);
		
		if (p==JOptionPane.YES_OPTION)
		// Pitch tester
		{
		do {

			rounds = Integer.parseInt(JOptionPane.showInputDialog(null, "How many rounds would you like to play?:",
					"Rounds", JOptionPane.QUESTION_MESSAGE));

			// System.out.println("How many rounds would you like to play?:");
			// rounds = input.nextInt();

			for (int i = 1; i <= rounds; i++) {
				int noteOutput = rand.nextInt(11);

				MusicStuff musicObject = new MusicStuff();

				musicObject.playMusic(path[noteOutput]);

				// System.out.play(notes[noteOutput]);
				// System.out.println("What note is this? Enter letter name. (ex. c sharp, c#, d
				// flat, db)");
				// String answer = input.next();

				JPanel panel = new JPanel();
				panel.add(new JLabel("What note is this? Enter letter name. (ex. c sharp, c#, d flat, db)"));
				JTextField textField = new JTextField(10);
				panel.add(textField);
				
				do {
				
				q = JOptionPane.showOptionDialog(null, panel, "Perfect Pitch", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, buttons, null);
				
				if (q == JOptionPane.YES_OPTION) {
					musicObject.playMusic(path[noteOutput]);
				} 
				else if (q == JOptionPane.NO_OPTION) {
					answer = textField.getText();
				}
				} 
				while (q == JOptionPane.YES_OPTION);
				
				
				if (q == JOptionPane.CANCEL_OPTION) {
					break;
				} 
				
				// Corrections
				
				if (noteOutput == 0) {

					if (answer.equalsIgnoreCase(c[0]) || answer.equalsIgnoreCase(c[1])
							|| answer.equalsIgnoreCase(c[2])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {
						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + c[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);
					}

				} else if (noteOutput == 1) {

					if (answer.equalsIgnoreCase(cS[0]) || answer.equalsIgnoreCase(cS[1])
							|| answer.equalsIgnoreCase(cS[2]) || answer.equalsIgnoreCase(cS[3])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + cS[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				} else if (noteOutput == 2) {

					if (answer.equalsIgnoreCase(d[0])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + d[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				} else if (noteOutput == 3) {

					if (answer.equalsIgnoreCase(dS[0]) || answer.equalsIgnoreCase(dS[1])
							|| answer.equalsIgnoreCase(dS[2]) || answer.equalsIgnoreCase(dS[3])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + dS[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				} else if (noteOutput == 4) {

					if (answer.equalsIgnoreCase(e[0]) || answer.equalsIgnoreCase(e[1])
							|| answer.equalsIgnoreCase(e[2])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + e[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				}

				else if (noteOutput == 5) {

					if (answer.equalsIgnoreCase(f[0]) || answer.equalsIgnoreCase(f[1])
							|| answer.equalsIgnoreCase(f[2])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + f[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				} else if (noteOutput == 6) {

					if (answer.equalsIgnoreCase(fS[0]) || answer.equalsIgnoreCase(fS[1])
							|| answer.equalsIgnoreCase(fS[2]) || answer.equalsIgnoreCase(fS[3])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + fS[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				} else if (noteOutput == 7) {

					if (answer.equalsIgnoreCase(g[0])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + g[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				} else if (noteOutput == 8) {

					if (answer.equalsIgnoreCase(gS[0]) || answer.equalsIgnoreCase(gS[1])
							|| answer.equalsIgnoreCase(gS[2]) || answer.equalsIgnoreCase(gS[3])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + gS[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				} else if (noteOutput == 9) {

					if (answer.equalsIgnoreCase(a[0])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + a[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				} else if (noteOutput == 10) {

					if (answer.equalsIgnoreCase(aS[0]) || answer.equalsIgnoreCase(aS[1])
							|| answer.equalsIgnoreCase(aS[2]) || answer.equalsIgnoreCase(aS[3])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + aS[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				} else if (noteOutput == 11) {

					if (answer.equalsIgnoreCase(b[0]) || answer.equalsIgnoreCase(b[1])
							|| answer.equalsIgnoreCase(b[2])) {

						JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					} else {

						JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + b[0],
								"Incorrect!", JOptionPane.ERROR_MESSAGE);

					}

				}
			}
			restart = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Play Again",
					JOptionPane.YES_NO_OPTION);
		} 
		while (restart == 0);
		input.close();
		}
		
		if (p==JOptionPane.NO_OPTION) {
			
			
			do {
				
				rounds = Integer.parseInt(JOptionPane.showInputDialog(null, "How many rounds would you like to play?:",
						"Rounds", JOptionPane.QUESTION_MESSAGE));
				
			
				for (int i = 1; i <= rounds; i++) {
					
					int noteOutput = rand.nextInt(59);

					MusicStuff musicObject = new MusicStuff();

					musicObject.playMusic(path2[noteOutput]);
					
					JPanel panel = new JPanel();
					panel.add(new JLabel("What type of chord is this? (ex. C major, D# Dominant 7th, E flat diminished)"));
					JTextField textField = new JTextField(10);
					panel.add(textField);
					
					do {
						
						q = JOptionPane.showOptionDialog(null, panel, "Perfect Pitch", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, buttons, null);
						
						if (q == JOptionPane.YES_OPTION) {
							musicObject.playMusic(path2[noteOutput]);
						} 
						else if (q == JOptionPane.NO_OPTION) {
							answer = textField.getText();
						}
						} 
						while (q == JOptionPane.YES_OPTION);
					
					if (q == JOptionPane.CANCEL_OPTION) {
						break;
					} 
					// Corrections major

					if (noteOutput == 0) {

					  if (answer.equalsIgnoreCase(cM[0]) || answer.equalsIgnoreCase(cM[1])
					      || answer.equalsIgnoreCase(cM[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {
					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + cM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);
					  }

					} else if (noteOutput == 1) {

					  if (answer.equalsIgnoreCase(cSM[0]) || answer.equalsIgnoreCase(cSM[1])
					      || answer.equalsIgnoreCase(cSM[2]) || answer.equalsIgnoreCase(cSM[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + cSM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 2) {

					  if (answer.equalsIgnoreCase(dM[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + dM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 3) {

					  if (answer.equalsIgnoreCase(dSM[0]) || answer.equalsIgnoreCase(dSM[1])
					      || answer.equalsIgnoreCase(dSM[2]) || answer.equalsIgnoreCase(dSM[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + dSM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 4) {

					  if (answer.equalsIgnoreCase(eM[0]) || answer.equalsIgnoreCase(eM[1])
					      || answer.equalsIgnoreCase(eM[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + eM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					}

					else if (noteOutput == 5) {

					  if (answer.equalsIgnoreCase(fM[0]) || answer.equalsIgnoreCase(fM[1])
					      || answer.equalsIgnoreCase(fM[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + fM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 6) {

					  if (answer.equalsIgnoreCase(fSM[0]) || answer.equalsIgnoreCase(fSM[1])
					      || answer.equalsIgnoreCase(fSM[2]) || answer.equalsIgnoreCase(fSM[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + fS[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 7) {

					  if (answer.equalsIgnoreCase(gM[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + gM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 8) {

					  if (answer.equalsIgnoreCase(gSM[0]) || answer.equalsIgnoreCase(gSM[1])
					      || answer.equalsIgnoreCase(gSM[2]) || answer.equalsIgnoreCase(gSM[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + gSM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 9) {

					  if (answer.equalsIgnoreCase(aM[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + aM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 10) {

					  if (answer.equalsIgnoreCase(aSM[0]) || answer.equalsIgnoreCase(aSM[1])
					      || answer.equalsIgnoreCase(aSM[2]) || answer.equalsIgnoreCase(aSM[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + aSM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 11) {

					  if (answer.equalsIgnoreCase(bM[0]) || answer.equalsIgnoreCase(bM[1])
					      || answer.equalsIgnoreCase(bM[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + bM[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					}

					// Corrections minor

					if (noteOutput == 12) {

					  if (answer.equalsIgnoreCase(cm[0]) || answer.equalsIgnoreCase(cm[1])
					      || answer.equalsIgnoreCase(cm[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {
					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + cm[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);
					  }

					} else if (noteOutput == 13) {

					  if (answer.equalsIgnoreCase(cSm[0]) || answer.equalsIgnoreCase(cSm[1])
					      || answer.equalsIgnoreCase(cSm[2]) || answer.equalsIgnoreCase(cSm[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + cSm[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 14) {

					  if (answer.equalsIgnoreCase(dm[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + dm[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 15) {

					  if (answer.equalsIgnoreCase(dSm[0]) || answer.equalsIgnoreCase(dSm[1])
					      || answer.equalsIgnoreCase(dSm[2]) || answer.equalsIgnoreCase(dSm[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + dSm[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 16) {

					  if (answer.equalsIgnoreCase(em[0]) || answer.equalsIgnoreCase(em[1])
					      || answer.equalsIgnoreCase(em[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + em[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					}

					else if (noteOutput == 17) {

					  if (answer.equalsIgnoreCase(fm[0]) || answer.equalsIgnoreCase(fm[1])
					      || answer.equalsIgnoreCase(fm[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + fm[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 18) {

					  if (answer.equalsIgnoreCase(fSm[0]) || answer.equalsIgnoreCase(fSm[1])
					      || answer.equalsIgnoreCase(fSm[2]) || answer.equalsIgnoreCase(fSm[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + fSm[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 19) {

					  if (answer.equalsIgnoreCase(gm[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + gm[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 20) {

					  if (answer.equalsIgnoreCase(gSm[0]) || answer.equalsIgnoreCase(gSm[1])
					      || answer.equalsIgnoreCase(gSm[2]) || answer.equalsIgnoreCase(gSm[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + gSm[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 21) {

					  if (answer.equalsIgnoreCase(am[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + am[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 22) {

					  if (answer.equalsIgnoreCase(aSm[0]) || answer.equalsIgnoreCase(aSm[1])
					      || answer.equalsIgnoreCase(aSm[2]) || answer.equalsIgnoreCase(aSm[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + aSm[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 23) {

					  if (answer.equalsIgnoreCase(bm[0]) || answer.equalsIgnoreCase(b[1])
					      || answer.equalsIgnoreCase(bm[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + bm[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					}

					// Corrections dominant

					if (noteOutput == 24) {

					  if (answer.equalsIgnoreCase(c7[0]) || answer.equalsIgnoreCase(c7[1])
					      || answer.equalsIgnoreCase(c7[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {
					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + c7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);
					  }

					} else if (noteOutput == 25) {

					  if (answer.equalsIgnoreCase(cS7[0]) || answer.equalsIgnoreCase(cS7[1])
					      || answer.equalsIgnoreCase(cS7[2]) || answer.equalsIgnoreCase(cS7[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + cS7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 26) {

					  if (answer.equalsIgnoreCase(d7[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + d7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 27) {

					  if (answer.equalsIgnoreCase(dS7[0]) || answer.equalsIgnoreCase(dS7[1])
					      || answer.equalsIgnoreCase(dS7[2]) || answer.equalsIgnoreCase(dS7[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + dS7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 28) {

					  if (answer.equalsIgnoreCase(e7[0]) || answer.equalsIgnoreCase(e7[1])
					      || answer.equalsIgnoreCase(e7[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + e7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					}

					else if (noteOutput == 29) {

					  if (answer.equalsIgnoreCase(f7[0]) || answer.equalsIgnoreCase(f7[1])
					      || answer.equalsIgnoreCase(f7[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + f7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 30) {

					  if (answer.equalsIgnoreCase(fS7[0]) || answer.equalsIgnoreCase(fS7[1])
					      || answer.equalsIgnoreCase(fS7[2]) || answer.equalsIgnoreCase(fS7[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + fS[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 31) {

					  if (answer.equalsIgnoreCase(g7[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + g7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 32) {

					  if (answer.equalsIgnoreCase(gS7[0]) || answer.equalsIgnoreCase(gS7[1])
					      || answer.equalsIgnoreCase(gS7[2]) || answer.equalsIgnoreCase(gS7[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + gS7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 33) {

					  if (answer.equalsIgnoreCase(a7[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + a7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 34) {

					  if (answer.equalsIgnoreCase(aS7[0]) || answer.equalsIgnoreCase(aS7[1])
					      || answer.equalsIgnoreCase(aS7[2]) || answer.equalsIgnoreCase(aS7[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + aS7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 35) {

					  if (answer.equalsIgnoreCase(b7[0]) || answer.equalsIgnoreCase(b7[1])
					      || answer.equalsIgnoreCase(b7[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + b7[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					}

					// Corrections diminished

					if (noteOutput == 36) {

					  if (answer.equalsIgnoreCase(c0[0]) || answer.equalsIgnoreCase(c0[1])
					      || answer.equalsIgnoreCase(c0[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {
					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + c0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);
					  }

					} else if (noteOutput == 37) {

					  if (answer.equalsIgnoreCase(cS0[0]) || answer.equalsIgnoreCase(cS0[1])
					      || answer.equalsIgnoreCase(cS0[2]) || answer.equalsIgnoreCase(cS0[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + cS0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 38) {

					  if (answer.equalsIgnoreCase(d0[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + d0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 39) {

					  if (answer.equalsIgnoreCase(dS0[0]) || answer.equalsIgnoreCase(dS0[1])
					      || answer.equalsIgnoreCase(dS0[2]) || answer.equalsIgnoreCase(dS0[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + dS0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 40) {

					  if (answer.equalsIgnoreCase(e0[0]) || answer.equalsIgnoreCase(e0[1])
					      || answer.equalsIgnoreCase(e0[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + e0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					}

					else if (noteOutput == 41) {

					  if (answer.equalsIgnoreCase(f0[0]) || answer.equalsIgnoreCase(f0[1])
					      || answer.equalsIgnoreCase(f0[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + f0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 42) {

					  if (answer.equalsIgnoreCase(fS0[0]) || answer.equalsIgnoreCase(fS0[1])
					      || answer.equalsIgnoreCase(fS0[2]) || answer.equalsIgnoreCase(fS0[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + fS0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 43) {

					  if (answer.equalsIgnoreCase(g0[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + g0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 44) {

					  if (answer.equalsIgnoreCase(gS0[0]) || answer.equalsIgnoreCase(gS0[1])
					      || answer.equalsIgnoreCase(gS0[2]) || answer.equalsIgnoreCase(gS0[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + gS0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 45) {

					  if (answer.equalsIgnoreCase(a0[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + a0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 46) {

					  if (answer.equalsIgnoreCase(aS0[0]) || answer.equalsIgnoreCase(aS0[1])
					      || answer.equalsIgnoreCase(aS0[2]) || answer.equalsIgnoreCase(aS0[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + aS0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 47) {

					  if (answer.equalsIgnoreCase(b0[0]) || answer.equalsIgnoreCase(b0[1])
					      || answer.equalsIgnoreCase(b0[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + b0[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					}
					
					// Corrections augmented

					if (noteOutput == 48) {

					  if (answer.equalsIgnoreCase(cA[0]) || answer.equalsIgnoreCase(cA[1])
					      || answer.equalsIgnoreCase(cA[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {
					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + cA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);
					  }

					} else if (noteOutput == 49) {

					  if (answer.equalsIgnoreCase(cSA[0]) || answer.equalsIgnoreCase(cSA[1])
					      || answer.equalsIgnoreCase(cSA[2]) || answer.equalsIgnoreCase(cSA[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + cSA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 50) {

					  if (answer.equalsIgnoreCase(dA[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + dA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 51) {

					  if (answer.equalsIgnoreCase(dSA[0]) || answer.equalsIgnoreCase(dSA[1])
					      || answer.equalsIgnoreCase(dSA[2]) || answer.equalsIgnoreCase(dSA[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + dSA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 52) {

					  if (answer.equalsIgnoreCase(eA[0]) || answer.equalsIgnoreCase(eA[1])
					      || answer.equalsIgnoreCase(eA[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + eA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					}

					else if (noteOutput == 53) {

					  if (answer.equalsIgnoreCase(fA[0]) || answer.equalsIgnoreCase(fA[1])
					      || answer.equalsIgnoreCase(fA[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + fA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 54) {

					  if (answer.equalsIgnoreCase(fSA[0]) || answer.equalsIgnoreCase(fSA[1])
					      || answer.equalsIgnoreCase(fSA[2]) || answer.equalsIgnoreCase(fSA[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + fSA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 55) {

					  if (answer.equalsIgnoreCase(gA[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + gA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 56) {

					  if (answer.equalsIgnoreCase(gSA[0]) || answer.equalsIgnoreCase(gSA[1])
					      || answer.equalsIgnoreCase(gSA[2]) || answer.equalsIgnoreCase(gSA[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + gSA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 57) {

					  if (answer.equalsIgnoreCase(aA[0])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + aA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 58) {

					  if (answer.equalsIgnoreCase(aSA[0]) || answer.equalsIgnoreCase(aSA[1])
					      || answer.equalsIgnoreCase(aSA[2]) || answer.equalsIgnoreCase(aSA[3])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + aSA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);

					  }

					} else if (noteOutput == 59) {

					  if (answer.equalsIgnoreCase(bA[0]) || answer.equalsIgnoreCase(bA[1])
					      || answer.equalsIgnoreCase(bA[2])) {

					    JOptionPane.showMessageDialog(null, "Correct!", "Correct!", JOptionPane.PLAIN_MESSAGE);

					  } else {

					    JOptionPane.showMessageDialog(null, "Incorrect! Good try. The correct answer is " + bA[0],
					        "Incorrect!", JOptionPane.ERROR_MESSAGE);
					  }
					}
					
					
			}
				restart = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Play Again",
						JOptionPane.YES_NO_OPTION);
		}		
		while (restart == 0);
	}
}
	}