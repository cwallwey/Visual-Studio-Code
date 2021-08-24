public class App {

    // mathematische Berechnungen
    public static int add(int a, int b) {
        return a + b;

        // bla
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    // Überprüfung der Eingabewerte auf numerisch
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            System.out.println("\n>" + str + "< ist keine Zahl.\n");
            return false;
        }
    }

    // Hier startet das HAUPTPROGRAMM
    public static void main(String[] args) throws Exception {
        if (args.length == 3) {
            if (isNumeric(args[1]) && isNumeric(args[2])) {
                int x = Integer.parseInt(args[1]);
                int y = Integer.parseInt(args[2]);
                System.out.println();
                switch (args[0]) {
                    case "add":
                        System.out.println(x + " + " + y + " = " + add(x, y));
                        break;
                    case "substract":
                        System.out.println(x + " - " + y + " = " + substract(x, y));
                        break;
                    case "multiply":
                        System.out.println(x + " * " + y + " = " + multiply(x, y));
                        break;
                    case "divide":
                        System.out.println(x + " / " + y + " = " + divide(x, y));
                        break;
                    default:
                        System.out.println(">" + args[0] + "< ist keine gültige Rechenoperation.");
                }
                System.out.println();
            }
        } else {
            System.out.println("\n*** Syntax: java App [add|substract|multiply|divide] <int> <int> ***\n");
        }

    }
}
