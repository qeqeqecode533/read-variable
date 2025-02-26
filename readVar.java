import java.util.Scanner;

public class readVar {
    private static void pt(Object value) {
        System.out.print(value);
    }
    private static void ptl(Object value) {
        System.out.println(value);
    }
    static Scanner scan = new Scanner(System.in);
    static String empty = "";
    public static int readInt(int min, int max, String prompt, String reprompt) {
        int value;
        String check;
        pt(prompt);
        while (true) {
            check = scan.nextLine();
            if (!check.isEmpty()) {
                try {
                    value = Integer.parseInt(check.trim());
                } catch (NumberFormatException e) {
                    pt(reprompt);
                    continue;
                }
                if (value >= min && value <= max) {
                    return value;
                }
            }
            pt(reprompt);
        }
    }
    public static int readInt(int min, int max, String prompt) {
        return readInt(min, max, prompt, prompt);
    }
    public static int readInt(int min, int max) {
        return readInt(min, max, empty, empty);
    }
    public static int readInt(int min) { // assume minimum if only 1 number
        return readInt(min, Integer.MAX_VALUE, empty, empty);
    }
    public static int readInt(int min, String prompt) {
        return readInt(min, Integer.MAX_VALUE, prompt, prompt);
    }
    public static int readInt(int min, String prompt, String reprompt) {
        return readInt(min, Integer.MAX_VALUE, prompt, reprompt);
    }
    public static int readInt(String prompt, String reprompt) {
        return readInt(Integer.MIN_VALUE, Integer.MAX_VALUE, prompt, reprompt);
    }
    public static int readInt(String prompt) {
        return readInt(Integer.MIN_VALUE, Integer.MAX_VALUE, prompt, prompt);
    }
    public static String readLine(String prompt, String reprompt) {
        String value;
        pt(prompt);
        while (true) {
            value = scan.nextLine();
            if (!value.isEmpty()) {
                return value;
            }
            pt(reprompt);
        }
    }
    public static String readLine(String prompt) {
        return readLine(prompt, prompt);
    }
    public static String readLine() {
        return readLine(empty, empty);
    }
    public static double readDouble(double min, double max, String prompt, String reprompt) {
        double value;
        String check;
        pt(prompt);
        while (true) {
            check = scan.nextLine();
            if (!check.isEmpty()) {
                try {
                    value = Double.parseDouble(check.trim());
                } catch (NumberFormatException e) {
                    pt(reprompt);
                    continue;
                }
                if (value >= min && value <= max) {
                    return value;
                }
            }
            pt(reprompt);
        }
    }
    public static double readDouble(double min, double max, String prompt) {
        return readDouble(min, max, prompt, prompt);
    }
    public static double readDouble(double min, double max) {
        return readDouble(min, max, empty, empty);
    }
    public static double readDouble(double min) {
        return readDouble(min, Double.MAX_VALUE, empty, empty);
    }
    public static double readDouble(double min, String prompt) {
        return readDouble(min, Double.MAX_VALUE, prompt, prompt);
    }
    public static double readDouble(double min, String prompt, String reprompt) {
        return readDouble(min, Double.MAX_VALUE, prompt, reprompt);
    }
    public static double readDouble(String prompt, String reprompt) {
        return readDouble(-Double.MAX_VALUE, Double.MAX_VALUE, prompt, reprompt);
    }
    public static double readDouble(String prompt) {
        return readDouble(-Double.MAX_VALUE, Double.MAX_VALUE, prompt, prompt);
    }
    public static float readFloat(float min, float max, String prompt, String reprompt) {
        float value;
        String check;
        pt(prompt);
        while (true) {
            check = scan.nextLine();
            if (!check.isEmpty()) {
                try {
                    value = Float.parseFloat(check.trim());
                } catch (NumberFormatException e) {
                    pt(reprompt);
                    continue;
                }
                if (value >= min && value <= max) {
                    return value;
                }
            }
            pt(reprompt);
        }
    }
    public static float readFloat(float min, float max, String prompt) {
        return readFloat(min, max, prompt, prompt);
    }
    public static float readFloat(float min, float max) {
        return readFloat(min, max, empty, empty);
    }
    public static float readFloat(float min) {
        return readFloat(min, Float.MAX_VALUE, empty, empty);
    }
    public static float readFloat(float min, String prompt) {
        return readFloat(min, Float.MAX_VALUE, prompt, prompt);
    }
    public static float readFloat(float min, String prompt, String reprompt) {
        return readFloat(min, Float.MAX_VALUE, prompt, reprompt);
    }
    public static float readFloat(String prompt, String reprompt) {
        return readFloat(-Float.MAX_VALUE, Float.MAX_VALUE, prompt, reprompt);
    }
    public static float readFloat(String prompt) {
        return readFloat(-Float.MAX_VALUE, Float.MAX_VALUE, prompt, prompt);
    }
    public static boolean readBool(String prompt, String reprompt) {
        boolean value;
        String check;
        pt(prompt);
        while (true) {
            check = scan.nextLine();
            if (!check.isEmpty()) {
                try {
                    if (check.equalsIgnoreCase("true")) {
                        value = true;
                    } else if (check.equalsIgnoreCase("false")) {
                        value = false;
                    } else {
                        throw new IllegalArgumentException("Invalid boolean value: " + check);
                    }
                } catch (IllegalArgumentException e) {
                    pt(reprompt);
                    continue;
                }
                return value;
            }
            pt(reprompt);
        }
    }
    public static boolean readBool(String prompt) {
        return readBool(prompt, prompt);
    }
    public static boolean readBool() {
        return readBool(empty, empty);
    }
    public static void close() {
        scan.close();
        ptl("Scanner closed.");
    }
}
