package blackjack.domain.card;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeckGeneratorTest {

    @DisplayName("덱 생성 테스트")
    @Test
    void create() {
        assertThat(new CardGenerator().create()).hasSize(52);
    }
}
