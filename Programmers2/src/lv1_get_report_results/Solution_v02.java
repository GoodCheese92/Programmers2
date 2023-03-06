package lv1_get_report_results;

import java.util.HashSet;

public class Solution_v02 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // id_list에 있는 사람들이 신고한 결과가 겹치지 않게 set으로 저장
        HashSet<String> report_set[] = new HashSet[id_list.length];
        for (int i = 0; i < report_set.length; i++) {
            report_set[i] = new HashSet<>();
        } // for

        // report_set에 중복된 값이 안들어가게 id_list의 index로 report_set[]의 index에 맞게 신고한 사람을 저장
        for (int i = 0; i < report.length; i++) {
            String reporter = report[i].substring(0, report[i].indexOf(" "));
//            System.out.println("reporter : " + reporter);
            String criminal = report[i].substring(report[i].indexOf(" ") + 1);
//            System.out.println("criminal : " + criminal);
            for (int j = 0; j < id_list.length; j++) {
                if (reporter.equals(id_list[j])) {
//                    System.out.println(j);
                    report_set[j].add(criminal);
                }
            }
        } // for

        // id_list에 index에 맞게 신고당한 게 몇번인지 report_num에 저장
        int[] report_num = new int[id_list.length];
        for (int i = 0; i < report_set.length; i++) {
//            System.out.println(i + " : " + report_set[i]);
            for (int j = 0; j < id_list.length; j++) {
                if (report_set[i].contains(id_list[j])) {
                    report_num[j]++;
                }
            } // inner for
        } // for

//        for (int i = 0; i < report_num.length; i++) {
//            System.out.println("report_num " + i + " : " + report_num[i]);
//        }

        for (int i = 0; i < report_num.length; i++) {
            if (report_num[i] >= k) {
                for (int j = 0; j < report_set.length; j++) {
                    if (report_set[j].contains(id_list[i])) { // 보고받을 사람
                        answer[j]++;
                    }
                }
            }
        } // for

        // id_list : 이용자
        // report_set : 신고한 사람
        // report_num : 신고당한 횟수
        // answer : 보고받는 횟수
        return answer;
    } // end of solution()
} // end of class
