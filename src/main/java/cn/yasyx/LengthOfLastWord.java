package cn.yasyx;

public class LengthOfLastWord {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.lengthOfLastWord("q");
    }

    static class Solution {
        public int lengthOfLastWord(String s) {
            int n = s.length();
            char space = ' ';
            int beigin = 0;
            int end = 1;
            for (int i = n-1 ;i > 0 ; i-- ){
                if(space != s.charAt(i) && i > end){
                    end = i;
                } else if(space == s.charAt(i) && end != 0 ){
                    beigin = i + 1;
                    break;
                }
            }

            return end - beigin;
        }
    }
}



