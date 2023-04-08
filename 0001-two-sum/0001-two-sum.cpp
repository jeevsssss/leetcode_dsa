class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int>hash;
        for(int i=0;i<nums.size();i++)
        {
            int x=target-nums[i];
            if(hash.count(x))
            {
                return {hash[x],i};
            }
            hash[nums[i]]=i;
        }
        return {};
    }

};

