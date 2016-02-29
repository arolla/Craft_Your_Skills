package tennis;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TennisTest {

    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][] {
                { 0, 0, "Love-All" },
                { 1, 1, "Fifteen-All" },
                { 2, 2, "Thirty-All"},
                { 3, 3, "Deuce"},
                { 4, 4, "Deuce"},
                
                { 1, 0, "Fifteen-Love"},
                { 0, 1, "Love-Fifteen"},
                { 2, 0, "Thirty-Love"},
                { 0, 2, "Love-Thirty"},
                { 3, 0, "Forty-Love"},
                { 0, 3, "Love-Forty"},
                { 4, 0, "Win for player1"},
                { 0, 4, "Win for player2"},
                
                { 2, 1, "Thirty-Fifteen"},
                { 1, 2, "Fifteen-Thirty"},
                { 3, 1, "Forty-Fifteen"},
                { 1, 3, "Fifteen-Forty"},
                { 4, 1, "Win for player1"},
                { 1, 4, "Win for player2"},

                { 3, 2, "Forty-Thirty"},
                { 2, 3, "Thirty-Forty"},
                { 4, 2, "Win for player1"},
                { 2, 4, "Win for player2"},
                
                { 4, 3, "Advantage player1"},
                { 3, 4, "Advantage player2"},
                { 5, 4, "Advantage player1"},
                { 4, 5, "Advantage player2"},
                { 15, 14, "Advantage player1"},
                { 14, 15, "Advantage player2"},

                { 6, 4, "Win for player1"},
                { 4, 6, "Win for player2"},
                { 16, 14, "Win for player1"},
                { 14, 16, "Win for player2"},
        });
    }

    private void checkAllScores(TennisGame game, int player1Score, int player2Score, String expectedScore) {
        int highestScore = Math.max(player1Score, player2Score);
        for (int i = 0; i < highestScore; i++) {
            if (i < player1Score)
                game.wonPoint("player1");
            if (i < player2Score)
                game.wonPoint("player2");
        }
        assertThat(game.getScore()).isEqualTo(expectedScore);
    }

    @Test
    @Parameters(method = "getAllScores")
    public void checkAllScoresTennisGame1(int nbPoints1, int nbPoints2, String expectedResult) {
        TennisGame1 game = new TennisGame1("player1", "player2");
        checkAllScores(game, nbPoints1, nbPoints2, expectedResult);
    }

    @Test
    @Parameters(method = "getAllScores")
    public void checkAllScoresTennisGame2(int nbPoints1, int nbPoints2, String expectedResult) {
        TennisGame2 game = new TennisGame2("player1", "player2");
        checkAllScores(game, nbPoints1, nbPoints2, expectedResult);
    }

    @Test
    @Parameters(method = "getAllScores")
    public void checkAllScoresTennisGame3(int nbPoints1, int nbPoints2, String expectedResult) {
        TennisGame3 game = new TennisGame3("player1", "player2");
        checkAllScores(game, nbPoints1, nbPoints2, expectedResult);
    }

}
