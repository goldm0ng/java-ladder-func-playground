package model.ladder;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LadderPointTest {

    @Test
    public void 현재_사다리의_지점에서_오른쪽_지점으로_이동할_수_있다_ex_연결상태일_경우(){
        LadderPoint ladderPoint = LadderPoint.CONNECTED;

        assertThat(ladderPoint.isPossibleToMoveRight())
                .isTrue();
    }

    @Test
    public void 현재_사다리의_지점에서_왼쪽_지점으로_이동할_수_있다_ex_연결상태일_경우(){
        LadderPoint ladderPoint = LadderPoint.DISCONNECTED;
        LadderPoint beforeLadderPoint = LadderPoint.CONNECTED;

        assertThat(ladderPoint.isPossibleToMoveLeft(beforeLadderPoint))
                .isTrue();
    }

    @Test
    public void 현재_사다리의_지점에서_오른쪽_지점으로_이동할_수_없다_ex_연결상태가_아닌_경우(){
        LadderPoint ladderPoint = LadderPoint.DISCONNECTED;

        assertThat(ladderPoint.isPossibleToMoveRight())
                .isFalse();
    }

    @Test
    public void 현재_사다리의_지점에서_왼쪽_지점으로_이동할_수_없다_ex_연결상태가_아닌_경우(){
        LadderPoint ladderPoint = LadderPoint.DISCONNECTED;
        LadderPoint beforeLadderPoint = LadderPoint.DISCONNECTED;

        assertThat(ladderPoint.isPossibleToMoveLeft(beforeLadderPoint))
                .isFalse();
    }

    @Test
    public void 현재_사다리_지점은_다음_사다리_지점과의_연결_상태를_반환할_수_있다(){
        LadderPoint connectedLadderPoint = LadderPoint.CONNECTED;
        LadderPoint disconnectedLadderPoint = LadderPoint.DISCONNECTED;

        assertThat(connectedLadderPoint.isConnected())
                .isTrue();
        assertThat(disconnectedLadderPoint.isConnected())
                .isFalse();
    }
}
