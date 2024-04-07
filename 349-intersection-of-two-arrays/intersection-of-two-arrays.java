class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      ArrayList<Integer> arr = new ArrayList<>();
            int prev = -1;
            boolean flag;
            Arrays.sort(nums1);
        for(int val : nums1){
            flag = false;
                if(val==prev) continue;
                else{
                    flag = bs(nums2,val);
                    if(flag){
                        arr.add(val);
                    }
                }
            prev = val;
        }
        int ans[] = new int[arr.size()];

        for(int i=0 ; i<arr.size();i++){
            ans[i]  = arr.get(i); 
        }

return ans;

    }
    public static boolean bs(int[] nums2 , int target){
            Arrays.sort(nums2);

            int i=0,j=nums2.length-1;
            while(i<=j){
                int mid = i + (j-i)/2;
                if(nums2[mid]==target){
                    return true;
                }
                else if(nums2[mid]<target){
                    i=mid+1;
                }
                else
                    j=mid-1;
            }
            return false;
    }  
    }
