# Game_theory

## Project which simulates the investment game. Engine file is missing.

In this project the Player interface is created. There are several classes which implement this interface and creates a few types of players.
Every player has it's own budget and reputation. The game goes as following:
- people are divided into pairs
- people can join each week and invest 4 coins or do nothing;
- both players pay 2 coins as tax
- if both invest - they get 12 coins, if one invests - 6 coins and if noone invests - 0
- the return amount is shared equally between the two players
- if enough investmens are made - players receive a bonus
- when player has no money he cannot play anymore.

Random player in every match either invests or not - it is chosen randomly.
Constant player either always invests, or never invests.
Bonus seeking player seeks to invest just enough times to make sure that the bonus will be paid out this round.
MatchOutcome class is used for computing payoffs of a single match.
CSVLogger class is used for printing the data of players, their reputation, and budged.

The simulation of the game is runned by Engine class, which is missing.
