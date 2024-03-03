package SingletonDesignPattern;

public class Singleton {
    private volatile static Singleton uniqueInstance;
    String name;

    private Singleton() {
    }

    // Double-check locking.
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized ((Singleton.class)){
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}


//3 ways create singleton:
//- lazy
//- eager : create and initialze it right away
//- double-check locking