import java.awt.*; 
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.*;
import javax.imageio.*; 
import java.util.*; 

public class Player{

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

    public Player() {
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
    public void blackOne(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackOne,-140,5,900,650,null);
        } else if(a == 2) {
            g.drawImage(blackOne,-8,5,900,650,null);
        }
    } 

    public void blackTwo(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackTwo,-140,5,900,650,null);
        } else if(a == 2) {
            g.drawImage(blackTwo,-8,5,900,650,null);
        }
    } 

    public void blackThree(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackThree,-140,5,900,650,null);
        } else if(a == 2) {
            g.drawImage(blackThree,-8,5,900,650,null);
        }
    } 

    public void blackFour(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackFour,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackFour,-8,5,900,650,null); 
        }
    } 

    public void blackFive(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackFive,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackFive,-8,5,900,650,null); 
        }
    } 

    public void blackSix(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackSix,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackSix,-8,5,900,650,null); 
        }
    } 

    public void blackSeven(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackSeven,-140,5,900,650,null);
        } else if(a == 2) {
            g.drawImage(blackSeven,-8,5,900,650,null); 
        }
    } 

    public void blackEight(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackEight,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackEight,-8,5,900,650,null); 
        }
    } 

    public void blackNine(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackNine,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackNine,-8,5,900,650,null); 
        }
    } 

    public void blackTen(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackTen,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackTen,-8,5,900,650,null); 
        }
    } 

    public void blackEleven(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackEleven,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackEleven,-8,5,900,650,null); 
        }
    } 

    public void blackTwelve(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackTwelve,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackTwelve,-8,5,900,650,null); 
        }
    } 

    public void blackThirteen(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(blackThirteen,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(blackThirteen,-8,5,900,650,null); 
        }
    } 
    
    // red cards
    public void redOne(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redOne,-140,5,900,650,null);
        } else if(a == 2) {
            g.drawImage(redOne,-8,5,900,650,null);
        }
    } 

    public void redTwo(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redTwo,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redTwo,-8,5,900,650,null); 
        }
    } 

    public void redThree(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redThree,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redThree,-8,5,900,650,null); 
        }
    } 

    public void redFour(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redFour,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redFour,-8,5,900,650,null); 
        }
    } 

    public void redFive(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redFive,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redFive,-8,5,900,650,null); 
        }
    } 

    public void redSix(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redSix,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redSix,-8,5,900,650,null); 
        }
    } 

    public void redSeven(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redSeven,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redSeven,-8,5,900,650,null); 
        }
    } 

    public void redEight(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redEight,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redEight,-8,5,900,650,null); 
        }
    } 

    public void redNine(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redNine,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redNine,-8,5,900,650,null); 
        }
    } 

    public void redTen(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redTen,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redTen,-8,5,900,650,null); 
        }
    } 

    public void redEleven(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redEleven,-140,5,900,650,null);
        } else if(a == 2) {
            g.drawImage(redEleven,-8,5,900,650,null); 
        }
    } 

    public void redTwelve(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redTwelve,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redTwelve,-8,5,900,650,null); 
        }
    } 

    public void redThirteen(DrawingPanel dp, int a) {
        Graphics g = dp.getGraphics();
        
        if(a == 1) {
            g.drawImage(redThirteen,-140,5,900,650,null); 
        } else if(a == 2) {
            g.drawImage(redThirteen,-8,5,900,650,null); 
        }
    } 



}

