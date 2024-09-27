class Solution {
    public int maximizeSum(int[] a, int k) {
       int max_ele=Integer.MIN_VALUE;
       int max_sum=0;
       	for(int i=0;i<a.length;i++){
            max_ele=Math.max(max_ele,a[i]); 

        }

		max_sum=max_ele*k+((k-1)*(k)/2);
		return max_sum; 
    }
}

/*
k=6. max-ele=5
max-sum=5+6+7+8+9+10=5+(5+1)+(5+2)+(5+3)+(5+4)+(5+5)=5*6+(1+2+3+4+5)
n=(k+1)*(k)
*/