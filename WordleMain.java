package world_Multiplayer;

import static java.lang.System.*;
import java.lang.*;
import java.io.File;
import java.util.*;
import javax.swing.JFrame;

class WordleMain {

	public static void main(String[] args) {
		
		JFrame theFrame = new JFrame();
		WordleDraw wordleDraw = new WordleDraw();
		
		//size
		theFrame.setSize(800, 600);
		
		//center the frame
		theFrame.setLocationRelativeTo(null);
		
		//turns of title bar
		//theFrame.setUndecorated(true);
		
		theFrame.add(wordleDraw);
		theFrame.setVisible(true);
		
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		/*Scanner scan = new Scanner(new File("WordBank.txt"));
		
		ArrayList<String> al = new ArrayList<String>();
		
		while(scan.hasNextLine())
			al.add(scan.nextLine());
		
		int ranNum = (int)(Math.random() * al.size() - 1);
		
		out.println("" + ranNum + " " + al.get(ranNum));*/
		
	}

}
