import java.util.Scanner;

public class readVar {
    private static void pt(Object value) {
        System.out.print(value);
    }
    private static void ptl(Object value) {
        System.out.println(value);
    }
    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);
    static Scanner scanDouble = new Scanner(System.in);
    static Scanner scanFloat = new Scanner(System.in);
    static Scanner scanBoolean = new Scanner(System.in);
    static String empty = "";
    public static int readInt(int min, int max, String prompt, String reprompt, boolean first) {
        int value;
        String check;
        if (first) pt(prompt);
        else pt(reprompt);
        if (scanInt.hasNextInt()) {
            value = scanInt.nextInt();
            if ((value >= min && value <= max)) {
                return value;
            }
        }
        check = scanInt.nextLine();
        if (check.isEmpty()) {
            scanInt.nextLine();
        }
        return readInt(min, max, prompt, reprompt, false);
    }
    public static int readInt(int min, int max, String prompt, String reprompt) {
        return readInt(min, max, prompt, reprompt, true);
    }
    public static int readInt(int min, int max, String prompt) {
        return readInt(min, max, prompt, prompt, true);
    }
    public static int readInt(int min, int max) {
        return readInt(min, max, empty, empty, true);
    }
    public static int readInt(String prompt, String reprompt) {
        return readInt(Integer.MIN_VALUE, Integer.MAX_VALUE, prompt, reprompt, true);
    }
    public static int readInt(String prompt) {
        return readInt(Integer.MIN_VALUE, Integer.MAX_VALUE, prompt, prompt, true);
    }
    public static String readLine(String prompt, String reprompt, boolean first) {
        String value;
        if (first) {
            pt(prompt);
        } else {
            pt(reprompt);
        }
        value = scanString.nextLine();
        if (!value.isEmpty()) {
            return value;
        }
        return readLine(prompt, reprompt, false);
    }
    public static String readLine(String prompt, String reprompt) {
        return readLine(prompt, reprompt, true);
    }
    public static String readLine(String prompt) {
        return readLine(prompt, prompt, true);
    }
    public static String readLine() {
        return readLine(empty, empty, true);
    }
    public static double readDouble(double min, double max, String prompt, String reprompt, boolean first) {
        double value;
        String check;
        if (first) pt(prompt);
        else pt(reprompt);
        if (scanDouble.hasNextDouble()) {
            value = scanDouble.nextDouble();
            if ((value >= min && value <= max)) {
                return value;
            }
        }
        check = scanDouble.nextLine();
        if (check.isEmpty()) {
            scanDouble.nextLine();
        }
        return readDouble(min, max, prompt, reprompt, false);
    }
    public static double readDouble(double min, double max, String prompt, String reprompt) {
        return readDouble(min, max, prompt, reprompt, true);
    }
    public static double readDouble(double min, double max, String prompt) {
        return readDouble(min, max, prompt, prompt, true);
    }
    public static double readDouble(double min, double max) {
        return readDouble(min, max, empty, empty, true);
    }
    public static double readDouble(String prompt, String reprompt) {
        return readDouble(-Double.MAX_VALUE, Double.MAX_VALUE, prompt, reprompt, true);
    }
    public static double readDouble(String prompt) {
        return readDouble(-Double.MAX_VALUE, Double.MAX_VALUE, prompt, prompt, true);
    }
    public static float readFloat(float min, float max, String prompt, String reprompt, boolean first) {
        float value;
        String check;
        if (first) pt(prompt);
        else pt(reprompt);
        if (scanFloat.hasNextFloat()) {
            value = scanFloat.nextFloat();
            if ((value >= min && value <= max)) {
                return value;
            }
        }
        check = scanFloat.nextLine();
        if (check.isEmpty()) {
            scanFloat.nextLine();
        }
        return readFloat(min, max, prompt, reprompt, false);
    }
    public static float readFloat(float min, float max, String prompt, String reprompt) {
        return readFloat(min, max, prompt, reprompt, true);
    }
    public static float readFloat(float min, float max, String prompt) {
        return readFloat(min, max, prompt, prompt, true);
    }
    public static float readFloat(float min, float max) {
        return readFloat(min, max, empty, empty, true);
    }
    public static float readFloat(String prompt, String reprompt) {
        return readFloat(-Float.MAX_VALUE, Float.MAX_VALUE, prompt, reprompt, true);
    }
    public static float readFloat(String prompt) {
        return readFloat(-Float.MAX_VALUE, Float.MAX_VALUE, prompt, prompt, true);
    }
    public static boolean readBoolean(String prompt, String reprompt, boolean first) {
        boolean value;
        if (first) pt(prompt);
        else pt(reprompt);
        if (scanBoolean.hasNextBoolean()) {
            value = scanBoolean.nextBoolean();
            return value;
        }
        scanBoolean.nextLine();
        return readBoolean(prompt, reprompt, false);
    }
    public static boolean readBoolean(String prompt, String reprompt) {
        return readBoolean(prompt, reprompt, true);
    }
    public static boolean readBoolean(String prompt) {
        return readBoolean(prompt, prompt, true);
    }
    public static boolean readBoolean() {
        return readBoolean(empty, empty, true);
    }
    public static void close() {
        scanInt.close();
        scanString.close();
        scanDouble.close();
        scanFloat.close();
        scanBoolean.close();
    }
}
