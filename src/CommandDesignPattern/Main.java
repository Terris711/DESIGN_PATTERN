package CommandDesignPattern;

import CommandDesignPattern.model.*;

public class Main {
    public static void main (String[] args) {

        //Create or receivers

        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        mario.setName("Mario");

        JohnHaCharacterReceiver johnHa = new JohnHaCharacterReceiver();
        johnHa.setName("John ha");

        // Create Commands
        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

        JohnHaUpCommand johnHaUpCommand = new JohnHaUpCommand(johnHa);
        JohnHaDownCommand johnHaDownCommand= new JohnHaDownCommand(johnHa);
        JohnHaLeftCommand johnHaLeftCommand= new JohnHaLeftCommand(johnHa);
        JohnHaRightCommand johnHaRightCommand= new JohnHaRightCommand(johnHa);

        //Invoker
        GameBoy marioGameBoy = new GameBoy(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
        marioGameBoy.arrowDown();

        GameBoy johnHaGameBoy = new GameBoy(johnHaUpCommand,johnHaDownCommand, johnHaLeftCommand, johnHaRightCommand);
        johnHaGameBoy.arrowLeft();
    }
}
