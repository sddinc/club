package day6;
/* https://codingbat.com/prob/p147448
Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
*/
public class countHi {
    public static void main(String[] args) {
        String str="AHIBChi hi";
        int cnt=0;
        for (int i = 0; i <str.length()-1 ; i++) {
            if(str.substring(i,i+2).equalsIgnoreCase("hi"))cnt++;
            //System.out.println(str.substring(i,i+2));
        }
        System.out.println(cnt);
    }
}
