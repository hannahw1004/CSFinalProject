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

    // card images
    public static BufferedImage blackOne;
    public static BufferedImage redOne; 
    public static BufferedImage blackTwo; 
    public static BufferedImage redTwo; 
    public static BufferedImage blackThree; 
    public static BufferedImage redThree; 
    public static BufferedImage blackFour; 
    public static BufferedImage redFour; 
    public static BufferedImage blackFive; 
    public static BufferedImage redFive; 
    public static BufferedImage blackSix; 
    public static BufferedImage redSix; 
    public static BufferedImage blackSeven; 
    public static BufferedImage redSeven; 
    public static BufferedImage blackEight; 
    public static BufferedImage redEight; 
    public static BufferedImage blackNine; 
    public static BufferedImage redNine; 
    public static BufferedImage blackTen; 
    public static BufferedImage redTen; 
    public static BufferedImage blackEleven; 
    public static BufferedImage redEleven; 
    public static BufferedImage blackTwelve; 
    public static BufferedImage redTwelve; 
    public static BufferedImage blackThirteen; 
    public static BufferedImage redThirteen; 
    public static BufferedImage cardBack; 

    public PlayerDecks() {
        firstCardNum = chooseNumber();
        secondCardNum = chooseNumber(); 

        try {
            // cards for 1 
            blackOne = ImageIO.read(new File("BlackOne.png"));
            redOne = ImageIO.read(new File("RedOne.png")); 

            //cards for 2
            blackTwo = ImageIO.read(new File("BlackTwo.png")); 
            redTwo = ImageIO.read(new File("RedTwo.png")); 

            // cards for 3
            blackThree = ImageIO.read(new File("BlackThree.png")); 
            redThree = ImageIO.read(new File("RedThree.png")); 

            // cards for 4
            blackFour = ImageIO.read(new File("BlackFour.png")); 
            redFour = ImageIO.read(new File("RedFour.png")); 

            // cards for 5
            blackFive = ImageIO.read(new File("BlackFive.png")); 
            redFive = ImageIO.read(new File("RedFive.png")); 

            // cards for 6
            blackSix = ImageIO.read(new File("BlackSix.png")); 
            redSix = ImageIO.read(new File("RedSix.png"));
            
            // cards for 7
            blackSeven = ImageIO.read(new File("BlackSeven.png")); 
            redSeven = ImageIO.read(new File("RedSeven.png"));
            
            // cards for 8
            blackEight = ImageIO.read(new File("BlackEight.png")); 
            redEight = ImageIO.read(new File("RedEight.png"));
            
            // cards for 9
            blackNine = ImageIO.read(new File("BlackNine.png")); 
            redNine = ImageIO.read(new File("RedNine.png")); 

            // cards for 10
            blackTen = ImageIO.read(new File("BlackTen.png")); 
            redTen = ImageIO.read(new File("RedTen.png")); 

            // cards for 11
            blackEleven = ImageIO.read(new File("BlackEleven.png")); 
            redEleven = ImageIO.read(new File("RedEleven.png")); 

            // cards for 12
            blackTwelve = ImageIO.read(new File("BlackTwelve.png")); 
            redTwelve = ImageIO.read(new File("RedTwelve.png")); 

            // cards for 13
            blackThirteen = ImageIO.read(new File("BlackThirteen.png")); 
            redThirteen = ImageIO.read(new File("RedThirteen.png")); 

            // card for back
            cardBack = ImageIO.read(new File("CardBack.png")); 

        } catch (IOException e) {
            e.printStackTrace();
        }

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

    public void chooseFirstCard(DrawingPanel dp) {

        Graphics g = dp.getGraphics();  
        
        firstCardColor = chooseBlackOrRed();  

        // 1 is black color 
        // 2 is red color
        if (firstCardColor == 1) {

            if (firstCardNum == 1) {
                g.drawImage(blackOne,-140,5,900,650,null);
            } else if (firstCardNum == 2) {
                g.drawImage(blackTwo,-140,5,900,650,null); 
            } else if (firstCardNum == 3) {
                g.drawImage(blackThree,-140,5,900,650,null); 
            } else if (firstCardNum == 4) {
                g.drawImage(blackFour,-140,5,900,650,null); 
            } else if (firstCardNum == 5) {
                g.drawImage(blackFive,-140,5,900,650,null); 
            } else if (firstCardNum == 6) {
                g.drawImage(blackSix,-140,5,900,650,null); 
            } else if (firstCardNum == 7) {
                g.drawImage(blackSeven,-140,5,900,650,null); 
            } else if (firstCardNum == 8) {
                g.drawImage(blackEight,-140,5,900,650,null); 
            } else if (firstCardNum == 9) {
                g.drawImage(blackNine,-140,5,900,650,null); 
            } else if (firstCardNum == 10) {
                g.drawImage(blackTen,-140,5,900,650,null); 
            } else if (firstCardNum == 11) {
                g.drawImage(blackEleven,-140,5,900,650,null); 
            } else if (firstCardNum == 12) {
                g.drawImage(blackTwelve,-140,5,900,650,null); 
            } else if (firstCardNum == 13) {
                g.drawImage(blackThirteen,-140,5,900,650,null); 
            }

        } else if (firstCardColor == 2) {

            if (firstCardNum == 1) {
                g.drawImage(redOne,-140,5,900,650,null);
            } else if (firstCardNum == 2) {
                g.drawImage(redTwo,-140,5,900,650,null); 
            } else if (firstCardNum == 3) {
                g.drawImage(redThree,-140,5,900,650,null); 
            } else if (firstCardNum == 4) {
                g.drawImage(redFour,-140,5,900,650,null); 
            } else if (firstCardNum == 5) {
                g.drawImage(redFive,-140,5,900,650,null); 
            } else if (firstCardNum == 6) {
                g.drawImage(redSix,-140,5,900,650,null); 
            } else if (firstCardNum == 7) {
                g.drawImage(redSeven,-140,5,900,650,null); 
            } else if (firstCardNum == 8) {
                g.drawImage(redEight,-140,5,900,650,null); 
            } else if (firstCardNum == 9) {
                g.drawImage(redNine,-140,5,900,650,null); 
            } else if (firstCardNum == 10) {
                g.drawImage(redTen,-140,5,900,650,null); 
            } else if (firstCardNum == 11) {
                g.drawImage(redEleven,-140,5,900,650,null); 
            } else if (firstCardNum == 12) {
                g.drawImage(redTwelve,-140,5,900,650,null); 
            } else if (firstCardNum == 13) {
                g.drawImage(redThirteen,-140,5,900,650,null); 
            }
        }  
    }
    
    public void chooseSecondCard(DrawingPanel dp) {

        Graphics g = dp.getGraphics();  
        
        secondCardColor = chooseBlackOrRed(); 

        // 1 is black color 
        // 2 is red color
        if (firstCardColor == 1) {

            if (secondCardColor == 1) {
                g.drawImage(blackOne,-8,5,900,650,null);
            } else if (secondCardColor == 2) {
                g.drawImage(blackTwo,-8,5,900,650,null); 
            } else if (secondCardColor == 3) {
                g.drawImage(blackThree,-8,5,900,650,null); 
            } else if (secondCardColor == 4) {
                g.drawImage(blackFour,-8,5,900,650,null); 
            } else if (secondCardColor == 5) {
                g.drawImage(blackFive,-8,5,900,650,null); 
            } else if (secondCardColor == 6) {
                g.drawImage(blackSix,-8,5,900,650,null); 
            } else if (secondCardColor == 7) {
                g.drawImage(blackSeven,-8,5,900,650,null); 
            } else if (secondCardColor == 8) {
                g.drawImage(blackEight,-8,5,900,650,null); 
            } else if (secondCardColor == 9) {
                g.drawImage(blackNine,-8,5,900,650,null); 
            } else if (secondCardColor == 10) {
                g.drawImage(blackTen,-8,5,900,650,null); 
            } else if (secondCardColor == 11) {
                g.drawImage(blackEleven,-8,5,900,650,null); 
            } else if (secondCardColor == 12) {
                g.drawImage(blackTwelve,-8,5,900,650,null); 
            } else if (secondCardColor == 13) {
                g.drawImage(blackThirteen,-8,5,900,650,null); 
            }

        } else if (secondCardColor == 2) {

            if (secondCardColor == 1) {
                g.drawImage(redOne,-8,5,900,650,null);
            } else if (secondCardColor == 2) {
                g.drawImage(redTwo,-8,5,900,650,null); 
            } else if (secondCardColor == 3) {
                g.drawImage(redThree,-8,5,900,650,null); 
            } else if (secondCardColor == 4) {
                g.drawImage(redFour,-8,5,900,650,null); 
            } else if (secondCardColor == 5) {
                g.drawImage(redFive,-8,5,900,650,null); 
            } else if (secondCardColor == 6) {
                g.drawImage(redSix,-8,5,900,650,null); 
            } else if (secondCardColor == 7) {
                g.drawImage(redSeven,-8,5,900,650,null); 
            } else if (secondCardColor == 8) {
                g.drawImage(redEight,-8,5,900,650,null); 
            } else if (secondCardColor == 9) {
                g.drawImage(redNine,-8,5,900,650,null); 
            } else if (secondCardColor == 10) {
                g.drawImage(redTen,-8,5,900,650,null); 
            } else if (secondCardColor == 11) {
                g.drawImage(redEleven,-8,5,900,650,null); 
            } else if (secondCardColor == 12) {
                g.drawImage(redTwelve,-8,5,900,650,null); 
            } else if (secondCardColor == 13) {
                g.drawImage(redThirteen,-8,5,900,650,null); 
            }
        } 
    }

    public int Calculator(){
        int add = 0;

        add = firstCardNum + secondCardNum;
    
        return add;
    }
}
