package gameTheory;

import java.io.PrintWriter;
import java.util.ArrayList;

public class CSVLogger {

	
	private boolean printBudget;
	private boolean printReputation;
	private Engine game;
	private PrintWriter print;
	/**
	 * constructor
	 * @param e 
	 * @param writer
	 * @param budget
	 * @param reputations
	 */
	public CSVLogger(Engine e, PrintWriter writer, boolean budget, boolean reputations) {
		printBudget = budget;
		printReputation = reputations;
		game = e;
		print = writer;
	}
	
	public void printHeader() {
		print.print("Round, ");
		ArrayList<Player> playersList = game.getPlayers();
		if (printBudget) {
			for (int i = 0; i < playersList.size(); i++) {
				print.print((playersList.get(i)).getName() + " budget, ");
			}
		}
		if (printReputation) {
			for (int i = 0; i < playersList.size(); i++) {
				print.print((playersList.get(i)).getName() + " reputation, ");
			}
		}
		print.println();
	}
	
	public void printData() {
		print.print(game.getCurrentRound() + ", ");
		ArrayList<Player> playersList = game.getPlayers();
		if (printBudget) {
			for (int i = 0; i < playersList.size(); i++) {
				print.print(game.getBudget(playersList.get(i)) + ", ");
			}
		}
		if (printReputation) {
			for (int i = 0; i < playersList.size(); i++) {
				print.printf("%.2f", game.getReputation(playersList.get(i)));
				print.print(", ");
			}
		}
		print.println();
	}
}
