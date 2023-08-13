package gameTheory;

import java.util.List;

public class ConstantPlayer implements Player {

	
	private final boolean investing;

	/**
	 * constructor
	 * @param b is the player always (t) invest or never (f)
	 */
	public ConstantPlayer (boolean b) {
		investing = b;
	}
	
	@Override
	public void newGame(int startBudget, int numPlayers) {
		
	}

	@Override
	public void newRound(int round, int numPlayers, int threshold, List<Double> reputations) {
		
	}

	@Override
	public boolean willInvest(double reputationOther) {
		return investing;
	}

	@Override
	public void receivePayoff(int payoffReceived, int newBudget, boolean isBonus) {
		
	}

	@Override
	public String getName() {
		if (investing) {
			return "InvestPlayer";
		} else {
			return "RejectPlayer";
		}
		
	}

}
