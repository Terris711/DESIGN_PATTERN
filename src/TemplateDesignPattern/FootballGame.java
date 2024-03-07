package TemplateDesignPattern;

public class FootballGame extends Game {
    @Override
    void initialize() {
        System.out.println("Football Initializing ...");
    }

    @Override
    void startPlay() {
        System.out.println("Football Starting ...");
    }

    @Override
    void endPlay() {
        System.out.println("Football Ending ...");
    }

    @Override
    protected void addNewCharacterToTheGame() {

        return null;
    }
}
