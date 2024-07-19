class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
       HashSet<Integer> min_list=new HashSet<>();
        HashSet<Integer> max_list=new HashSet<>();
       ArrayList<Integer> list=new ArrayList<>();
        //list.add(element);
        for(int i=0;i<matrix.length; i++){
            int min_ele=Integer.MAX_VALUE;
            for(int j=0; j<matrix[0].length; j++){
            min_ele=Math.min(matrix[i][j],min_ele);//row min
            }
            min_list.add(min_ele);
        }
         for(int i=0;i<matrix[0].length; i++){
            int max_ele=Integer.MIN_VALUE;
            for(int j=0; j<matrix.length; j++){
            max_ele=Math.max(matrix[j][i],max_ele);//max of each col
            }
            max_list.add(max_ele);
        }
        
         for(int i=0;i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(min_list.contains(matrix[i][j]) && max_list.contains(matrix[i][j]))
                list.add(matrix[i][j]);
                }
            
        }
        return list;
    }
}