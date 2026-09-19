package src.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class to check if a given input number is a strobogrammatic number.
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (upside down).
 */
public class StrobogrammaticNumber {

    private static final Map<Character, Character> STROBO_MAP = new HashMap<>();

    static {
        STROBO_MAP.put('0', '0');
        STROBO_MAP.put('1', '1');
        STROBO_MAP.put('6', '9');
        STROBO_MAP.put('8', '8');
        STROBO_MAP.put('9', '6');
    }

    /**
     * Checks if a given input number (as a String) is strobogrammatic.
     *
     * @param num the input number string
     * @return true if the number is strobogrammatic, false otherwise
     */
    public static boolean isStrobogrammatic(String num) {
        if (num == null) {
            return false;
        }

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);

            if (!STROBO_MAP.containsKey(leftChar) || STROBO_MAP.get(leftChar) != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
