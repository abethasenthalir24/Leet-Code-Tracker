// Last updated: 9/17/2026, 9:47:58 AM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] arr = s.toCharArray();
4        int left = 0;
5        int right = arr.length - 1;
6
7        while (left < right) {
8            if (!Character.isLetter(arr[left])) {
9                left++;
10            } else if (!Character.isLetter(arr[right])) {
11                right--;
12            } else {
13                char temp = arr[left];
14                arr[left] = arr[right];
15                arr[right] = temp;
16                left++;
17                right--;
18            }
19        }
20
21        return new String(arr);
22    }
23}