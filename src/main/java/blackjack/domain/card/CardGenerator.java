package blackjack.domain.card;

import java.util.*;

public class CardGenerator {

    public Deque<Card> create() {
        return new ArrayDeque<>(iterateType(new ArrayList<>()));
    }

    public Deck createDeckWithShuffle() {
        List<Card> cards = new ArrayList<>(create());
        Collections.shuffle(cards);
        return new Deck(new ArrayDeque<>(cards));
    }

    private List<Card> iterateType(List<Card> cards) {
        for (Type type : Type.values()) {
            iterateDenomination(cards, type);
        }
        return cards;
    }

    private List<Card> iterateDenomination(List<Card> cards, Type type) {
        for (Denomination denomination : Denomination.values()) {
            cards.add(new Card(type, denomination));
        }
        return cards;
    }
}
