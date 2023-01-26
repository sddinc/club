package day16;
public class w2 {
    public static void main(String[] args) {
        //Example 2: Type code to print unique characters in a String.
        //           Hello ==> Heo
        String t = "Hello";

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(t.indexOf(ch) == t.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }

        System.out.println();

    }
}
