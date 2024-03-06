package CommandDesignPattern.model;

import CommandDesignPattern.interfaces.Command;

public class JohnHaLeftCommand implements Command {

    private JohnHaCharacterReceiver johnHaCharacter;

    public JohnHaLeftCommand(JohnHaCharacterReceiver johnHaCharacter) {
        this.johnHaCharacter = johnHaCharacter;
    }

    @Override
    public void execute() {
        johnHaCharacter.moveLeft();
    }
}
