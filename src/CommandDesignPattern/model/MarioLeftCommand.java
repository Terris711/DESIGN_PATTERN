package CommandDesignPattern.model;

import CommandDesignPattern.interfaces.Command;

public class MarioLeftCommand implements Command {
    private MarioCharacterReceiver marioCharacter;

    public MarioLeftCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveLeft();
    }
}
