class Solution {
    public int reverse(int x) {
        int reverse = 0;
        for (int i = x; i != 0; i /= 10) {
            int digit = i % 10;
              x = x / 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {

                return 0;
            }
            reverse = reverse * 10 + digit;
          
        }
        return reverse;

    }
}