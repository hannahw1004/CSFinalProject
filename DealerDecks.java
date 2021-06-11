import java.awt.*; 
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.*;
import javax.imageio.*; 
import java.util.*; 
import java.util.Random;
 
public class DealerDecks extends PlayerDecks{
    
    private int dealerchooseNumber;
    public int dealerpercentChance;
    public int dealerfirstCardNum; 
    public int dealersecondCardNum; 
    public int dealerthirdCardNum; 
    public boolean gohit = true;
    public int dealerAddition;
 
    public DealerDecks() {
        
        dealerfirstCardNum = chooseNumber();
        
        dealersecondCardNum = chooseNumber();
 
        dealerthirdCardNum = chooseNumber();
        
 
    }
 
    public int chooseNumber() {
        Random random = new Random(); 
        dealerchooseNumber = random.nextInt(13) + 1; 
 
        return dealerchooseNumber; 
    }
 
    public int dealerSumCard() { 
        dealerAddition = 0; 
        dealerAddition = dealerfirstCardNum + dealersecondCardNum; 
        System.out.println("Init Val of Dealer " + dealerAddition); 
        
        Random random = new Random(); 
 
        if (gohit == true) { 
            if(dealerAddition < 10){ 
                if(dealerthirdCardNum == 11 || dealerthirdCardNum == 1){
                    dealerthirdCardNum = 11;
                    dealerAddition += dealerthirdCardNum; 
                    System.out.println("Init Val of Dealer " + dealerAddition); 
                    gohit = false; 
                }else{
                    dealerAddition += dealerthirdCardNum; 
                    System.out.println("Init Val of Dealer " + dealerAddition); 
                    gohit = false; 
                }
            }

            else if(dealerAddition <= 13){ 
                if(dealerthirdCardNum == 11 || dealerthirdCardNum == 1){
                    dealerthirdCardNum = 1;
                    dealerAddition += dealerthirdCardNum; 
                    System.out.println("Init Val of Dealer " + dealerAddition); 
                    gohit = false; 
                }else{
                    dealerAddition += dealerthirdCardNum; 
                    System.out.println("Init Val of Dealer " + dealerAddition); 
                    gohit = false; 
                }
            }
 
            else if(dealerAddition <= 15){
                dealerpercentChance = random.nextInt(100) + 2;
                if(dealerpercentChance % 2 == 0){
                    if(dealerthirdCardNum == 11 || dealerthirdCardNum == 1){
                        dealerthirdCardNum = 1;
                        dealerAddition += dealerthirdCardNum; 
                        System.out.println("Init Val of Dealer " + dealerAddition); 
                        gohit = false;
                    }else{
                        dealerAddition += dealerthirdCardNum; 
                        System.out.println("Init Val of Dealer " + dealerAddition); 
                        gohit = false;
                    }
                }
                else{
                    gohit = false;
                } 
            }
 
            else if(dealerAddition <= 17){
                dealerpercentChance = random.nextInt(100) + 5;
                if(dealerpercentChance % 5 == 0){
                    if(dealerthirdCardNum == 11 || dealerthirdCardNum == 1){
                        dealerthirdCardNum = 1;
                        dealerAddition += dealerthirdCardNum; 
                        System.out.println("Init Val of Dealer " + dealerAddition); 
                        gohit = false;
                    }else{
                        dealerAddition += dealerthirdCardNum; 
                        System.out.println("Init Val of Dealer " + dealerAddition); 
                        gohit = false;
                    }
                }else{
                    gohit = false;
                }
            }
 
            else if(dealerAddition <= 19){
                dealerpercentChance = random.nextInt(100) + 13;
                if(dealerpercentChance % 13 == 0){
                    if(dealerthirdCardNum == 11 || dealerthirdCardNum == 1){
                        dealerthirdCardNum = 1;
                        dealerAddition += dealerthirdCardNum;
                        System.out.println("Init Val of Dealer " + dealerAddition); 
                        gohit = false;
                    }else{
                        dealerAddition += dealerthirdCardNum;
                        System.out.println("Init Val of Dealer " + dealerAddition); 
                        gohit = false;
                    }
                }else{
                    gohit = false;
                }
            }
            else{
                System.out.println("Init Val of Dealer " + dealerAddition); 
                gohit = false;
            }
        }
 
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
 
 
