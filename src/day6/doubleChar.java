package day6;
// https://codingbat.com/prob/p165312
public class doubleChar {
    public static void main(String[] args) {
        String str="The";// -> TThhee
        String str2="";
        for (int i = 0; i <str.length() ; i++) {
            str2=str+str.substring(i,i+1);

        }

    }
}
