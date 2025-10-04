class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int l;   //breakpoint
        int n = nums.size();
        int flag = 0;
        for(int i=n-1; i>0;i--){
            if(nums[i]>nums[i-1]){
                l = i-1;
                flag = 1;
                break;
            }
        }
        if(flag==0){
            reverse(nums.begin(),nums.end());
            return;
        }
        
        for(int i=n-1;i>=0;i--){
            
            if(nums[i]>nums[l]){
                swap(nums[l],nums[i]);
       
                reverse(nums.begin()+l+1,nums.end());
                break;
            }
            

            
        }
        

        
    }
};