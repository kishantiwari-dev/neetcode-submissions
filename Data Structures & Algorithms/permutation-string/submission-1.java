class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=s1.length();
        if(l>s2.length())
        {
            return false;
        }
          int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq1[s1.charAt(i)-'a']++;
        }
        int i=0;
        int j=0;
        while(j<s2.length())
        {
            freq2[s2.charAt(j)-'a']++;
            if (j - i + 1 > s1.length()) {
                freq2[s2.charAt(i) - 'a']--;
                i++;
            }
             if (j - i + 1 == s1.length()) {
                if (Arrays.equals(freq1, freq2)) {
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}
