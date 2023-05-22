package 실습연습;

import java.util.Arrays;

public class CardDeck {
    private int count; // 현재 카드 장수
    private String[] deck; // 카드 덱 배열

    public CardDeck() {
        this.count = 3;
        this.deck = new String[]{"Diamond 2", "Diamond 3", "Diamond 4"};
    }

    public String deal() {
        if (count == 0) {
            return "카드가 더 이상 없습니다";
        }
        String card = deck[count - 1];
        count--;
        return card;
    }

    public int getCount() {
        return count;
    }

    private String generateCard() {
        int number = (int) (Math.random() * 9) + 2;
        return "Diamond " + number;
    }

    public void addCard() {
        if (count == deck.length) {
            String[] newDeck = Arrays.copyOf(deck, deck.length * 2);
            deck = newDeck;
        }
        deck[count] = generateCard();
        count++;
    }


    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        System.out.println("현재 카드 장수: " + deck.getCount());

        System.out.println("카드를 한 장 나눕니다.");
        System.out.println("나눠진 카드: " + deck.deal());
        System.out.println("현재 카드 장수: " + deck.getCount());

        System.out.println("카드를 한 장 나눕니다.");
        System.out.println("나눠진 카드: " + deck.deal());
        System.out.println("현재 카드 장수: " + deck.getCount());

        System.out.println("카드를 한 장 나눕니다.");
        System.out.println("나눠진 카드: " + deck.deal());
        System.out.println("현재 카드 장수: " + deck.getCount());

        System.out.println("카드를 한 장 나눕니다.");
        System.out.println("나눠진 카드: " + deck.deal());
        System.out.println("현재 카드 장수: " + deck.getCount());

        System.out.println("카드를 한 장 더 추가합니다.");
        deck.addCard();
        System.out.println("현재 카드 장수: " + deck.getCount());
    }
}

