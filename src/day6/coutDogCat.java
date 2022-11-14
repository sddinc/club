package day6;
// https://codingbat.com/prob/p111624
public class coutDogCat {
    public static void main(String[] args) {
        String str="catdog";
        int cntCat = 0,cntDog=0;
        for (int i = 0; i <str.length()-2 ; i++) {
            if(str.substring(i,i+3).equals("cat"))cntCat++;
            if(str.substring(i,i+3).equals("dog"))cntDog++;
        }
        //ternary -> (condition) ? "true" :"false" ;
        System.out.println(cntCat==cntDog?"true":"false");

    }
}
