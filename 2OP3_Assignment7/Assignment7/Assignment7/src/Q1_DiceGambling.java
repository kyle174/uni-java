/* Assignment 7 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (40 marks)
    Use java to implement a class Dice, a class Gambler and a method that continue gambling between two gamblers until one
    gambler cannot afford the stake.

 */

// the class of Dice to play
class Dice {
    private int num_faces;

    Dice(){
        num_faces=6; // standard dice with 6 faces by default.
    }

    // implement the roll dice method that roll the dice once and return the value of the roll.
    // (5 marks)
    public int rollDice() {
        /* place your code here */
        // Return random number from 1 to num_faces
        return (int)(Math.random()*(num_faces))+1;
    }
}

// the class of gambler
class Gambler {
    public int money;
    public Dice die;

    Gambler(int initial_money) {
        money = initial_money;
        die = new Dice();
    }

    // use static method to implement the gambling activity.
    // In a gambling activity, two gamblers gamble on a stake.
    // Each gambler rolls a die, the gambler who roles a larger value wins the stake.
    // if it is a due, then roll again, until there is a winner.
    // Note: a gambler cannot start gamble if he does not have more money than the amount of stake.
    // Note: return false if at least one gambler cannot afford the stake. Otherwise, return true.
    // Note: print the result of rolled dice values, and the winner of the gambling.
    // (20 marks)
    static boolean gambling(Gambler gambler_1, Gambler gambler_2, int stake) {
        /* place your code here */
        boolean result;
        // Check if gamblers have money to play
        if (gambler_1.money < stake || gambler_2.money < stake) {
            result = false;
        }
        else {
            int roll1 = 0;
            int roll2 = 0;
            // Loop if same roll
            while (roll1 == roll2) {
                roll1 = gambler_1.die.rollDice();
                roll2 = gambler_2.die.rollDice();
                // Gambler 1 wins
                if (roll1 > roll2) {
                    gambler_1.money += stake;
                    gambler_2.money -= stake;
                    System.out.println("Gambler 1 roll: "+roll1+" | Gambler 2 roll: "+roll2+" | Gambler 1 wins.");
                }
                // Gambler 2 wins
                else if (roll2 > roll1) {
                    gambler_1.money -= stake;
                    gambler_2.money += stake;
                    System.out.println("Gambler 1 roll: "+roll1+" | Gambler 2 roll: "+roll2+" | Gambler 2 wins.");
                }
                // Tie - roll again
                else {
                    System.out.println("Gambler 1 roll: "+roll1+" | Gambler 2 roll: "+roll2+" | Roll again.");
                }
            }
            result = true;
        }
        return result;
    }
}

public class Q1_DiceGambling {

    // Continue Gambling until one gambler cannot afford the stake
    // Print the amount of money of each gambler after each round of gambling.
    // Print the value of rolled dice for each gambler in each round of gambling.
    // (15 marks)
    public static void keepGambling(Gambler gambler_1, Gambler gambler_2, int stake, int max_gambling_times) {
        /* place your code here */
        int count = 1;
        // Continue gambling until someone cannot afford the stake or maximum times reached
        while (count!=max_gambling_times+1 && gambler_1.money >= stake && gambler_2.money >= stake) {
            System.out.println("---- ROUND "+count+" ----");
            Gambler.gambling(gambler_1, gambler_2, stake);
            System.out.println("Gambler 1 money: $"+gambler_1.money+" | Gambler 2 money: $"+gambler_2.money+".");
            count++;
        }
        System.out.println("---- GAME OVER ----");
    }

    public static void main(String[] args) {
        int initial_money = 25;
        int stake = 5;
        int max_gambling_times = 15;

        Gambler gambler1 = new Gambler(initial_money);
        Gambler gambler2 = new Gambler(initial_money);

        keepGambling(gambler1, gambler2, stake, max_gambling_times);
        gambler1.die.rollDice();
    }
}
