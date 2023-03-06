package Test01;

import java.util.HashSet;

public class test01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);
        String str = "a";
        if(set.contains(str)){
            System.out.println("포함");
        } else {
            System.out.println("미포함");
        }
    } // end of main
} // end of class
