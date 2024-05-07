package designPattern.singleton;

public class Singleton {
    private static Singleton singletonObj;


    private Singleton() {

    }

    public static  Singleton getSingletonClass() {
        if (singletonObj == null) {
            synchronized (Singleton.class) {
                if (singletonObj == null) {
                    singletonObj = new Singleton();
                }
            }
        }
        return singletonObj;
    }
}
