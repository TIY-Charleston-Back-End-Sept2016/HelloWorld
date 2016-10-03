/**
 * Created by zach on 10/3/16.
 */
public class AnonymousFunctionExample implements Runnable {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();

        Runnable r2 = () -> {
            System.out.println("Hello from anonymous function!");
        };

        r2.run();

        AnonymousFunctionExample r3 = new AnonymousFunctionExample();
        r3.run();
    }

    @Override
    public void run() {
        System.out.println("Hello from separate method!");
    }
}
