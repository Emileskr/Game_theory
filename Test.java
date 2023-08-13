package gameTheory;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine myGame = new Engine(1234);
		Player player1 = new ConstantPlayer(true);
		myGame.addPlayer(player1);
		Player player2 = new ConstantPlayer(false);
		myGame.addPlayer(player2);
		Player player3 = new BonusSeekingPlayer();
		myGame.addPlayer(player3);
		Player player4 = new BonusSeekingPlayer();
		myGame.addPlayer(player4);
		Player player5 = new BonusSeekingPlayer();
		myGame.addPlayer(player5);
		Player player6 = new BonusSeekingPlayer();
		myGame.addPlayer(player6);
		Player player7 = new RandomPlayer(321, 0.567);
		myGame.addPlayer(player7);
		Player player8 = new RandomPlayer(321, 0.678);
		myGame.addPlayer(player8);
		
		
		try (PrintWriter myWriter = new PrintWriter("output.csv"))
		{
			CSVLogger csv = new CSVLogger(myGame,myWriter,true,false);
			csv.printHeader();
			csv.printData();
			for (int t=0; t < 100; t++){
				myGame.step();
				csv.printData();
			}
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
