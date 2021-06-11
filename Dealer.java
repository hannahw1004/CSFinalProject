import java.awt.*; 
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.*;
import javax.imageio.*; 
import java.util.*; 

public class Dealer{

    // card images
    public static BufferedImage blackOne;
    public static BufferedImage blackTwo; 
    public static BufferedImage blackThree; 
    public static BufferedImage blackFour; 
    public static BufferedImage blackFive; 
    public static BufferedImage blackSix;  
    public static BufferedImage blackSeven; 
    public static BufferedImage blackEight;
    public static BufferedImage blackNine; 
    public static BufferedImage blackTen; 
    public static BufferedImage blackEleven; 
    public static BufferedImage blackTwelve; 
    public static BufferedImage blackThirteen; 
    public static BufferedImage cardBack; 

    public Dealer() {
        try {
            // cards for 1 
            blackOne = ImageIO.read(new File("BlackOne.png"));

            //cards for 2
            blackTwo = ImageIO.read(new File("BlackTwo.png")); 

            // cards for 3
            blackThree = ImageIO.read(new File("BlackThree.png")); 
         
            // cards for 4
            blackFour = ImageIO.read(new File("BlackFour.png")); 
        
            // cards for 5
            blackFive = ImageIO.read(new File("BlackFive.png")); 
          
            // cards for 6
            blackSix = ImageIO.read(new File("BlackSix.png")); 
                
            // cards for 7
            blackSeven = ImageIO.read(new File("BlackSeven.png")); 
                
            // cards for 8
            blackEight = ImageIO.read(new File("BlackEight.png")); 
                     
            // cards for 9
            blackNine = ImageIO.read(new File("BlackNine.png")); 
       
            // cards for 10
            blackTen = ImageIO.read(new File("BlackTen.png")); 
           
            // cards for 11
            blackEleven = ImageIO.read(new File("BlackEleven.png")); 
  
            // cards for 12
            blackTwelve = ImageIO.read(new File("BlackTwelve.png")); 
         
            // cards for 13
            blackThirteen = ImageIO.read(new File("BlackThirteen.png")); 
           
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
