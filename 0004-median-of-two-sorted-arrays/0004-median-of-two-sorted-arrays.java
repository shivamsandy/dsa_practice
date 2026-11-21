class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1  = nums1.length;
        int n2  = nums2.length;
        int merged[] = new int[n1+n2];
        int p1=0;
        int p2=0;
        int p3=0;
        while(p1<n1 && p2<n2){
            if(nums1[p1]<=nums2[p2]){
                merged[p3++]=nums1[p1++];
            }else {
                merged[p3++]=nums2[p2++];
            }

        }
        while(p1<n1){
            merged[p3++] = nums1[p1++];
        }
          while(p2<n2){
            merged[p3++] = nums2[p2++];
        }
    int n =merged.length;
    
        if(n %2==0){
            return (merged[n/2] + merged[n/2-1])/2.0;
          
        }else{
           return merged[n/2];
        }
        
    }
}