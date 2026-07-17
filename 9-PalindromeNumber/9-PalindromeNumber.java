// Last updated: 7/17/2026, 2:59:46 PM
class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        
        
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
