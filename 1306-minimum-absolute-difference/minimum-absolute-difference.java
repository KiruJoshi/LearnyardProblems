class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

       Arrays.sort(arr);
        int min = Integer.MAX_VALUE ;
       List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
                if(Math.abs(arr[i]-arr[i+1])<min){
                   min=Math.abs(arr[i]-arr[i+1]);
                }
            }
             for(int i=0;i<arr.length-1;i++){
                 if(arr[i+1]-arr[i]==min){
                     list.add(Arrays.asList(arr[i],arr[i+1]));
                 }
          }
        

        return list;
    }
}
