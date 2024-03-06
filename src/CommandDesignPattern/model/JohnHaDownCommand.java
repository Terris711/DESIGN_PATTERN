package CommandDesignPattern.model;

import CommandDesignPattern.interfaces.Command;

public class JohnHaDownCommand implements Command {
    private JohnHaCharacterReceiver johnHaCharacter;

    public JohnHaDownCommand(JohnHaCharacterReceiver johnHaCharacter) {
        this.johnHaCharacter = johnHaCharacter;
    }

    @Override
    public void execute() {
        johnHaCharacter.moveDown();
    }
}
