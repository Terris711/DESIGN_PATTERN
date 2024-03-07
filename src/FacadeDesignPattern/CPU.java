package FacadeDesignPattern;

public class CPU {
    public void freeze() {
        System.out.println("Somputer freezing...");
    }

    public void jump(long position) {
        System.out.println("Jumping to... " + position);
    }

    public void execute() {
        System.out.println("Computer executing commands...");
    }
}
