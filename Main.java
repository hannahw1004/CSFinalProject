import java.awt.*;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage; 
import java.io.IOException; 
public class Main {
    public static void main(String args[]){
        DrawingPanel dp = new DrawingPanel(900,650);
        Graphics g = dp.getGraphics();

        BufferedImage mainScreen = null;
        BufferedImage startButtonUp = null;
        BufferedImage levelButtonUp = null;
        BufferedImage helpButtonUp = null;
        
        try{
            mainScreen = ImageIO.read(new File("BlackJackMainScreen.png"));
            g.drawImage(mainScreen,0,0,900,650,null);
            
            startButtonUp = ImageIO.read(new File("StartButtonUp.png"));
            g.drawImage(startButtonUp,0,0,900,650,null);

            levelButtonUp = ImageIO.read(new File("LevelButtonUp.png"));
            g.drawImage(levelButtonUp,0,0,900,650,null);

            helpButtonUp = ImageIO.read(new File("HelpButtonUp.png"));
            g.drawImage(helpButtonUp,0,0,900,650,null);
        }catch (IOException e){

        }
        
    }
    
}
