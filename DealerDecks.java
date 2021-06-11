import java.awt.*; 
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.*;
import javax.imageio.*; 
import java.util.*; 
import java.util.Random;
 
public class DealerDecks extends PlayerDecks{
    
    private int dealerChooseNumber;
    public int dealerfirstCardNum; 
    public int dealersecondCardNum; 
    public int dealerthirdCardNum; 
    public boolean gohit = false;
    public int dealerAddition;
    public int dealerpercentChance;
 
    public DealerDecks() {
        dealerfirstCardNum = chooseNumber();
        dealersecondCardNum = chooseNumber(); 
    }
 
    public int chooseNumber() {
        Random random = new Random(); 
        dealerChooseNumber = random.nextInt(13) + 1; 

        if (dealerChooseNumber == 1) {
            return 11; 
        } else if (dealerChooseNumber >= 10) {
            return 10; 
        } else {
            return dealerChooseNumber; 
        }
    }
 
    public int dealerSumCard() {
        Random random = new Random(); 
        dealerAddition = 0; 
        dealerAddition = dealerfirstCardNum + dealersecondCardNum; 
 
        if (gohit == true) { 
            if(dealerAddition < 10){ 
                dealerAddition += dealerthirdCardNum; 
                gohit = false; 
            }
 
            else if(dealerAddition <= 15){
                dealerpercentChance = random.nextInt(100) + 2;
                if(dealerpercentChance % 2 == 0){
                    dealerAddition += dealerthirdCardNum; 
                    gohit = false;
                }
                else{
                    gohit = false;
                } 
            }
 
            else if(dealerAddition <= 17){
                dealerpercentChance = random.nextInt(100) + 5;
                if(dealerpercentChance % 5 == 0){
                    dealerAddition += dealerthirdCardNum; 
                    gohit = false;
                }else{
                    gohit = false;
                }
            }
 
            else if(dealerAddition <= 19){
                dealerpercentChance = random.nextInt(100) + 13;
                if(dealerpercentChance % 13 == 0){
                    dealerAddition += dealerthirdCardNum;
                    gohit = false;
                }else{
                    gohit = false;
                }
            }
            else{
                gohit = false;
            }
        }System.out.println("Value of Dealer " + dealerAddition);
 
        return dealerAddition; 
    }


    public boolean dealerGoHit() {
        dealerthirdCardNum = chooseNumber(); 
        
        return gohit = true; 
    }

    public void chooseFirstCard(DrawingPanel dp) {

        Graphics g = dp.getGraphics();  
        Dealer dealer = new Dealer(); 
        

        if (firstCardNum == 1) {
            dealer.blackOne(dp);
        } else if (firstCardNum == 2) {
            dealer.blackTwo(dp);
        } else if (firstCardNum == 3) {
            dealer.blackThree(dp); 
        } else if (firstCardNum == 4) {
            dealer.blackFour(dp);
        } else if (firstCardNum == 5) {
            dealer.blackFive(dp);
        } else if (firstCardNum == 6) {
            dealer.blackSix(dp);
        } else if (firstCardNum == 7) {
            dealer.blackSeven(dp); 
        } else if (firstCardNum == 8) {
            dealer.blackEight(dp); 
        } else if (firstCardNum == 9) {
            dealer.blackNine(dp); 
        } else if (firstCardNum == 10) {
            dealer.blackTen(dp); 
        } else if (firstCardNum == 11) {
            dealer.blackEleven(dp); 
        } else if (firstCardNum == 12) {
            dealer.blackTwelve(dp); 
        } else if (firstCardNum == 13) {
            dealer.blackThirteen(dp); 
        }
    }
}
