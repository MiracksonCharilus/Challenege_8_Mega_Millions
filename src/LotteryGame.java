/**
 * @author 5716504
 * (Mirackson Charilus)
 *
 * Title: Challenge #8 Mega Million Lotto
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program’s Functionality: This program creates a Lottery Game.
 */
import java.util.Scanner;
public class LotteryGame {

    //makes scanner a global and creates the object
    public static Scanner keyboard = new Scanner(System.in);
    //public static String checkType;
    public static MegaMillionsLotto aMegaMillionsLotto = new MegaMillionsLotto();

    /**
     * (This main method calls the other methods)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void main(String[] args) {
        getUserPicks();
        checkLotteryMatch();
    }

    /**
     * (This method gets the user's picks and sends it for validation)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void getUserPicks() {
        boolean test;
        int userNum;
        int userPowerBall;
        int holder[] = new int[7];
        for (int i = 0; i < 7; i++) {
            do { //forces the user to repeat until they enter unique number between 1 - 70
                    System.out.println("Please pick #" + (i + 1) + " it has to be a unique # between 1 and 70");
                    userNum = keyboard.nextInt();
                    keyboard.nextLine();
                    test = aMegaMillionsLotto.checkForDuplicates(userNum, holder);

            } while (userNum < 1 || userNum > 70 || test == false);
            holder[i] = userNum;
        }
        aMegaMillionsLotto.setUserLotteryPicks(holder);
        do { // forces user to enter a number between 1-25
            System.out.println("Please pick the powerball #. It has to be a # between 1 and 25");
            userPowerBall = keyboard.nextInt();
            keyboard.nextLine();
        } while (userPowerBall < 1 || userPowerBall > 25);
        aMegaMillionsLotto.setUserPowerBall(userPowerBall);
    }

    /**
     * (This method prints the user's and winning numbers. It also prints out the prize)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void checkLotteryMatch() {
        int numberMatch = 0;
        boolean powerBallMatch;
//checks out user's matched numbers
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                if (aMegaMillionsLotto.getUserLotteryPicks()[j] == aMegaMillionsLotto.getWinningMegaMillionLotto()[i]){
                    numberMatch++;
                }
            }
        }
//checks to see if powerball number match
        if (aMegaMillionsLotto.getUserPowerBall() == aMegaMillionsLotto.getWinningPowerBall()){
            powerBallMatch = true;
        }
        else {
            powerBallMatch = false;
        }
        //prints out user's numbers
        System.out.print("User numbers were ");
        for (int k = 0; k < 7; k++){
            System.out.print(aMegaMillionsLotto.getUserLotteryPicks()[k] + ", ");}
        //prints out user's powerball
        System.out.println("\nUser powerball was " + aMegaMillionsLotto.getUserPowerBall());
        //prints out winning numbers
        System.out.print("Winning numbers were ");
        for (int k = 0; k < 7; k++){
            System.out.print(aMegaMillionsLotto.getWinningMegaMillionLotto()[k] + ", ");
        }
        //prints out winning powerball
        System.out.println("\nWinning powerball was " + aMegaMillionsLotto.getWinningPowerBall());
        //prints out the prizes
        if(numberMatch == 3 && powerBallMatch == false){
            System.out.println("free tickets");
        }
        else if(numberMatch == 3 && powerBallMatch == true){
            System.out.println("$50 prize");
        }
        else if(numberMatch == 4 && powerBallMatch == false){
            System.out.println("$100 prize");
        }
        else if(numberMatch == 4 && powerBallMatch == true){
            System.out.println("$1,000 prize");
        }
        else if(numberMatch == 5 && powerBallMatch == false){
            System.out.println("$500 prize");
        }
        else if(numberMatch == 5 && powerBallMatch == true){
            System.out.println("$5,000 prize");
        }
        else if(numberMatch == 6 && powerBallMatch == false){
            System.out.println("$1,000 prize");
        }
        else if(numberMatch == 6 && powerBallMatch == true){
            System.out.println("$10,000 prize");
        }
        else if(numberMatch == 7 && powerBallMatch == false){
            System.out.println("$50,000 prize");
        }
        else if(numberMatch == 7 && powerBallMatch == true){
            System.out.println("$500,000 prize");
        }
        else {
            System.out.println("Sorry, no prize today. Try again.");
        }




    }
}
