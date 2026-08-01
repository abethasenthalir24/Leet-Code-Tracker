// Last updated: 8/1/2026, 7:20:37 AM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(nums);
5        int n = nums.length;
6
7        for (int i = 0; i < n - 3; i++) {
8            if (i > 0 && nums[i] == nums[i - 1]) continue;
9
10            for (int j = i + 1; j < n - 2; j++) {
11                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
12
13                int left = j + 1;
14                int right = n - 1;
15
16                while (left < right) {
17                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
18
19                    if (sum == target) {
20                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
21                        left++;
22                        right--;
23
24                        while (left < right && nums[left] == nums[left - 1]) left++;
25                        while (left < right && nums[right] == nums[right + 1]) right--;
26                    } else if (sum < target) {
27                        left++;
28                    } else {
29                        right--;
30                    }
31                }
32            }
33        }
34
35        return res;
36    }
37}