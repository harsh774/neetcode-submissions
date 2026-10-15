class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> prf;
        vector<int> suf;
        vector<int> ans;
        int prod = 1;
        for(int i=0;i<nums.size();i++){
            prod *=nums[i];
            prf.push_back(prod/nums[i]);
        }
        prod = 1;
        for(int i=nums.size()-1;i>=0;i--){
            prod *=nums[i];
            suf.push_back(prod/nums[i]);
        }
        reverse(suf.begin(),suf.end());
        for(int i=0;i<nums.size();i++){
           ans.push_back(prf[i]*suf[i]);
        }
        return ans;
    }
};
