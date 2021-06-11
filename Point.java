public class Point extends Main{
    public double playerPoint = 500; 
    public double dealerPoint = 500; 

    public double playerNum; 
    public double dealerNum; 

    public int betAmount = 0;
    
    public void comparePlayerAndDealer(DrawingPanel dp) {
        PlayerDecks playerD = new PlayerDecks(); 
        DealerDecks dealerD = new DealerDecks();
        
        playerNum = playerD.PlayerSumCard(); 
        dealerNum = dealerD.dealerSumCard(); 

        if(playerNum == 21){
            if(dealerNum < 21){
                blackJack();
            } else if(dealerNum == 21){
                push();
            }
        }else if(playerNum > 21){
            lose();
        }else if(playerNum < 21){
            if(dealerNum > 21){
                win();
            }else if(dealerNum > playerNum){
                lose();
            }else if(dealerNum < playerNum){
                win();
            }else if(dealerNum == playerNum){
                push();
            }
        }
    }
    public void blackJack(){
        playerPoint = betAmount * 1.5;
    }
    public void win() {
        playerPoint =+ betAmount;
    }

    public void push() {
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
