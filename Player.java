package gameTheory;

import java.util.List;

/**
 * interface for a Player in the investment game
 * @author Emile
 *
 */
public interface Player
{
	/**
	 * Indicates the beginning of a new game to player
	 * @param startBudget the budget with which the player starts the game
	 * @param numPlayers the number of players participating in the game
	 */
	public void newGame(int startBudget, int numPlayers);
	
	/**
	 * Indicates the beginning of a new round in the game
	 * @param round The index of the current round. The first round is round 0.
	 * @param numPlayers The number of players still active at this point in the game.
	 * @param threshold The number of players who need to cooperate to obtain a bonus payoff
	 * @param reputations All reputations of players who are currently active.
	 */
	public void newRound(int round, int numPlayers, int threshold, List<Double> reputations);
	
	/**
	 * Asks the player whether it will invest during a match.
	 * @param reputationOther The reputation of the other player at the beginning of the current round
	 * @return Whether or not the implemented player will invest.
	 */
	public boolean willInvest(double reputationOther);
	
	/**
	 * Is called to notify the player has received some payoff. This happens either after a match
	 * is played with another player or at the end of a round to indicate which bonus payoff
	 * was received.
	 * @param payoffReceived The payoff the player has received
	 * @param newBudget The new budget of the player after adding payoffReceived to the old budget
	 * @param isBonus Indicates whether this is the possible bonus at the end of a round (true)
	 *                or just the payoff received in a match against another player (false).
	 */
	public void receivePayoff(int payoffReceived, int newBudget, boolean isBonus);
	
	/**
	 * Defines a name for this player. Mainly used for data export.
	 * @return The name of this player.
	 */
	public String getName();
}

