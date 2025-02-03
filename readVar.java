import java.util.Scanner;

public class readVar {
    static Scanner scanner = new Scanner(System.in);
    static String empty = "";
    public static int readInt(int min, int max, String prompt, String reprompt) {
        int value;
        System.out.print(prompt);
        while (true) { 
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.print(reprompt);
        }
        return value;
    }
    public static int readInt(int min, int max, String prompt) {
        return readInt(min, max, prompt, empty); // no reprompt
    }
    public static int readInt(String prompt) {
        return readInt(Integer.MIN_VALUE, Integer.MAX_VALUE, prompt, empty); // no reprompt
    }
    public static int readInt(String prompt, String reprompt) {
        return readInt(Integer.MIN_VALUE, Integer.MAX_VALUE, prompt, reprompt);
    }
    public static int readInt() {
        return readInt(Integer.MIN_VALUE, Integer.MAX_VALUE, empty, empty); // no values input
    }
    public static int readInt(int min, int max) {
        return readInt(min, max, empty, empty); // only min max values
    }
    public static double readDouble(double min, double max, String prompt, String reprompt) {
        double value;
        System.out.print(prompt);
        while (true) { 
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value >= min && value <= max) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.print(reprompt);
        }
        return value;
    }
    public static double readDouble(double min, double max, String prompt) {
        return readDouble(min, max, prompt, empty); // no reprompt
    }
    public static double readDouble(String prompt) {
        return readDouble(-Double.MAX_VALUE, Double.MAX_VALUE, prompt, empty); // no reprompt
    }
    public static double readDouble(String prompt, String reprompt) {
        return readDouble(-Double.MAX_VALUE, Double.MAX_VALUE, prompt, reprompt);
    }
    public static double readDouble() {
        return readDouble(-Double.MAX_VALUE, Double.MAX_VALUE, empty, empty); // no values input
    }
    public static double readDouble(double min, double max) {
        return readDouble(min, max, empty, empty); // only min max values
    }
    public static String readString(String prompt, String reprompt) {
        String value;
        System.out.print(prompt);
        while (true) {
            value = scanner.nextLine();
            if (!value.isEmpty()) {
                break;
            }
            System.out.print(reprompt);
        }
        return value;
    }
    public static String readString(String prompt) {
        return readString(prompt, empty); // no reprompt
    }
    public static String readString() {
        return readString(empty, empty); // no values input
    }

    public static boolean readBoolean(String prompt, String reprompt) {
        boolean value;
        System.out.print(prompt);
        while (true) {
            if (scanner.hasNextBoolean()) {
                value = scanner.nextBoolean();
                break;
            } else {
                scanner.next();
            }
            System.out.print(reprompt);
        }
        return value;
    }
    public static boolean readBoolean(String prompt) {
        return readBoolean(prompt, empty); // no reprompt
    }
    public static boolean readBoolean() {
        return readBoolean(empty, empty); // no values input
    }

    public static float readFloat(float min, float max, String prompt, String reprompt) {
        float value;
        System.out.print(prompt);
        while (true) {
            if (scanner.hasNextFloat()) {
                value = scanner.nextFloat();
                if (value >= min && value <= max) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.print(reprompt);
        }
        return value;
    }
    public static float readFloat(float min, float max, String prompt) {
        return readFloat(min, max, prompt, empty); // no reprompt
    }
    public static float readFloat(String prompt) {
        return readFloat(-Float.MAX_VALUE, Float.MAX_VALUE, prompt, empty); // no reprompt
    }
    public static float readFloat(String prompt, String reprompt) {
        return readFloat(-Float.MAX_VALUE, Float.MAX_VALUE, prompt, reprompt);
    }
    public static float readFloat() {
        return readFloat(-Float.MAX_VALUE, Float.MAX_VALUE, empty, empty); // no values input
    }
    public static float readFloat(float min, float max) {
        return readFloat(min, max, empty, empty); // only min max values
    }
}
