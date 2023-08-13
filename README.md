# Game_theory

## Project which simulates the investment game. The Engine class file is missing.

In this project, the Player interface is created. There are several classes that implement this interface and create a few types of players.
Every player has their own budget and reputation. The game goes as follows:
- People are divided into pairs
- People can join each week and invest 4 coins or do nothing;
- Both players pay 2 coins as tax
- if both invest - they get 12 coins, if one invests - 6 coins, and if no one invests - 0
- the return amount is shared equally between the two players
- If enough investments are made - players receive a bonus
- When a player has no money he cannot play anymore.

The random player in every match either invests or not - it is chosen randomly.
The constant player either always invests, or never invests.
Bonus-seeking player seeks to invest just enough times to make sure that the bonus will be paid out this round.
MatchOutcome class is used for computing payoffs of a single match.
CSVLogger class is used for printing the data of players, their reputation, and budget.

The simulation of the game is runned by the Engine class, which is missing.
