// Last updated: 7/17/2026, 2:49:21 PM
1class Solution {
2    public boolean isNumber(String s) {
3        return s.matches("[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?");
4    }
5}