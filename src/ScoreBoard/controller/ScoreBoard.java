package ScoreBoard.controller;

public class ScoreBoard {
    public ScoreAlgorithmBase sb;

    public void showScore(int taps, int multiplier) {
        System.out.println(sb.calculateScore(taps, multiplier));
    }
}
