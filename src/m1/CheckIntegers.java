package m1;

public class CheckIntegers {
    public static boolean isInteger(String s) {
        if (s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static int toInteger(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }
        return result;
    }

    public static void main(String[] args) {
        int countOfInt = 0;
        int countOfNonInt = 0;
        int sumOfInt = 0;
        for (int i = 0; i < args.length; i++) {
            if (isInteger(args[i])) {
                countOfInt++;
                sumOfInt += toInteger(args[i]);
            } else {
                countOfNonInt++;
            }
        }
        System.out.println("Encontrei " + countOfInt + " inteiros");
        System.out.println("Encontrei " + countOfNonInt + " não inteiros");
        System.out.println("Somatorio dos inteiros: " + sumOfInt);
    }
}
