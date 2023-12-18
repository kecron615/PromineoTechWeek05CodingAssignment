package Week05;

public class Logger {

    public void log(String message) {
        // TODO Auto-generated method stub
        System.out.println(message);
    }

    public void error(String message) {
        // TODO Auto-generated method stub
        System.out.println("ERROR: " + message);
    }

    public class AsteriskLogger extends Logger {

        public void log(String message) {
            System.out.println("***" + message + "***");
        }

        public void error(String message) {
            System.out.println("****************");
            System.out.println("***Error: " + message + "***");
            System.out.println("****************");
        }
    }

    public class SpacedLogger extends Logger {

        public void log(String message) {
            for (int i = 0; i < message.length(); i++) {
                System.out.print(message.charAt(i) + " ");
            }
            System.out.println();
        }

        public void error(String message) {
        	System.out.print("ERROR: ");
        	for (int i = 0; i < message.length(); i++) {
               System.out.print(message.charAt(i) + " ");
            }
            System.out.println();
        }
    }
}
