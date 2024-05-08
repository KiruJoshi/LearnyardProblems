class Solution {
    public String[] findRelativeRanks(int[] score) {
        int j = 1;
        int rank[] = Arrays.copyOf(score, score.length);
        
        Arrays.sort(rank);
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = rank.length - 1; i >= 0; i--) {
            map1.put(rank[i], j++);
        }
        String result[]=new String[score.length];
        int k=0;
        for(int i=0;i<score.length;i++){
            if(map1.get(score[i])==1){
            result[k]="Gold Medal";}
           else if(map1.get(score[i])==2){
            result[k]="Silver Medal";}
            else if(map1.get(score[i])==3){
            result[k]="Bronze Medal";
             }
            else{
                result[k]=String.valueOf(map1.get(score[i]));
            }
            k++;
        }

        System.out.println(Arrays.toString(rank));

        System.out.println(map1);
        return result;
    }
}
