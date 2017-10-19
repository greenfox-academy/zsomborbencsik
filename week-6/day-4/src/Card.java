public class Card {
    colorEnum color;
    suitEnum suit;
    rankEnum rank;

    public Card(String color, String suit, String rank) {
        this.color = colorEnum.valueOf(color);
        this.suit = suitEnum.valueOf(suit);
        this.rank = rankEnum.valueOf(rank);
    }

    public enum colorEnum {
        RED,BLACK
    }
    public enum suitEnum {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
    public enum rankEnum {
        ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);
        private final int value;
        rankEnum(int value)  {
            this.value = value;
        }
        public int getValue()  {
            return  value;
        }
    }
}
