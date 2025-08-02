package functionalprogramming.anonymousexampleapp;

public class AnonymousExampleApp {
    public static void main(String[] args) {
        IGreet anonymousGreet = new IGreet() {
            @Override
            public void greet(String message) {
                System.out.println(message);
            }
        };
        anonymousGreet.greet("Hello");

        IMathOperations anonymousMathOperations = (s1, s2) -> {
            s1 += s2;
            return s1;
        };
        System.out.println("anonymousMathOperations.add(1.0, 2.0) -> " + anonymousMathOperations.add(1.0, 2.0));

        new Vehicle (){
            private int passengers = 0;
            public void drive(String message) {
                System.out.println("Hello, " + message);
            }
        }.drive("I'm driving");

        LambdaMsg lambdaMsg = (message, level) -> {
            System.out.println(message + " " + level);
        };
        lambdaMsg.message("I'm flying at level ", 3);
    }
}
