import java.awt.*; 
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.*;
import javax.imageio.*; 
import java.util.*; 

public class Player{

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

    public Player() {
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

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // black cards
    public void blackOne(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackOne,-140,5,900,650,null);
        } else if(a == 2) {
            g.drawImage(blackOne,-8,5,900,650,null);
        } else if(a == 3) {
            g.drawImage(blackOne,120,5,900,650,null);
        }
    } 

    public void blackTwo(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackTwo,-140,5,900,650,null);
        } else if(a == 2) {
            g.drawImage(blackTwo,-8,5,900,650,null);
        } else if(a == 3) {
            g.drawImage(blackTwo,120,5,900,650,null);
        }
    } 

    public void blackThree(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackThree,-140,5,900,650,null);
        } else if(a == 2) {
            g.drawImage(blackThree,-8,5,900,650,null);
        } else if(a == 3) {
            g.drawImage(blackThree,120,5,900,650,null);
        }
    } 

    public void blackFour(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackFour,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackFour,-8,5,900,650,null); 
        } else if(a == 3) {
            g.drawImage(blackFour,120,5,900,650,null);
        }
    } 

    public void blackFive(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackFive,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackFive,-8,5,900,650,null); 
        } else if(a == 3) {
            g.drawImage(blackFive,120,5,900,650,null);
        }
    } 

    public void blackSix(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackSix,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackSix,-8,5,900,650,null); 
        } else if(a == 3) {
            g.drawImage(blackSix,120,5,900,650,null);
        }
    } 

    public void blackSeven(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackSeven,-140,5,900,650,null);
        } else if(a == 2) {
            g.drawImage(blackSeven,-8,5,900,650,null); 
        } else if(a == 3) {
            g.drawImage(blackSeven,120,5,900,650,null);
        }
    } 

    public void blackEight(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackEight,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackEight,-8,5,900,650,null); 
        } else if(a == 3) {
            g.drawImage(blackEight,120,5,900,650,null);
        }
    } 

    public void blackNine(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackNine,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackNine,-8,5,900,650,null); 
        } else if(a == 3) {
            g.drawImage(blackNine,120,5,900,650,null);
        }
    } 

    public void blackTen(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackTen,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackTen,-8,5,900,650,null); 
        } else if(a == 3) {
            g.drawImage(blackTen,120,5,900,650,null);
        }
    } 

    public void blackEleven(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackEleven,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackEleven,-8,5,900,650,null); 
        } else if(a == 3) {
            g.drawImage(blackEleven,120,5,900,650,null);
        }
    } 

    public void blackTwelve(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackTwelve,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackTwelve,-8,5,900,650,null); 
        } else if(a == 3) {
            g.drawImage(blackTwelve,120,5,900,650,null);
        }
    } 

    public void blackThirteen(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackThirteen,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackThirteen,-8,5,900,650,null); 
        } else if(a == 3) {
            g.drawImage(blackThirteen,120,5,900,650,null);
        }
    } 

}




