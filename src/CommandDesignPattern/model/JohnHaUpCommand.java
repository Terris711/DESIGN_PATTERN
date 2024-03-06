package CommandDesignPattern.model;

import CommandDesignPattern.interfaces.Command;

public class JohnHaUpCommand implements Command {

    private JohnHaCharacterReceiver johnHaCharacter;

    public JohnHaUpCommand(JohnHaCharacterReceiver johnHaCharacter) {
        this.johnHaCharacter = johnHaCharacter;
    }

    @Override
    public void execute() {
        johnHaCharacter.moveUp();
    }
}
