package TemplateDesignPattern;

public class EndlessRunnerGame extends Game{
    @Override
    void initialize() {
        System.out.println("Endless Runner Initializing ...");
    }

    @Override
    void startPlay() {
        System.out.println("Endless Runner Starting ...");
    }

    @Override
    void endPlay() {
        System.out.println("Endless Runner Ending ...");
    }

    @Override
    protected void addNewCharacterToTheGame() {
        System.out.println("Adding a new character to the game");
    }

    public boolean playerWantsNewCharacter() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }



    // Add more methods ...

}
