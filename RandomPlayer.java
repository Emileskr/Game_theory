package gameTheory;

import java.util.List;
import java.util.Random;

public class RandomPlayer implements Player {

	private final double probability;
	private final Random ran;
	/**
	 * constructor
	 * @param seed
	 * @param investProb
	 */
	public RandomPlayer(long seed, double investProb) {
		if (investProb<=0 || investProb >=1) {
			throw new IllegalArgumentException("Probability must be between 0 and 1");
		}
		probability = investProb;
		ran = new Random(seed);
	}
	
	@Override
	public void newGame(int startBudget, int numPlayers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newRound(int round, int numPlayers, int threshold, List<Double> reputations) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean willInvest(double reputationOther) {
		if (ran.nextDouble()<=probability) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public void receivePayoff(int payoffReceived, int newBudget, boolean isBonus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return "RandomPlayer";
	}

}
