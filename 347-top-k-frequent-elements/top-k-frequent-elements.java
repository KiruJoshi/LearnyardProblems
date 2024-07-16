class Pair{
    int ele;
    int freq;
    Pair(int ele, int freq){
        this.ele=ele;
        this.freq=freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map=new HashMap<>();
    List<Pair> list=new ArrayList<>();
    int result[]=new int[k];
    for(int i=0;i<nums.length;i++){
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    }  
    for(Map.Entry<Integer, Integer> entry:map.entrySet()){
        Pair pair=new Pair(entry.getKey(),entry.getValue());
        list.add(pair);
    }
    Collections.sort(list,(a,b)->b.freq-a.freq);
    // for(Pair pair:list){
    //     System.out.println(pair.ele+" - "+pair.freq);
    // }
    for(int i=0;i<list.size() && i<k;i++){
        result[i]=list.get(i).ele;
    }
    


     
 
    return result;
    }
}