import java.awt.*;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage; 
import java.io.IOException; 
public class Main {

    public static void main(String args[]){
        DrawingPanel dp = new DrawingPanel(900,650);   
        
        startScreen(dp); 
        mainScreen(dp);

        
    }

    public static void startScreen(DrawingPanel dp) {
        Graphics g = dp.getGraphics();
        
        BufferedImage startScreen = null;
        BufferedImage startButtonUp = null;
        BufferedImage levelButtonUp = null;
        BufferedImage helpButtonUp = null;
        
        try{
            startScreen = ImageIO.read(new File("BlackJackstartScreen.png"));
            g.drawImage(startScreen,0,0,900,650,null);
            
            startButtonUp = ImageIO.read(new File("StartButtonUp.png"));
            g.drawImage(startButtonUp,0,0,900,650,null);

            levelButtonUp = ImageIO.read(new File("LevelButtonUp.png"));
            g.drawImage(levelButtonUp,0,0,900,650,null);

            helpButtonUp = ImageIO.read(new File("HelpButtonUp.png"));
            g.drawImage(helpButtonUp,0,0,900,650,null);
        } catch (IOException e){

        }
    }

    public static void mainScreen(DrawingPanel dp) {
        Graphics g = dp.getGraphics(); 

        BufferedImage mainScreen = null; 
        BufferedImage hitButtonUp = null; 
        BufferedImage stayButtonUp = null; 
        BufferedImage betButtonUp = null;
        BufferedImage chip10Up = null; 
        BufferedImage chip20Up = null; 
        BufferedImage chip50Up = null; 
        BufferedImage chip100Up = null; 

        try {
            mainScreen = ImageIO.read(new File("BlackJackmainScreen.png"));
            g.drawImage(mainScreen,0,0,900,650,null);

            hitButtonUp = ImageIO.read(new File("HitbuttonUp.png"));
            g.drawImage(hitButtonUp,0,0,900,650,null);

            stayButtonUp = ImageIO.read(new File("StaybuttonUp.png"));
            g.drawImage(stayButtonUp,0,0,900,650,null);

            betButtonUp = ImageIO.read(new File("BetbuttonUp.png"));
            g.drawImage(betButtonUp,0,0,900,650,null);

            chip10Up = ImageIO.read(new File("Chip10Up.png"));
            g.drawImage(chip10Up,0,0,900,650,null);

            chip20Up = ImageIO.read(new File("Chip20Up.png"));
            g.drawImage(chip20Up,0,0,900,650,null);

            chip50Up = ImageIO.read(new File("Chip50Up.png"));
            g.drawImage(chip50Up,0,0,900,650,null);

            chip100Up = ImageIO.read(new File("Chip100Up.png"));
            g.drawImage(chip100Up,0,0,900,650,null);
        }  catch (IOException e) {

        }
    }
    
}
