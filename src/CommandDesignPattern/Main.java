package CommandDesignPattern;

import CommandDesignPattern.model.JohnHaCharacterReceiver;

public class Main {
    public static void main (String[] args) {
        JohnHaCharacterReceiver johnHaCharacterReceiver = new JohnHaCharacterReceiver();
        johnHaCharacterReceiver.setName("John Ha");

        System.out.println(johnHaCharacterReceiver.getName());
    }
}
