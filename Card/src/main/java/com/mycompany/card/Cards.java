package com.mycompany.card;


public class Cards {
    private int CardNum;
    private char SuitName;
    
    
    public Cards(){}
        
    public int getCardNum(){
            return CardNum;
        }
        public void setCardNum(int Card){
            CardNum = Card;
        }
        public char getSuitName(){
            return SuitName;
        }
        public void setSuitName(char Suit){
            SuitName = Suit;
        }
}
