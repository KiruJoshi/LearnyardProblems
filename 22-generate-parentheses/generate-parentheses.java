class Solution {
    List<String> ans = new ArrayList<>();
    public void generateParenthesisHelper(int op, int cl, String partialAns){
        if(op == 0 && cl == 0){
            ans.add(partialAns);
            return;
        }

        if(op > 0){
            generateParenthesisHelper(op-1,cl,partialAns+"(");
        }
        if(cl>0 && cl>op){
             generateParenthesisHelper(op,cl-1,partialAns+")");
        }
        return;
    }
    public List<String> generateParenthesis(int n) {
        generateParenthesisHelper(n,n,"");
        return ans;
    }

}