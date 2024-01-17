package cn.yasyx;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        new Solution().strStr("sadbutsad","sad");
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
           return haystack.indexOf(needle);
        }
    }
}
