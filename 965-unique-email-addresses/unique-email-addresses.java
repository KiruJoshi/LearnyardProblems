class Solution {
    public int numUniqueEmails(String[] emails) {

        int n = emails.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
              StringBuilder strBuild = new StringBuilder();
            for (int j = 0; j < emails[i].length(); j++) {
                if (emails[i].charAt(j) == '.') {
                    continue;
                } else if (emails[i].charAt(j) == '+' || emails[i].charAt(j) == '@') {
                    break;
                } else {
                    strBuild.append(emails[i].charAt(j));
                }
            }
            for(int k=emails[i].indexOf("@");k<emails[i].length();k++){
                strBuild.append(emails[i].charAt(k));
            }
            map.put(strBuild.toString(), map.getOrDefault(strBuild.toString(), 0) + 1);

        }
        return map.size();
    }
}