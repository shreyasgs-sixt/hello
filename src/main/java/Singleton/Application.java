package Singleton;

public class Application {
    public static void main(String[] args) {
        Single s = Single.getSingle();
        System.out.println(s.hashCode());
        Single single = Single.getSingle();
        System.out.println(single.hashCode());
    }
}
