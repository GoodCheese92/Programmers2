package lv1_get_report_results;

import java.util.HashSet;

public class Solution_v02 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        // id_list에 있는 사람들이 신고한 결과가 겹치지 않게 set으로 저장
        HashSet<String> report_set[] = new HashSet[id_list.length];
        for (int i = 0; i < report_set.length; i++) {
            report_set[i] = new HashSet<>();
        } // for
        
        // report_set에 중복된 값이 안들어가게 id_list의 index로 report_set[]의 index에 맞게 신고한 사람을 저장
        for (int i = 0; i < report.length; i++) {
            String reporter = report[i].substring(0, report[i].indexOf(" "));
            System.out.println("reporter : " + reporter);
            String criminal = report[i].substring(report[i].indexOf(" ") + 1);
            System.out.println("criminal : " + criminal);
            for (int j = 0; j < id_list.length; j++) {
                if (reporter.equals(id_list[j])) {
                    System.out.println(j);
                    report_set[j].add(criminal);
                }
            }
        } // for

        int[] report_num = new int[id_list.length];
        for(int i=0; i<report_set.length; i++){
            for(int j = 0; j<report_set[i].size(); j++){

            } // inner for
        } // for

        return answer;
    } // end of solution()
} // end of class
