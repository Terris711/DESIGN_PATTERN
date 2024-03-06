package CommandDesignPattern.model;

import CommandDesignPattern.interfaces.Command;

public class JohnHaRightCommand implements Command {

    private JohnHaCharacterReceiver johnHaCharacter;

    public JohnHaRightCommand(JohnHaCharacterReceiver johnHaCharacter) {
        this.johnHaCharacter = johnHaCharacter;
    }

    @Override
    public void execute() {
        johnHaCharacter.moveRight();
    }
}
