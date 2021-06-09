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
    public static BufferedImage mainScreen; 
    public static BufferedImage hitButtonUp; 
    public static BufferedImage stayButtonUp; 
    public static BufferedImage betButtonUp;
    public static BufferedImage chip10Up; 
    public static BufferedImage chip20Up; 
    public static BufferedImage chip50Up; 
    public static BufferedImage chip100Up; 
    
    public static int isChanged = 0; 
    public static String keyInput = ""; 
    public static int lineNum = 200;
    public static DPMouseEventHandler e;

    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(900,650);
        Graphics g = dp.getGraphics();  

        try {
            // start screen
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

            // main screen 
            mainScreen = ImageIO.read(new File("BlackJackmainScreen.png"));

            hitButtonUp = ImageIO.read(new File("HitbuttonUp.png"));

            stayButtonUp = ImageIO.read(new File("StaybuttonUp.png"));

            betButtonUp = ImageIO.read(new File("BetbuttonUp.png"));

            chip10Up = ImageIO.read(new File("Chip10Up.png"));

            chip20Up = ImageIO.read(new File("Chip20Up.png"));

            chip50Up = ImageIO.read(new File("Chip50Up.png"));

            chip100Up = ImageIO.read(new File("Chip100Up.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        mouseClickStartScreenDown(dp);
                   
            
        //playerdecks.chooseFirstCard(dp);
        //playerdecks.chooseSecondCard(dp);

        //dp.sleep(500); 
        //dealerDecks.chooseFirstCard(dp);
        //dealer.cardBack(dp);
        

        
    }


    // don't use for now

    public static void mouseClickStartScreenUp(DrawingPanel dp) {
        dp.onMouseUp((x,y) -> onMouseUp(dp,x,y));
    }

    public static void onMouseUp(DrawingPanel dp, int x, int y) {
        System.out.println("Mouse Up: " + x + ", " + y);    
        
    }

    public static void mouseClickStartScreenDown(DrawingPanel dp) {
        dp.onMouseDown((x,y) -> onMouseDown(dp,x,y));  
    }

    public static void onMouseDown(DrawingPanel dp, int x, int y) {
        PlayerDecks playerdecks = new PlayerDecks();       
        DealerDecks dealerDecks = new DealerDecks(); 
        Dealer dealer = new Dealer(); 
        System.out.println("Mouse Down: " + x + ", " + y);
        Graphics g = dp.getGraphics(); 

        // for Start button
        if (355 < x && x < 535) {
            if (365 < y && y < 405) { 
                dp.clear(); 
                mainScreen(dp);

                playerdecks.chooseFirstCard(dp);
                playerdecks.chooseSecondCard(dp);

                dealerDecks.chooseFirstCard(dp);
                dealer.cardBack(dp);
                
            }
        }

        // for Level button
        if (355 < x && x < 535) {
            if (415 < y && y < 455) {
            }
        }

        // for Help button
        if (355 < x && x < 535) {
            if (465 < y && y < 505) {
            }
        }        

        if (690 < x && x < 750) {
            if (80 < y && y < 340) {
                playerdecks.hitButtonclicked();
                playerdecks.chooseThirdCard(dp); 

                dealerDecks.chooseThirdCard(dp);
            }
        }
    }

    public static void mainScreen(DrawingPanel dp) {
        Graphics g = dp.getGraphics(); 
        isChanged = 1; 

        g.drawImage(mainScreen,0,0,900,650,null);
        g.drawImage(hitButtonUp,0,0,900,650,null);
        g.drawImage(stayButtonUp,0,0,900,650,null);
        g.drawImage(betButtonUp,0,0,900,650,null);
        g.drawImage(chip10Up,0,0,900,650,null);
        g.drawImage(chip20Up,0,0,900,650,null);
        g.drawImage(chip50Up,0,0,900,650,null);
        g.drawImage(chip100Up,0,0,900,650,null);

    }
    
}



