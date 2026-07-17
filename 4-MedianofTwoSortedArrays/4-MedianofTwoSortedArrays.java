// Last updated: 7/17/2026, 2:46:54 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3      
4        if (nums1.length > nums2.length) {
5            return findMedianSortedArrays(nums2, nums1);
6        }
7
8        int m = nums1.length;
9        int n = nums2.length;
10
11        int left = 0, right = m;
12
13        while (left <= right) {
14            int partitionX = (left + right) / 2;
15            int partitionY = (m + n + 1) / 2 - partitionX;
16
17            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
18            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
19
20            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
21            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
22
23            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
24   
25                if ((m + n) % 2 == 0) {
26                    return (Math.max(maxLeftX, maxLeftY) +
27                            Math.min(minRightX, minRightY)) / 2.0;
28                }
29                
30                else {
31                    return Math.max(maxLeftX, maxLeftY);
32                }
33            } 
34            else if (maxLeftX > minRightY) {
35                right = partitionX - 1;
36            } 
37            else {
38                left = partitionX + 1;
39            }
40        }
41
42        return 0.0;
43    }
44}