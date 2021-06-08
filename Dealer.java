import java.awt.*; 
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.*;
import javax.imageio.*; 
import java.util.*; 

public class Dealer{

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

    public Dealer() {
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

    // black cards
    public void blackOne(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        g.drawImage(blackOne,-220,-200,900,650,null);
        
    } 

    public void blackTwo(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        g.drawImage(blackTwo,-220,-200,900,650,null);
    } 

    public void blackThree(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        g.drawImage(blackThree,-220,-200,900,650,null);
        
    } 

    public void blackFour(DrawingPanel dp) {
        Graphics g = dp.getGraphics();       
        g.drawImage(blackFour,-220,-200,900,650,null); 
        
    } 

    public void blackFive(DrawingPanel dp) {
        Graphics g = dp.getGraphics();        
        g.drawImage(blackFive,-220,-200,900,650,null); 
        
    } 

    public void blackSix(DrawingPanel dp) {
        Graphics g = dp.getGraphics();     
        g.drawImage(blackSix,-220,-200,900,650,null); 
                
    } 

    public void blackSeven(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        g.drawImage(blackSeven,-220,-200,900,650,null);
        
    } 

    public void blackEight(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        g.drawImage(blackEight,-220,-200,900,650,null); 
        
    } 

    public void blackNine(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        g.drawImage(blackNine,-220,-200,900,650,null); 
      
    } 

    public void blackTen(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        g.drawImage(blackTen,-220,-200,900,650,null); 
    } 

    public void blackEleven(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        g.drawImage(blackEleven,-220,-200,900,650,null); 
    
    } 

    public void blackTwelve(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        g.drawImage(blackTwelve,-220,-200,900,650,null);         
    } 

    public void blackThirteen(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        g.drawImage(blackThirteen,-220,-200,900,650,null); 
    } 
    
    public void cardBack(DrawingPanel dp) {
        Graphics g = dp.getGraphics(); 
        g.drawImage(cardBack,-330,-200,900,650,null); 
    }
    
    

}
