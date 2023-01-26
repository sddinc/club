package day16;

public class w1 {
    public static void main(String[] args) {
        //Example 1: Put * between 2 consecutive characters and to the end in a String.
        //           For example; "Java" ==> J*a*v*a*
        String s = "Java";
        for(int i=0;  i<s.length(); i++){
            System.out.print(s.charAt(i) + "*");
        }

        System.out.println();
    }
}
