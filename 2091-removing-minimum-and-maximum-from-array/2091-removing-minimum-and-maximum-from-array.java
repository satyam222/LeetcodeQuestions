class Solution {
    public int minimumDeletions(int[] nums) {
        int   min=Integer.MAX_VALUE;
        int   max=Integer.MIN_VALUE;
        int minIndex=0;
        int maxIndex=0;
        int n=nums.length;
        //findinding minIndex and max index
        for(int i=0;i<n;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                minIndex=i;
            }
            if(nums[i]>max)
            {
                max=nums[i];
                maxIndex=i;
            }
            
        }
        //delete from left
        int left=Math.max(minIndex,maxIndex)+1;//6
        //delete from right
        //System.out.println("L"+left);
        int right=n-Math.min(minIndex,maxIndex);//8-3=5
       //System.out.println("R"+right);
        //delete from left and right
        int lefRight=Math.min(minIndex,maxIndex)+1+(n-Math.max(minIndex,maxIndex));
        //System.out.println("LR"+lefRight);
        return Math.min(left,Math.min(right,lefRight));
        
        
        
        
    }
}