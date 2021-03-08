package blackjack.domain.player;

import blackjack.exception.NotEnoughBetAmountException;

public class BetMoney {

    private static final long MIN_BETTING_MONEY = 1;
    private static final float BLACKJACK_BONUS = 1.5f;

    private final long betMoney;

    public BetMoney(long betMoney) {
        validate(betMoney);
        this.betMoney = betMoney;
    }

    private void validate(long betMoney) {
        if (betMoney < MIN_BETTING_MONEY) {
            throw new NotEnoughBetAmountException();
        }
    }

    public long getBetMoney() {
        return betMoney;
    }

    public float getBlackjackBetMoney() {
        return betMoney * BLACKJACK_BONUS;
    }
}
