import java.awt.*; 
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.*;
import javax.imageio.*; 
import java.util.*; 

public class Main {

    // screen images
    public static BufferedImage startScreen;

    // button images for start screen

    public static BufferedImage startButtonUp; 
    public static BufferedImage startButtonDown; 
    public static BufferedImage levelButtonUp; 
    public static BufferedImage levelButtonDown; 
    public static BufferedImage helpButtonUp; 
    public static BufferedImage helpButtonDown; 

    // button images for main screen
    
    public static boolean startUpOrDown = false; 
    public static String keyInput = ""; 
    public static int lineNum = 200;

    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(900,650);
        Graphics g = dp.getGraphics();        

        try {
            startScreen = ImageIO.read(new File("BlackJackstartScreen.png"));
            g.drawImage(startScreen,0,0,900,650,null);

            startButtonUp = ImageIO.read(new File("StartButtonUp.png"));
            g.drawImage(startButtonUp,0,0,900,650,null);

            levelButtonUp = ImageIO.read(new File("LevelButtonUp.png"));
            g.drawImage(levelButtonUp,0,0,900,650,null);

            helpButtonUp = ImageIO.read(new File("HelpButtonUp.png"));
            g.drawImage(helpButtonUp,0,0,900,650,null);

            startButtonDown = ImageIO.read(new File("StartButtonDown.png")); 
            
            levelButtonDown = ImageIO.read(new File("LevelButtonDown.png")); 

            helpButtonDown = ImageIO.read(new File("HelpButtonDown.png")); 
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        mouseClickStartScreenUp(dp); 
        mouseClickStartScreenDown(dp); 
        
    }

    public static void mouseClickStartScreenUp(DrawingPanel dp) {
        dp.onMouseUp((x,y) -> onMouseUp(dp,x,y));
    }

    public static void onMouseUp(DrawingPanel dp, int x, int y) {
        System.out.println("Mouse Up: " + x + ", " + y); 

        Graphics g = dp.getGraphics(); 

        // for Start button
        if (355 < x && x < 535) {
            if (365 < y && y < 405) {
                g.drawImage(startButtonUp,0,0,900,650,null); 
            }
        }

        // for Level button
        if (355 < x && x < 535) {
            if (415 < y && y < 455) {
                g.drawImage(levelButtonUp,0,0,900,650,null);
            }
        }

        // for Help button
        if (355 < x && x < 535) {
            if (465 < y && y < 505) {
                g.drawImage(helpButtonUp,0,0,900,650,null);
            }
        }                 
        
    }

    public static void mouseClickStartScreenDown(DrawingPanel dp) {
        dp.onMouseDown((x,y) -> onMouseDown(dp,x,y));          
    }

    public static void onMouseDown(DrawingPanel dp, int x, int y) {
        System.out.println("Mouse Down: " + x + ", " + y);
        Graphics g = dp.getGraphics(); 

        // for Start button
        if (355 < x && x < 535) {
            if (365 < y && y < 405) {
                g.drawImage(startButtonDown,0,0,900,650,null);
                g.drawString(keyInput,100,lineNum); 
                keyInput = ""; 
                lineNum += 30;  
            }
        }

        // for Level button
        if (355 < x && x < 535) {
            if (415 < y && y < 455) {
                g.drawImage(levelButtonDown,0,0,900,650,null);
                g.drawString(keyInput,100,lineNum); 
                keyInput = ""; 
                lineNum += 30; 
            }
        }

        // for Help button
        if (355 < x && x < 535) {
            if (465 < y && y < 505) {
                g.drawImage(helpButtonDown,0,0,900,650,null);
                g.drawString(keyInput,100,lineNum); 
                keyInput = ""; 
                lineNum += 30; 
            }
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