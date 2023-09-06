class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m;
        // for(int i:nums2){
        //     nums1[a]=i;
        //     a++;
        // }

        // for(int i=0;i<n+m;i++){
        //     for(int j=0;j<n+m-i-1;j++){
        //         if(nums1[j]>nums1[j+1]){
        //             int temp=nums1[j];
        //             nums1[j]=nums1[j+1];
        //             nums1[j+1]=temp;
        //         }
        //     }
        // }

        int temp[]=new int[m];
        for(int i=0;i<m;i++){
            temp[i]=nums1[i];
        }

        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(temp[i]<nums2[j]){
                nums1[k++]=temp[i++];
            }else{
                nums1[k++]=nums2[j++];
            }
        }

        while(i<m){
            nums1[k++]=temp[i++];
        }

        while(j<n){
            nums1[k++]=nums2[j++];
        }
    }
}