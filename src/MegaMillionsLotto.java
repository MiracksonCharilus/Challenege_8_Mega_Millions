import java.util.Random;
public class MegaMillionsLotto {
    private int winningMegaMillionLotto[] = new int[7];
    private int userLotteryPicks[] = new int[7];
    private int winningPowerBall;
    private int userPowerBall;

    /**
     * (This method creates the random number for winning and powerball number)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public MegaMillionsLotto() {
        //random
        Random myRan = new Random();
        boolean test;
        int num;
//adds random numbers and make sure its unique
        for (int i = 0; i < 7; i++) {
            do {
                num = myRan.nextInt(1, 71);
                test = checkForDuplicates(num, winningMegaMillionLotto);
            } while (test == false);
            winningMegaMillionLotto[i] = num;

        }
// makes random number for powerball
        int num2 = myRan.nextInt(1, 26);
        winningPowerBall = num2;

        this.winningMegaMillionLotto = winningMegaMillionLotto;
        this.userLotteryPicks = userLotteryPicks;
        this.winningPowerBall = winningPowerBall;
        this.userPowerBall = userPowerBall;
    }

//setters and getters
    public int[] getWinningMegaMillionLotto() {
        return winningMegaMillionLotto;
    }

    public void setWinningMegaMillionLotto(int[] winningMegaMillionLotto) {
        this.winningMegaMillionLotto = winningMegaMillionLotto;
    }

    public int[] getUserLotteryPicks() {
        return userLotteryPicks;
    }

    public void setUserLotteryPicks(int[] userLotteryPicks) {
        this.userLotteryPicks = userLotteryPicks;
    }

    public int getWinningPowerBall() {
        return winningPowerBall;
    }

    public void setWinningPowerBall(int winningPowerBall) {
        this.winningPowerBall = winningPowerBall;
    }

    public int getUserPowerBall() {
        return userPowerBall;
    }

    public void setUserPowerBall(int userPowerBall) {
        this.userPowerBall = userPowerBall;
    }

    /**
     * (This  method checks to see if a number is unique)
     *
     * @param //number to check
     * @param //array to check
     * @return //false if number is not unique, true if number is unique
     * Preconditions:
     * Postconditions:
     */
    public boolean checkForDuplicates(int userNum, int[] arrayPicks){
        boolean status = true;
        for (int i = 0; i < 7; i++){
            if (arrayPicks[i] == userNum) {
                status = false;
                return status;
            }
        }
        //testing logic
       /* if (LotteryGame.checkType == "user") {


            int tester = 0;
            do {
                if (userLotteryPicks[tester] == userNum) {

                    status = false;
                } else {
                    status = true;
                    tester++;
                }

            } while (status == true && userLotteryPicks.length < tester);
        }
        else {
            int tester = 0;
            do {
                if (winningMegaMillionLotto[tester] == userNum){

                    status = false;
                }
                else{
                    status = true;
                    tester++;
                }

            }while (status == true  && winningMegaMillionLotto.length < tester);
        }

        return status;

        */
        return status;
    }
}
