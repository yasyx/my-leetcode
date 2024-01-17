package cn.yasyx;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseWords("the sky is blue");
    }


    static  class Solution {
        public String reverseWords(String s) {
            // 统一字符串行为
            s = " " + s;
            StringBuilder ans = new StringBuilder();
            int start = s.length() - 1;
            int end = s.length() - 1 ;
            // 开始截取每个单词
            while (start >= 0){
//                if(start < end && (s.charAt(start) == ' ' || start == 0)){
//                    ans.append(s.substring(start , end + 1));
//                    end = start;
//                }
                if(s.charAt(end) == ' '){
                    end--;
                    start= end;
                }else {
                    start--;

                }
                ans.append(s.substring(start,end+1)).append(" ");
            }
            System.out.println(ans.toString().trim());
            return  ans.toString().trim();
        }
    }
}
