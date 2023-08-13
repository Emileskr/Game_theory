package gameTheory;

import java.util.List;

public class BonusSeekingPlayer implements Player {

	private double reputation;
	/**
	 * constructor
	 */
	public BonusSeekingPlayer () {
		
	}
	
	@Override
	public void newGame(int startBudget, int numPlayers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newRound(int round, int numPlayers, int threshold, List<Double> reputations) {
		int k = numPlayers - (threshold/numPlayers) - 1;
		reputation = reputations.get(k);
		
	}

	@Override
	public boolean willInvest(double reputationOther) {
		if (reputation <= reputationOther) {
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
		return "BonusSeekingPlayer";
	}

}
