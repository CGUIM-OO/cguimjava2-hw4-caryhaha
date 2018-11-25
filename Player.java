import java.util.ArrayList;

public class Player{
	 private String name;
	 private int chips;
	 private int bet;
	 private ArrayList<Card> oneRoundCard; 
	 public Player(String name, int chips) {
		 this.name = name;
		 this.chips = chips;
	 }
	 public String getName() {
		 return name;
	 }
	 public int makeBet() {
		 if(chips >= 1) {
			 bet = 1;
			 return bet;
		 }
		 else
			 return 0;
	 }
	 public void setOneRoundCard(ArrayList<Card> cards) {
		 oneRoundCard=cards;
	 }
	 public boolean hitMe() {
		int sum = 0;
		for(int i = 0;i < oneRoundCard.size();i++) {
			Card c = oneRoundCard.get(i);
			sum += c.getRank();
		}
		if(sum <= 16) {
			return true;
		}
		else
			return false;
	 }
	 public int getTotalValue() {
		 int sum = 0;
		 for(int i = 0;i < oneRoundCard.size();i++) {
				Card c = oneRoundCard.get(i);
				sum += c.getRank();
		 }
		 return sum;
	 }
	 public int getCurrentChips() {
		 return chips;
	 }
	 public void increaseChips (int diff) {
		 chips += diff;
	 }
	 public void sayHello() {
		 System.out.println("Hello, I am " + name + ".");
		 System.out.println("I have " + chips + " chips.");
	 }
}