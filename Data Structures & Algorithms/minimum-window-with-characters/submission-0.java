class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        return "";

        int[] freq=new int[128];

        for(int i=0;i<t.length();i++)
        {
            freq[t.charAt(i)]++;
        }
        int l=0;
        int r=0;
        int c=t.length();

        int minlen=Integer.MAX_VALUE;
        int start=0;

        while(r<s.length())
        {
            char ch=s.charAt(r);

            if(freq[ch]>0)
            {
                c--;
            }

            freq[ch]--;
            r++;

            while(c==0)
            {
                if(r-l<minlen)
                {
                    minlen=r-l;
                    start=l;
                }

                char leftchar=s.charAt(l);
                freq[leftchar]++;

                if(freq[leftchar]>0)
                {
                    c++;
                }
                l++;
            }
        }
        if(minlen==Integer.MAX_VALUE)
        {
            return "";
        }
        return s.substring(start,start+minlen);
    }
}
