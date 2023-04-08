class Solution {
public:
    int lengthOfLongestSubstring(string s) 
    {
        int len=s.length();
        unordered_set<char> visit;
        int ans=0;
        for(int i=0;i<len;i++)
        {
            visit.clear();
            int n=0;
            for(int j=i;j<len;j++)
            {
                if(visit.count(s[j]))
                {
                    break;
                }
                else
                {
                    visit.insert(s[j]);
                    n++;
                }
                ans=max(ans,n);
            }
        }
        return ans;
    }
};