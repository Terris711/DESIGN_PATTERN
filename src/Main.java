import ScoreBoard.controller.ScoreBoard;
import ScoreBoard.controller.ScoreAlgorithmBase;
import ScoreBoard.model.Balloon;
import ScoreBoard.model.Clown;
import ScoreBoard.model.SquareBalloon;

public class Main {
    public static void main (String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon Taps Score: ");
        scoreBoard.sb = new Balloon();
        scoreBoard.showScore(10,5);

        System.out.print("Clown Taps Score: ");
        scoreBoard.sb = new Clown();
        scoreBoard.showScore(10,5);

        System.out.print("Square Balloon Taps Score: ");
        scoreBoard.sb = new SquareBalloon();
        scoreBoard.showScore(10,5);
    }
}