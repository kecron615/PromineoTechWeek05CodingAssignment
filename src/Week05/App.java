package Week05;

public class App {

    public static void main(String[] args) {

        String message = "Hello";

        Logger.AsteriskLogger asteriskLogger = new Logger().new AsteriskLogger();
        Logger.SpacedLogger spacedLogger = new Logger().new SpacedLogger();

        asteriskLogger.log(message);
        System.out.println("---------------------------------");
        asteriskLogger.error(message);
        System.out.println("---------------------------------");

        spacedLogger.log(message);
        System.out.println("---------------------------------");

        spacedLogger.error(message);
    }
}
