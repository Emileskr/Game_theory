package gameTheory;

public class MatchOutcome {

	private final Player player1;
	private final Player player2;
	private final boolean p1invests;
	private final boolean p2invests;
	/**
	 * constructor
	 * @param p1 first player
	 * @param rep1 first player's reputation
	 * @param p2 second player
	 * @param rep2 second player's reputation
	 */
	public MatchOutcome (Player p1, double rep1, Player p2, double rep2) {
		if (p1 == p2 || p1 == null || p2 == null) {
			throw new IllegalArgumentException();
		}
		player1 = p1;
		player2 = p2;
		p1invests = p1.willInvest(rep2);
		p2invests = p2.willInvest(rep1);
	}
	
	/**
	 * checks if the player invested in the current match
	 * @param p the player to check
	 * @return true if invested, false if rejected
	 */
	public boolean didInvest(Player p) {
		if (p != player1 && p != player2) {
			throw new IllegalArgumentException("The player is not a part of this match");
		}
		if (p == player1) {
			return p1invests;
		} else {
			return p2invests;
		}
		
	}
	
	/**
	 * gets the amount of payoff after the match
	 * @param p the player to check
	 * @return the amount of payoff after the match
	 */
	public int getPayoff(Player p) {
		if (p != player1 && p != player2) {
			throw new IllegalArgumentException("The player is not a part of this match");
		}
		if (p1invests && p2invests) {
			return 0;
		} else if (!p1invests && !p2invests) {
			return -2;
		} else {
			if ((p == player1 && p1invests) || (p == player2 && p2invests)) {
				return -3;
			} else {
				return 1;
			}
		}
	}

}
