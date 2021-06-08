import java.awt.*; 
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.*;
import javax.imageio.*; 
import java.util.*; 
import java.util.Random;

public class PlayerDecks extends Point{

    private int chooseColor; 
    private int chooseNumber;
    public int firstCardNum; 
    public int firstCardColor; 
    public int secondCardNum; 
    public int secondCardColor; 
    public int addition;

    public PlayerDecks() {
        firstCardNum = chooseNumber();
        secondCardNum = chooseNumber(); 

    }

    public int chooseBlackOrRed() {
        Random random = new Random(); 
        chooseColor = random.nextInt(2) + 1; 

        return chooseColor; 
    }

    public int chooseNumber() {
        Random random = new Random(); 
        chooseNumber = random.nextInt(13) + 1; 

        return chooseNumber; 
    }

    public int PlayerSumCard() {
        addition = 0; 
        addition = firstCardNum + secondCardNum; 

        return addition; 
    }

    public void chooseFirstCard(DrawingPanel dp) {

        Graphics g = dp.getGraphics();  
        Player player = new Player(); 
        
        firstCardColor = chooseBlackOrRed();  

        // 1 is black color 
        // 2 is red color
        if (firstCardColor == 1) {

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

        } else if (firstCardColor == 2) {
            if (firstCardNum == 1) {
               player.redOne(dp, 1); 
            } else if (firstCardNum == 2) {
                player.redTwo(dp, 1); 
            } else if (firstCardNum == 3) {
                player.redThree(dp, 1); 
            } else if (firstCardNum == 4) {
                player.redFour(dp, 1); 
            } else if (firstCardNum == 5) {
                player.redFive(dp, 1); 
            } else if (firstCardNum == 6) {
                player.redSix(dp, 1); 
            } else if (firstCardNum == 7) {
                player.redSeven(dp, 1); 
            } else if (firstCardNum == 8) {
                player.redEight(dp, 1); 
            } else if (firstCardNum == 9) {
                player.redNine(dp, 1); 
            } else if (firstCardNum == 10) {
                player.redTen(dp, 1); 
            } else if (firstCardNum == 11) {
                player.redEleven(dp, 1);
            } else if (firstCardNum == 12) {
                player.redTwelve(dp, 1);
            } else if (firstCardNum == 13) {
                player.redThirteen(dp, 1);
            }

        }

        
    }
    
    public void chooseSecondCard(DrawingPanel dp) {

        Graphics g = dp.getGraphics();  
        Player player = new Player(); 
        
        secondCardColor = chooseBlackOrRed(); 

        // 1 is black color 
        // 2 is red color
        if (firstCardColor == 1) {

            if (secondCardColor == 1) {
                player.blackOne(dp, 2);
            } else if (secondCardColor == 2) {
                player.blackTwo(dp, 2);
            } else if (secondCardColor == 3) {
                player.blackThree(dp, 2); 
            } else if (secondCardColor == 4) {
                player.blackFour(dp, 2);
            } else if (secondCardColor == 5) {
                player.blackFive(dp, 2);
            } else if (secondCardColor == 6) {
                player.blackSix(dp, 2);
            } else if (secondCardColor == 7) {
                player.blackSeven(dp, 2); 
            } else if (secondCardColor == 8) {
                player.blackEight(dp, 2); 
            } else if (secondCardColor == 9) {
                player.blackNine(dp, 2); 
            } else if (secondCardColor == 10) {
                player.blackTen(dp, 2); 
            } else if (secondCardColor == 11) {
                player.blackEleven(dp, 2); 
            } else if (secondCardColor == 12) {
                player.blackTwelve(dp, 2); 
            } else if (secondCardColor == 13) {
                player.blackThirteen(dp, 2); 
            }

        } else if (secondCardColor == 2) {
            if (secondCardColor == 1) {
                player.redOne(dp, 2); 
            } else if (secondCardColor == 2) {
                player.redTwo(dp, 2); 
            } else if (secondCardColor == 3) {
                player.redThree(dp, 2); 
            } else if (secondCardColor == 4) {
                player.redFour(dp, 2); 
            } else if (secondCardColor == 5) {
                player.redFive(dp, 2); 
            } else if (secondCardColor == 6) {
                player.redSix(dp, 2); 
            } else if (secondCardColor == 7) {
                player.redSeven(dp, 2); 
            } else if (secondCardColor == 8) {
                player.redEight(dp, 2); 
            } else if (secondCardColor == 9) {
                player.redNine(dp, 2); 
            } else if (secondCardColor == 10) {
                player.redTen(dp, 2); 
            } else if (secondCardColor == 11) {
                player.redEleven(dp, 2);
            } else if (secondCardColor == 12) {
                player.redTwelve(dp, 2);
            } else if (secondCardColor == 13) {
                player.redTwelve(dp, 2);
            }

        }

        
    }
}
