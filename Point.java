import java.awt.*; 

public class Point extends Main{
    public double playerPoint = 500; 
    public double dealerPoint = 500; 

    public double playerNum; 
    public double dealerNum; 

    public int betAmount = 0;

    public Font font = new Font("SansSerif", Font.PLAIN, 64); 
    public Graphics g; 
    
    public void comparePlayerAndDealer(DrawingPanel dp) {

        PlayerDecks playerD = new PlayerDecks(); 
        DealerDecks dealerD = new DealerDecks();
        
        playerNum = playerD.PlayerSumCard(); 
        dealerNum = dealerD.dealerSumCard(); 

        if(playerNum == 21){
            if(dealerNum < 21){
                blackJack(dp);
            } else if(dealerNum == 21){
                push(dp);
            }
        }else if(playerNum > 21){
            lose(dp);
        }else if(playerNum < 21){
            if(dealerNum > 21){
                win(dp);
            }else if(dealerNum > playerNum){
                lose(dp);
            }else if(dealerNum < playerNum){
                win(dp);
            }else if(dealerNum == playerNum){
                push(dp);
            }
        }
    }
    public void blackJack(DrawingPanel dp){
        g = dp.getGraphics(); 
        g.setColor(Color.CYAN);
        g.setFont(font); 
        g.drawString("You got BlackJack", 340, 350);

        playerPoint = betAmount * 1.5;
    }
    public void win(DrawingPanel dp) {
        g = dp.getGraphics(); 
        g.setColor(Color.CYAN);
        g.setFont(font); 
        g.drawString("You Win", 340, 350);

        playerPoint =+ betAmount;
    }

    public void push(DrawingPanel dp) {
        g = dp.getGraphics(); 
        g.setColor(Color.CYAN);
        g.setFont(font); 
        g.drawString("You Draw", 340, 350);

        playerPoint =+ (betAmount/2);
        dealerPoint =+ (betAmount/2);

    }

    public void lose(DrawingPanel dp) {
        g = dp.getGraphics(); 
        g.setColor(Color.CYAN);
        g.setFont(font); 
        g.drawString("You Lose", 340, 350);
        dealerPoint += betAmount;
    }

    public int is10ChipClicked() {
        dealerPoint -= 10;
        playerPoint -= 10;
        return betAmount += 20;
    }

    public int is20ChipClicked() {
        dealerPoint -= 20;
        playerPoint -= 20;
        return betAmount += 40;
    }

    public int is50ChipClicked() {
        dealerPoint -= 50;
        playerPoint -= 50;
        return betAmount += 100;
    }

    public int is100ChipClicked() {
        dealerPoint -= 100;
        playerPoint -= 100;
        return betAmount += 200;
    }
}
