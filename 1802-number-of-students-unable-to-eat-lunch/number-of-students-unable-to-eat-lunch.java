class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
        }

        for (int i = 0; i < sandwiches.length; i++) {
           
            if (sandwiches[i] == 0 && zeroCount == 0) {
                return oneCount;
            }
            if (sandwiches[i] == 1 && oneCount == 0) {
                return zeroCount;
            }
              if (sandwiches[i] == 0) {
                zeroCount--;
            } else {
                oneCount--;
            }
           
        }
        return 0;
    }
}