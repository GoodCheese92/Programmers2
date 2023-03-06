package lv0_babbling;

public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
         // 이 성 진 for
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < str.length; j++) {
                babbling[i] = babbling[i].replace(str[j], "");
            }
            if(!babbling[i].equals("")){
                answer++;
            }
            System.out.print(babbling[i] + " ");
        } // for
        System.out.println();

            return answer;
    } // end of solution

} // end of class
