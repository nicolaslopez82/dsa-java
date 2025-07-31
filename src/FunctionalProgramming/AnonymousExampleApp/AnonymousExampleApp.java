package FunctionalProgramming.AnonymousExampleApp;

public class AnonymousExampleApp {
    public static void main(String[] args) {
        IGreet anonymousGreet = new IGreet() {
            @Override
            public void greet(String message) {
                System.out.println(message);
            }
        };
        anonymousGreet.greet("Hello");

        new Vehicle (){
            private int passengers = 0;
            public void drive(String message) {
                System.out.println("Hello, " + message);
            }
        }.drive("I'm driving");
    }
}
