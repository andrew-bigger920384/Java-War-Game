package com.mycompany.card;
import javax.swing.JOptionPane;


public class PickTwoCards {
    public static void main(String[] args){
        final int CARDS_IN_SUIT = 13;
        int myvalue1 = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        int value2 = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        final int Suit_Num_End = 4;
        int SuitNum1 = ((int)(Math.random() * 100) % Suit_Num_End + 1);
        int SuitNum2 = ((int)(Math.random() * 100) % Suit_Num_End + 1);
        char Suit1 = 0, Suit2 = 0;
        
        switch (SuitNum1){
            case 1 -> Suit1 = 'S';
            case 2 -> Suit1 = 'D';
            case 3 -> Suit1 = 'H';
            case 4 -> Suit1 = 'C';
        } 
        
        switch (SuitNum2){
            case 1 -> Suit2 = 'S';
            case 2 -> Suit2 = 'D';
            case 3 -> Suit2 = 'H';
            case 4 -> Suit2 = 'C';
        }
        
        Cards card1 = new Cards();
        Cards card2 = new Cards();
        
        card1.setCardNum(myvalue1);
        card1.setSuitName(Suit1);
        
        card2.setCardNum(value2);
        card2.setSuitName(Suit2);
        
        JOptionPane.showMessageDialog(null,"The value of the my card is "
                + card1.getCardNum() + " of " + card1.getSuitName());
        JOptionPane.showMessageDialog(null,"The value of the computer's card is "
                + card2.getCardNum() + " of " + card2.getSuitName());
        
        if(myvalue1 > value2){
            JOptionPane.showMessageDialog(null, "You win");
        }else{
            if(myvalue1 < value2){
                JOptionPane.showMessageDialog(null, "The Computer wins");
            }else{
                if(myvalue1 == value2){
                    JOptionPane.showMessageDialog(null, "It is a tie");
                }
            }
        }
    }
}
