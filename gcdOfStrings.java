class Solution {
    public String gcdOfStrings(String str1, String str2) {
      int n1 = str1.length();
      int n2 = str2.length();

      int minLen = Math.min(n1, n2);
      for(int len = minLen; len>0; len--){
        String candidate = str1.substring(0, len);
        if(isDivisor(candidate, str1)&& isDivisor(candidate, str2)){
          return candidate;
        }
      }
      return "";              
    }
    private boolean isDivisor(String candidate, String original){
      int len = candidate.length();
      int n = original.length();
      if(n% len !=0){
        return false;
      }
      StringBuilder sb = new StringBuilder();
      for(int i =0; i<n/ len; i++){
        sb.append(candidate);
      }
      return sb.toString().equals(original);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(sol.gcdOfStrings(str1, str2));
        str1 = "ABABAB";
        str2 = "ABAB";
        System.out.println(sol.gcdOfStrings(str1, str2));
        str1 = "LEET";
        str2 = "CODE";
        System.out.println(sol.gcdOfStrings(str1, str2));
    }
}