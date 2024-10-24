package model.ladder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {

    @Test
    public void 사다리_생성_시_주어진_사다리_정보와_일치해야_한다(){
        int playerCount = 4;
        int ladderHeight = 5;

        Ladder ladder = new Ladder(playerCount,ladderHeight);

        assertThat(ladder.getLadder()).hasSize(ladderHeight);
        for (LadderLine ladderLine : ladder.getLadder()) {
            assertThat(ladderLine.getLadderLine()).hasSize(playerCount);
        }
    }

}
