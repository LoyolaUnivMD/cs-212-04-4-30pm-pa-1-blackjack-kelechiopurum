public class Main {
    public static void main(String[] args) {
      Hand playersHand = new Hand();
      Hand dealersHand = new Hand();

      //add cards to the player's hand
      playersHand.add("3D");
      playersHand.add("9C");
      playersHand.display();
      System.out.println("Total: " + playersHand.total());
      
      //add cards to the dealer's hand
      dealersHand.add("TC");
      dealersHand.add("XX");
      dealersHand.display();
      System.out.println("Total: "+ dealersHand.total());
    }
}
