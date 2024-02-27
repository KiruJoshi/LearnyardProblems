class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> result = new ArrayList<>();
        int diff = 0, check = 0;
        boolean flag=true;
        for (int i = 0; i < l.length; i++) {
             flag=true;
            int temp[] = new int[r[i] - l[i] + 1];
            temp = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(temp);//4  5 6 9
            diff = temp[1]-temp[0];//diff=1
            for (int j = 0; j < temp.length - 1; j++) {
                check=temp[j+1]-temp[j];
                if(check!=diff){
                flag=false;
                break;
                }
                
            }
            if(flag)
            result.add(true);
            else
            result.add(false);
        }

        return result;
    }
}

// 4 6 5-true
// 4 6 5 9-false
// 5 9 3 7-
// 3 5 7 9