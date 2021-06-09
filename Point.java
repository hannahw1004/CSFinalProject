public class Point extends Main{

    public int playerPoint = 500; 
    public int dealerPoint = 500; 

    public int playerNum; 
    public int dealerNum; 
    
    public void comparePlayerAndDealer(DrawingPanel dp) {
        PlayerDecks playerD = new PlayerDecks(); 
        DealerDecks dealerD = new DealerDecks();
        
        playerNum = playerD.PlayerSumCard(); 
        dealerNum = dealerD.dealerSumCard(); 

        if (playerNum == 21) {
            win(); 
        } else if (dealerNum < playerNum && playerNum < 21) {
            win(); 
        } else if (playerNum < 21 && 21 < dealerNum) {
            win(); 
        } else if (playerNum < dealerNum && dealerNum < 21) {
            lose(); 
        } else if (dealerNum < 21 && 21 < playerNum) {
            lose(); 
        } else if (playerNum == dealerNum) {
            draw(); 
        }


    }

    public void win() { }

    public void draw() { }

    public void lose() { }

    public void is10ChipClicked() {

    }

    public void is20ChipClicked() {
        
    }

    public void is50ChipClicked() {
        
    }

    public void is100ChipClicked() {
        
    }

}