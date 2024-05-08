class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        //String ans[] = new String[list1.length];
        ArrayList<String> ansList = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j]) && min >= (i + j)) {
                    if (min > (i + j)) {
                        ansList.clear(); // Clear the list if a new minimum is found
                        min = i + j;
                    }
                    ansList.add(list1[i]);
                }
            }
        }

        String[] ans = new String[ansList.size()];
        ansList.toArray(ans);
        return ans;
    }
}