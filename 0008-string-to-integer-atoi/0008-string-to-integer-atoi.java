class Solution {
    public int myAtoi(String s) {
        long num =0;
        int sign=1;
        int i=0;

        // Disregard leading whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Determine sign if defined
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i++) == '-' ? -1 : 1;
        }

        // Calculate number from string
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            num = num * 10 + (sign * (s.charAt(i++) - '0'));

            // Short-circuit return if max or min value of int exceeded
            if (num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) num;
    }
}
