package lv0_babbling;
/*
머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
 */

/*
입출력 예 #1
["aya", "yee", "u", "maa", "wyeoo"]에서 발음할 수 있는 것은 "aya"뿐입니다. 따라서 1을 return합니다.
입출력 예 #2
["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]에서 발음할 수 있는 것은 "aya" + "ye" = "ayaye", "ye", "ye" + "ma" + "woo" = "yemawoo"로 3개입니다.
따라서 3을 return합니다.
 */
public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String[] babbling = {"aya", "yee" , "u", "maa", "wyeoo"};
        String[] babbling2 = {"ayaye", "uuuma" , "ye", "yemawoo", "ayaa"};

        int num = sl.solution(babbling);
        int num2= sl.solution(babbling2);
        System.out.println("정답 : " + num);
        System.out.println("정답 : " + num2);

        System.out.println(babbling[0].replace("aya", "1"));
        System.out.println(babbling[1].replace("aya", "1"));

    }
}
