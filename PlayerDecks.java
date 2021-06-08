import java.awt.*; 
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.*;
import javax.imageio.*; 
import java.util.*; 
import java.util.Random;

public class PlayerDecks extends Point{

    private int chooseNumber;
    public int firstCardNum; 
    public int secondCardNum;
    public boolean isHitButtonClicked = false; 
    public int thirdCardNum; 
    public int addition;

    public PlayerDecks() {
        firstCardNum = chooseNumber();
        secondCardNum = chooseNumber(); 

    }

    public int chooseNumber() {
        Random random = new Random(); 
        chooseNumber = random.nextInt(13) + 1; 

        return chooseNumber; 
    }

    public int PlayerSumCard() {
        addition = 0; 
        addition = firstCardNum + secondCardNum; 

        if (isHitButtonClicked == true) {
            addition += thirdCardNum; 
            isHitButtonClicked = false; 
        }

        return addition; 
    }

    public boolean hitButtonclicked() {
        thirdCardNum = chooseNumber(); 
        
        return isHitButtonClicked = true; 
    }

    public void chooseFirstCard(DrawingPanel dp) {

        Graphics g = dp.getGraphics();  
        Player player = new Player(); 

        

        if (firstCardNum == 1) {
            player.blackOne(dp, 1);
        } else if (firstCardNum == 2) {
            player.blackTwo(dp, 1);
        } else if (firstCardNum == 3) {
            player.blackThree(dp, 1); 
        } else if (firstCardNum == 4) {
            player.blackFour(dp, 1);
        } else if (firstCardNum == 5) {
            player.blackFive(dp, 1);
        } else if (firstCardNum == 6) {
            player.blackSix(dp, 1);
        } else if (firstCardNum == 7) {
            player.blackSeven(dp, 1); 
        } else if (firstCardNum == 8) {
            player.blackEight(dp, 1); 
        } else if (firstCardNum == 9) {
            player.blackNine(dp, 1); 
        } else if (firstCardNum == 10) {
            player.blackTen(dp, 1); 
        } else if (firstCardNum == 11) {
            player.blackEleven(dp, 1); 
        } else if (firstCardNum == 12) {
            player.blackTwelve(dp, 1); 
        } else if (firstCardNum == 13) {
            player.blackThirteen(dp, 1); 
        }

        
    }
    
    public void chooseSecondCard(DrawingPanel dp) {

        Graphics g = dp.getGraphics();  
        Player player = new Player();        

            if (secondCardNum == 1) {
                player.blackOne(dp, 2);
            } else if (secondCardNum == 2) {
                player.blackTwo(dp, 2);
            } else if (secondCardNum == 3) {
                player.blackThree(dp, 2); 
            } else if (secondCardNum == 4) {
                player.blackFour(dp, 2);
            } else if (secondCardNum == 5) {
                player.blackFive(dp, 2);
            } else if (secondCardNum == 6) {
                player.blackSix(dp, 2);
            } else if (secondCardNum == 7) {
                player.blackSeven(dp, 2); 
            } else if (secondCardNum == 8) {
                player.blackEight(dp, 2); 
            } else if (secondCardNum == 9) {
                player.blackNine(dp, 2); 
            } else if (secondCardNum == 10) {
                player.blackTen(dp, 2); 
            } else if (secondCardNum == 11) {
                player.blackEleven(dp, 2); 
            } else if (secondCardNum == 12) {
                player.blackTwelve(dp, 2); 
            } else if (secondCardNum == 13) {
                player.blackThirteen(dp, 2); 
            }
        
    }

    public void chooseThirdCard(DrawingPanel dp) {

        Graphics g = dp.getGraphics();  
        Player player = new Player();        

            if (thirdCardNum == 1) {
                player.blackOne(dp, 3);
            } else if (thirdCardNum == 2) {
                player.blackTwo(dp, 3);
            } else if (thirdCardNum == 3) {
                player.blackThree(dp, 3); 
            } else if (thirdCardNum == 4) {
                player.blackFour(dp, 3);
            } else if (thirdCardNum == 5) {
                player.blackFive(dp, 3);
            } else if (thirdCardNum == 6) {
                player.blackSix(dp, 3);
            } else if (thirdCardNum == 7) {
                player.blackSeven(dp, 3); 
            } else if (thirdCardNum == 8) {
                player.blackEight(dp, 3); 
            } else if (thirdCardNum == 9) {
                player.blackNine(dp, 3); 
            } else if (thirdCardNum == 10) {
                player.blackTen(dp, 3); 
            } else if (thirdCardNum == 11) {
                player.blackEleven(dp, 3); 
            } else if (thirdCardNum == 12) {
                player.blackTwelve(dp, 3); 
            } else if (thirdCardNum == 13) {
                player.blackThirteen(dp, 3); 
            }
        
    }
}
