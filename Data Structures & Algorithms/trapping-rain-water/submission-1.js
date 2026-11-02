class Solution {
    /**
     * @param {number[]} height
     * @return {number}
     */
    trap(height) {
        let l = 0;
        let r = height.length-1;

        let lMax = 0;
        let rMax = 0;

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
                if(rH >= rMax){
                    rMax = rH;
                }else{
                    water += rMax - height[r];
                }
                r--;
            }
        }
        return water;
    }
}
