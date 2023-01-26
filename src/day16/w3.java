package day16;

public class w3 {
    public static void main(String[] args) {
        //Example 3: Type code to print a String in reverse.
        //           For example; "Ali Can" ==> "naC ilA"
        String u = "Java";
        for(int i=u.length()-1; i>=0; i--){
            char ch = u.charAt(i);
            System.out.print(ch);
        }
System.out.println();
    }
}
