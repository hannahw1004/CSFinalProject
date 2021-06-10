public class Point extends Main{

    public int playerPoint = 500; 
    public int dealerPoint = 500; 

    public int playerNum; 
    public int dealerNum; 

    public int betAmount = 0;
    
    public void comparePlayerAndDealer(DrawingPanel dp) {
        PlayerDecks playerD = new PlayerDecks(); 
        DealerDecks dealerD = new DealerDecks();
        
        playerNum = playerD.PlayerSumCard(); 
        dealerNum = dealerD.dealerSumCard(); 

        if (playerNum == 21) {
            win(); 
        } else if (playerNum > 21) {
            lose(); 
        } else if (playerNum < 21) {
            if(playerNum > dealerNum ){
                win();
            }else if(playerNum < dealerNum){
                lose();
            }else if(dealerNum > 21){
                win();
            }else if(playerNum == dealerNum){
                draw();
            }
        
        }

    }

    public void win() {
        playerPoint =+ betAmount;
    }

    public void draw() {
        playerPoint =+ (betAmount/2);
        dealerPoint =+ (betAmount/2);

    }

    public void lose() {
        dealerPoint =+ betAmount;
    }

    public void is10ChipClicked() {
        dealerPoint =- 10;
        playerPoint =- 10;
        betAmount =+ 20;
    }

    public void is20ChipClicked() {
        dealerPoint =- 20;
        playerPoint =- 20;
        betAmount =+ 40;
    }

    public void is50ChipClicked() {
        dealerPoint =- 50;
        playerPoint =- 50;
        betAmount =+ 100;
    }

    public void is100ChipClicked() {
        dealerPoint =- 100;
        playerPoint =- 100;
        betAmount =+ 200;
    }

}






