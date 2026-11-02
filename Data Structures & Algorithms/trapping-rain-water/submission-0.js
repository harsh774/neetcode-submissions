class Solution {
    /**
     * @param {number[]} height
     * @return {number}
     */
    trap(height) {
        let l = 0;
        let r = height.lenght-1;

        let leftMax = 0;
        let rightMax = 0;

        let water = 0;

        while(l<r){
            const lH = height[l];
            const rH = height[r];

            if(lH < rH){
                if(lH >= lMax){
                    lMax = lH;
                }else{
                    water += lMax - height[l];
                }
                l++;

            }else{
                if(rh >= rMax){
                    rMax = rh;
                }else{
                    water += rMax - height[r];
                }
                r--;
            }
        }
        return water;
    }
}
