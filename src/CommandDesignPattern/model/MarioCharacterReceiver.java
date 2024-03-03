package CommandDesignPattern.model;

public class MarioCharacterReceiver {
    private String name;

    public void moveUp() {
        System.out.println(getName() + " Moving up!");
    }

    public void moveLeft() {
        System.out.println(getName() + " Moving left!");
    }

    public void moveRight() {
        System.out.println(getName() + " Moving right!");
    }

    public void moveDown() {
        System.out.println(getName() + " Moving down!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
