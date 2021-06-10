import java.awt.*; 

public class Point extends Main{

    public int playerPoint = 500; 
    public int dealerPoint = 500; 

    public int playerNum; 
    public int dealerNum; 
    public String playerPointStr; 
    public String dealerPointStr; 

    public int betAmount = 0;
    
    public void comparePlayerAndDealer(DrawingPanel dp) {
        /* Graphics g = dp.getGraphics(); 
        Font pointPlayerAndDealer = new Font("SansSerif", Font.PLAIN, 32); 
        g.setColor(Color.YELLOW);
        g.setFont(pointPlayerAndDealer); */

        PlayerDecks playerD = new PlayerDecks(); 
        DealerDecks dealerD = new DealerDecks();
        
        playerNum = playerD.PlayerSumCard(); 
        dealerNum = dealerD.dealerSumCard(); 

        if (playerNum == 21) {
            win(dp); 
        } else if (playerNum > 21) {
            lose(); 
        } else if (playerNum < 21) {
            if(playerNum > dealerNum ){
                win(dp);
            }else if(playerNum < dealerNum){
                lose();
            }else if(dealerNum > 21){
                win(dp);
            }else if(playerNum == dealerNum){
                draw();
            }
        
        }

        //playerPointStr = String.valueOf(playerPoint); 
        //dealerPointStr = String.valueOf(dealerPoint); 

        //g.drawString(playerPointStr, 205, 465);
        //g.drawString(dealerPointStr, 640, 40); 

    }

    public void win(DrawingPanel dp) {
        playerPoint += betAmount;
    }

    public void draw() {
        playerPoint += (betAmount/2);
        dealerPoint += (betAmount/2);

    }

    public void lose() {
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






