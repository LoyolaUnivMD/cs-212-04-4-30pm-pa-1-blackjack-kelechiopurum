import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Hand {
    private List<String> cards;
    public Hand() {
        cards = new ArrayList<>();
    }
    public void add(String card) {
        cards.add(card);

    //make a method to get the total  
    }
    public int getTotal() {
        int totalSum = 0;
        int numAces = 0;
        for (String card : cards) {
            char rank = card.charAt(0);
            if (Character.isDigit(rank)) {
                totalSum += Character.getNumericValue(rank);
            } else if (rank == 'A') { // Corrected the comparison using single quotes
                numAces++;
            } else {
                totalSum += 10;
            }
        }
        for (int i = 0; i < numAces; i++) {
            if (totalSum + 11 <= 21) {
                totalSum += 11;
            } else {
                totalSum += 1;
            }
        }
        return totalSum;
    }
    //make a method to display the cards
    public void display() {
        for (String card : cards) {
            System.out.println(card);
        }
        System.out.println();
    }

    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      //make the hands
      Hand playersHand = new Hand();
      Hand dealersHand = new Hand();

      playersHand.add("3D");
      playersHand.add("9C");
      playersHand.add("TC");
      dealersHand.add("XX");

      //show the starting hands
      System.out.println("A game of Blackjack: ");
      System.out.println("Dealer: ");
      System.out.print("XX ");
      dealersHand.display();
      System.out.print(playersHand.total());

      // The Players Turn
      int choice;
      do {
        System.out.println("Hit(1) or Stay(2)");
        choice = scanner.nextInt();
        if(choice == 1){
          playersHand.add("6C");
          System.out.print("Dealer: XX");
          dealersHand.display();
          System.out.print("Player: XX");
          playersHand.display();
          System.out.println(playersHand.total());
        }

        innt dealersTotal = dealersHand.total();
        int playerTotal = player.total();
        if (dealersTotal > 21 || playerTotal > dealerTotal) {
          System.out.println("Player Wins!");
        } else if (dealerTotal > playerTotal) {
          System.out.println("Dealer Wins!");
        } else {
          System.out.println("It's a tie!");
        }

        scanner.close();
        }
        
      }
    }
